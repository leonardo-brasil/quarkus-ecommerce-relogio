package unitins.br.ecommerce.relogio.DTO;

import java.time.LocalDate;

import unitins.br.ecommerce.relogio.model.Marca;

public record MarcaResponseDTO(
    Long id,
    String nome,
    String descricao,
    String fundador,
    LocalDate dataFundacao,
    String paisOrigem
) {

    public static MarcaResponseDTO toDTO(Marca marca) {
        return new MarcaResponseDTO(
            marca.getId(),
            marca.getNome(),
            marca.getDescricao(),
            marca.getFundador(),
            marca.getDataFundacao(),
            marca.getPaisOrigem()
        );
    }

}
