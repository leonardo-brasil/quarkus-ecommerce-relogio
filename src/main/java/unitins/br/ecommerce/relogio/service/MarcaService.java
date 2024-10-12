package unitins.br.ecommerce.relogio.service;

import java.util.List;

import unitins.br.ecommerce.relogio.DTO.MarcaRequestDTO;
import unitins.br.ecommerce.relogio.DTO.MarcaResponseDTO;

public interface MarcaService {

    public MarcaResponseDTO create(MarcaRequestDTO dto);
    public List<MarcaResponseDTO> read();
    public void update(Long id, MarcaRequestDTO dto);
    public void delete(Long id);

}
