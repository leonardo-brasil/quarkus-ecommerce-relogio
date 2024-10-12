package unitins.br.ecommerce.relogio.DTO;

public record UsuarioRequestDTO(
    String nome,
    String sobrenome,
    String email,
    String senha,
    TelefoneRequestDTO telefone,
    EnderecoRequestDTO endereco
) {
}