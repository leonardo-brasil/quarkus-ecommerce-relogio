package unitins.br.ecommerce.relogio.DTO;

import unitins.br.ecommerce.relogio.model.Fornecedor;

public record FornecedorResponseDTO(
    Long id,
    String nome,
    String cnpj,
    String email,
    TelefoneResponseDTO telefone,
    EnderecoResponseDTO endereco
) {

    public static FornecedorResponseDTO toDTO(Fornecedor fornecedor) {

        return new FornecedorResponseDTO(
            fornecedor.getId(),
            fornecedor.getNome(),
            fornecedor.getCnpj(),
            fornecedor.getEmail(),
            TelefoneResponseDTO.toDTO(fornecedor.getTelefone()),
            EnderecoResponseDTO.toDTO(fornecedor.getEndereco())
        );

    }

}