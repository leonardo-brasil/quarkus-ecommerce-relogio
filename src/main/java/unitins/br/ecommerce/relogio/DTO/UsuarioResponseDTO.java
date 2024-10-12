package unitins.br.ecommerce.relogio.DTO;

import unitins.br.ecommerce.relogio.model.Usuario;

public record UsuarioResponseDTO(
    Long id,
    String nome,
    String sobrenome,
    String email,
    String senha,
    TelefoneResponseDTO telefone,
    EnderecoResponseDTO endereco
) {

    public static UsuarioResponseDTO toDTO(Usuario usuario) {

        return new UsuarioResponseDTO(
            usuario.getId(),
            usuario.getNome(),
            usuario.getSobrenome(),
            usuario.getEmail(),
            usuario.getSenha(),
            TelefoneResponseDTO.toDTO(usuario.getTelefone()),
            EnderecoResponseDTO.toDTO(usuario.getEndereco())
        );

    }

}