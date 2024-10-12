package unitins.br.ecommerce.relogio.service;

import java.util.List;

import unitins.br.ecommerce.relogio.DTO.FornecedorRequestDTO;
import unitins.br.ecommerce.relogio.DTO.FornecedorResponseDTO;

public interface FornecedorService {

    public FornecedorResponseDTO create(FornecedorRequestDTO dto);
    public List<FornecedorResponseDTO> read();
    public void update(Long id, FornecedorRequestDTO dto);
    public void delete(Long id);
    
}