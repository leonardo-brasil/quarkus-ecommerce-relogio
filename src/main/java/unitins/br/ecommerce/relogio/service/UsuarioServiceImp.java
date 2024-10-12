package unitins.br.ecommerce.relogio.service;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import unitins.br.ecommerce.relogio.DTO.UsuarioRequestDTO;
import unitins.br.ecommerce.relogio.DTO.UsuarioResponseDTO;
import unitins.br.ecommerce.relogio.model.Usuario;
import unitins.br.ecommerce.relogio.repository.EnderecoRepository;
import unitins.br.ecommerce.relogio.repository.TelefoneRepository;
import unitins.br.ecommerce.relogio.repository.UsuarioRepository;

@ApplicationScoped
public class UsuarioServiceImp implements UsuarioService {

    @Inject
    public UsuarioRepository usuarioRepository;

    @Inject
    public TelefoneRepository telefoneRepository;

    @Inject
    public EnderecoRepository enderecoRepository;

    @Transactional
    @Override
    public UsuarioResponseDTO create(UsuarioRequestDTO dto) {

        Usuario usuario  = new Usuario(dto);
        usuarioRepository.persist(usuario);
        return UsuarioResponseDTO.toDTO(usuario);

    }

    @Override
    public List<UsuarioResponseDTO> read() {

        List<UsuarioResponseDTO> lista = usuarioRepository.listAll().stream().map(usuario -> UsuarioResponseDTO.toDTO(usuario)).toList();
        return lista;

    }

    @Transactional
    @Override
    public void update(Long id, UsuarioRequestDTO dto) {

        Usuario usuarioDB = usuarioRepository.findById(id);
        usuarioDB.absorv(dto);

    }

    @Transactional
    @Override
    public void delete(Long id) {

        usuarioRepository.deleteById(id);

    }
    
}
