package unitins.br.ecommerce.relogio.DTO;

public record EnderecoRequestDTO(
    String cep,
    String estado,
    String cidade,
    String bairro,
    String rua,
    String numero,
    String complemento
) {
}