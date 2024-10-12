package unitins.br.ecommerce.relogio.DTO;

import unitins.br.ecommerce.relogio.model.TipoRelogio;

public record RelogioRequestDTO(
    String modelo,
    String material,
    TipoRelogio tipoRelogio,
    Double preco,
    Double desconto,
    Integer estoque,
    Long marcaID
) {
}
