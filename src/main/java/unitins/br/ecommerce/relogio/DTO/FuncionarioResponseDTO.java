package unitins.br.ecommerce.relogio.DTO;

import unitins.br.ecommerce.relogio.model.Funcionario;

public record FuncionarioResponseDTO(
    Long id,
    String nome,
    String sobrenome,
    String email,
    String senha,
    TelefoneResponseDTO telefone,
    EnderecoResponseDTO endereco
) {

    public static FuncionarioResponseDTO toDTO(Funcionario funcionario) {

        return new FuncionarioResponseDTO(
            funcionario.getId(),
            funcionario.getNome(),
            funcionario.getSobrenome(),
            funcionario.getEmail(),
            funcionario.getSenha(),
            TelefoneResponseDTO.toDTO(funcionario.getTelefone()),
            EnderecoResponseDTO.toDTO(funcionario.getEndereco())
        );

    }

}