package unitins.br.ecommerce.relogio.DTO;

import java.time.LocalDate;

public record MarcaRequestDTO(
    String nome,
    String descricao,
    String fundador,
    LocalDate dataFundacao,
    String paisOrigem
) {

}
