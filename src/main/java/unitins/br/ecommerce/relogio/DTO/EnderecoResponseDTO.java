package unitins.br.ecommerce.relogio.DTO;

import unitins.br.ecommerce.relogio.model.Endereco;

public record EnderecoResponseDTO(
    Long id,
    String cep,
    String estado,
    String cidade,
    String bairro,
    String rua,
    String numero,
    String complemento
) {

    public static EnderecoResponseDTO toDTO(Endereco endereco) {

        return new EnderecoResponseDTO(
            endereco.getId(),
            endereco.getCep(),
            endereco.getEstado(),
            endereco.getCidade(),
            endereco.getBairro(),
            endereco.getRua(),
            endereco.getNumero(),
            endereco.getComplemento()
        );

    }

}