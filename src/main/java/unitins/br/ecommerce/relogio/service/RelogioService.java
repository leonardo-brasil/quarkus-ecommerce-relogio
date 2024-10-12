package unitins.br.ecommerce.relogio.service;

import java.util.List;

import unitins.br.ecommerce.relogio.DTO.RelogioRequestDTO;
import unitins.br.ecommerce.relogio.DTO.RelogioResponseDTO;

public interface RelogioService {

    public RelogioResponseDTO create(RelogioRequestDTO dto);
    public List<RelogioResponseDTO> read();
    public void update(Long id, RelogioRequestDTO dto);
    public void delete(Long id);
    
}