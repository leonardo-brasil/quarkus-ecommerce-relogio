package unitins.br.ecommerce.relogio.service;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import unitins.br.ecommerce.relogio.DTO.RelogioRequestDTO;
import unitins.br.ecommerce.relogio.DTO.RelogioResponseDTO;
import unitins.br.ecommerce.relogio.model.Marca;
import unitins.br.ecommerce.relogio.model.Relogio;
import unitins.br.ecommerce.relogio.repository.MarcaRepository;
import unitins.br.ecommerce.relogio.repository.RelogioRepository;

@ApplicationScoped
public class RelogioServiceImp implements RelogioService {

    @Inject
    public MarcaRepository marcaRepository;

    @Inject
    public RelogioRepository relogioRepository;

    @Transactional
    @Override
    public RelogioResponseDTO create(RelogioRequestDTO dto) {

        Marca marca = marcaRepository.findById(dto.marcaID());
        Relogio relogio = new Relogio(dto);
        relogio.setMarca(marca);
        relogioRepository.persist(relogio);
        return RelogioResponseDTO.toDTO(relogio);

    }

    @Override
    public List<RelogioResponseDTO> read() {

        List<RelogioResponseDTO> lista = relogioRepository.listAll().stream().map(relogio -> RelogioResponseDTO.toDTO(relogio)).toList();
        return lista;

    }

    @Transactional
    @Override
    public void update(Long id, RelogioRequestDTO dto) {

        Relogio relogioDB = relogioRepository.findById(id);
        relogioDB.absorv(dto);
        relogioDB.setMarca(marcaRepository.findById(dto.marcaID()));

    }

    @Transactional
    @Override
    public void delete(Long id) {

        relogioRepository.deleteById(id);

    }
    
}
