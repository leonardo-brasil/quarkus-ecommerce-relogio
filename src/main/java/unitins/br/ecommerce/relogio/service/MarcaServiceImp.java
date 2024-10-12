package unitins.br.ecommerce.relogio.service;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import unitins.br.ecommerce.relogio.DTO.MarcaRequestDTO;
import unitins.br.ecommerce.relogio.DTO.MarcaResponseDTO;
import unitins.br.ecommerce.relogio.model.Marca;
import unitins.br.ecommerce.relogio.repository.MarcaRepository;

@ApplicationScoped
public class MarcaServiceImp implements MarcaService {

    @Inject
    public MarcaRepository marcaRepository;

    @Transactional
    @Override
    public MarcaResponseDTO create(MarcaRequestDTO dto) {

        Marca marca = new Marca(dto);
        marcaRepository.persist(marca);
        return MarcaResponseDTO.toDTO(marca);

    }

    @Override
    public List<MarcaResponseDTO> read() {

        List<MarcaResponseDTO> lista = marcaRepository.listAll().stream().map(marca -> MarcaResponseDTO.toDTO(marca)).toList();
        return lista;

    }
    
    @Transactional
    @Override
    public void update(Long id, MarcaRequestDTO dto) {

        Marca marcaDB = marcaRepository.findById(id);
        marcaDB.absorv(dto);
            
    }

    @Transactional
    @Override
    public void delete(Long id) {

        marcaRepository.deleteById(id);
        
    }
    
}
