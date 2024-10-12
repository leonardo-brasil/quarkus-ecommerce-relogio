package unitins.br.ecommerce.relogio.service;

import java.util.List;

import unitins.br.ecommerce.relogio.DTO.UsuarioRequestDTO;
import unitins.br.ecommerce.relogio.DTO.UsuarioResponseDTO;

public interface UsuarioService {

    public UsuarioResponseDTO create(UsuarioRequestDTO dto);
    public List<UsuarioResponseDTO> read();
    public void update(Long id, UsuarioRequestDTO dto);
    public void delete(Long id);
    
}