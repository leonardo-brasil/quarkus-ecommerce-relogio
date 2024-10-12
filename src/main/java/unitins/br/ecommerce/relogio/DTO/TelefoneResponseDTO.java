package unitins.br.ecommerce.relogio.DTO;

import unitins.br.ecommerce.relogio.model.Telefone;

public record TelefoneResponseDTO(
    Long id,
    String codigoArea,
    String numero
) {

    public static TelefoneResponseDTO toDTO(Telefone telefone) {

        return new TelefoneResponseDTO(
            telefone.getId(),
            telefone.getCodigoArea(),
            telefone.getNumero()
        );

    }

}