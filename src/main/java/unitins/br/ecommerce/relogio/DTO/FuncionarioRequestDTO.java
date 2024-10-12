package unitins.br.ecommerce.relogio.DTO;

public record FuncionarioRequestDTO(
    String nome,
    String sobrenome,
    String email,
    String senha,
    TelefoneRequestDTO telefone,
    EnderecoRequestDTO endereco
) {
}