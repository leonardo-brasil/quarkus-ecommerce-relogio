package unitins.br.ecommerce.relogio.DTO;

public record FornecedorRequestDTO(
    String nome,
    String cnpj,
    String email,
    TelefoneRequestDTO telefone,
    EnderecoRequestDTO endereco
) {
}
