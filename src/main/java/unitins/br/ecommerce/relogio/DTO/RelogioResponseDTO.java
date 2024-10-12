package unitins.br.ecommerce.relogio.DTO;

import unitins.br.ecommerce.relogio.model.Relogio;

public record RelogioResponseDTO(
    Long id,
    String modelo,
    String material,
    Double preco,
    Double desconto,
    Integer estoque,
    MarcaResponseDTO marca
) {

    public static RelogioResponseDTO toDTO(Relogio relogio) {

        return new RelogioResponseDTO(
            relogio.getId(),
            relogio.getModelo(),
            relogio.getMaterial(),
            relogio.getPreco(),
            relogio.getDesconto(),
            relogio.getEstoque(),
            MarcaResponseDTO.toDTO(relogio.getMarca())
        );

    }

}