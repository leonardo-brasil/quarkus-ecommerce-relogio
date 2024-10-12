package unitins.br.ecommerce.relogio.service;

import java.util.List;

import unitins.br.ecommerce.relogio.DTO.FuncionarioRequestDTO;
import unitins.br.ecommerce.relogio.DTO.FuncionarioResponseDTO;

public interface FuncionarioService {

    public FuncionarioResponseDTO create(FuncionarioRequestDTO dto);
    public List<FuncionarioResponseDTO> read();
    public void update(Long id, FuncionarioRequestDTO dto);
    public void delete(Long id);
    
}
