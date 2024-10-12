package unitins.br.ecommerce.relogio.service;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import unitins.br.ecommerce.relogio.DTO.FuncionarioRequestDTO;
import unitins.br.ecommerce.relogio.DTO.FuncionarioResponseDTO;
import unitins.br.ecommerce.relogio.model.Funcionario;
import unitins.br.ecommerce.relogio.repository.EnderecoRepository;
import unitins.br.ecommerce.relogio.repository.FuncionarioRepository;
import unitins.br.ecommerce.relogio.repository.TelefoneRepository;

@ApplicationScoped
public class FuncionarioServiceImp implements FuncionarioService {

    @Inject
    public FuncionarioRepository funcionarioRepository;

    @Inject
    public TelefoneRepository telefoneRepository;

    @Inject
    public EnderecoRepository enderecoRepository;

    @Transactional
    @Override
    public FuncionarioResponseDTO create(FuncionarioRequestDTO dto) {

        Funcionario funcionario = new Funcionario(dto);
        funcionarioRepository.persist(funcionario);
        return FuncionarioResponseDTO.toDTO(funcionario);

    }

    @Override
    public List<FuncionarioResponseDTO> read() {

        List<FuncionarioResponseDTO> lista = funcionarioRepository.listAll().stream().map(funcionario -> FuncionarioResponseDTO.toDTO(funcionario)).toList();
        return lista;

    }

    @Transactional
    @Override
    public void update(Long id, FuncionarioRequestDTO dto) {

        Funcionario funcionarioDB = funcionarioRepository.findById(id);
        funcionarioDB.absorv(dto);

    }

    @Transactional
    @Override
    public void delete(Long id) {

        funcionarioRepository.deleteById(id);

    }
    
}
