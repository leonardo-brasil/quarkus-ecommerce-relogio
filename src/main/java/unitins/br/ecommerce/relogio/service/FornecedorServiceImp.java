package unitins.br.ecommerce.relogio.service;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import unitins.br.ecommerce.relogio.DTO.FornecedorRequestDTO;
import unitins.br.ecommerce.relogio.DTO.FornecedorResponseDTO;
import unitins.br.ecommerce.relogio.model.Fornecedor;
import unitins.br.ecommerce.relogio.repository.EnderecoRepository;
import unitins.br.ecommerce.relogio.repository.FornecedorRepository;
import unitins.br.ecommerce.relogio.repository.TelefoneRepository;

@ApplicationScoped
public class FornecedorServiceImp implements FornecedorService {
    
    @Inject
    public FornecedorRepository fornecedorRepository;

    @Inject
    public TelefoneRepository telefoneRepository;

    @Inject
    public EnderecoRepository enderecoRepository;

    @Transactional
    @Override
    public FornecedorResponseDTO create(FornecedorRequestDTO dto) {

        Fornecedor fornecedor = new Fornecedor(dto);
        fornecedorRepository.persist(fornecedor);
        return FornecedorResponseDTO.toDTO(fornecedor);

    }

    @Override
    public List<FornecedorResponseDTO> read() {

        List<FornecedorResponseDTO> lista = fornecedorRepository.listAll().stream().map(fornecedor -> FornecedorResponseDTO.toDTO(fornecedor)).toList();
        return lista;

    }

    @Transactional
    @Override
    public void update(Long id, FornecedorRequestDTO dto) {

        Fornecedor fornecedorDB = fornecedorRepository.findById(id);
        fornecedorDB.absorv(dto);

    }

    @Transactional
    @Override
    public void delete(Long id) {

        fornecedorRepository.deleteById(id);

    }

}
