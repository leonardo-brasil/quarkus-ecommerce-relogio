package unitins.br.ecommerce.relogio.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import unitins.br.ecommerce.relogio.DTO.FornecedorRequestDTO;

@Entity
public class Fornecedor extends DefaultEntity {
    
    private String nome;
    private String cnpj;
    private String email;
    @OneToOne(cascade = CascadeType.ALL)
    private Telefone telefone;
    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

    public Fornecedor() {}

    public Fornecedor(String nome, String cnpj, String email, Telefone telefone, Endereco endereco) {

        this.nome = nome;
        this.cnpj = cnpj;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;

    }

    public Fornecedor(FornecedorRequestDTO dto) {

        this.nome = dto.nome();
        this.cnpj = dto.cnpj();
        this.email = dto.email();
        this.telefone = new Telefone(dto.telefone());
        this.endereco = new Endereco(dto.endereco());

    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void absorv(FornecedorRequestDTO dto) {

        this.nome = dto.nome();
        this.cnpj = dto.cnpj();
        this.email = dto.email();
        this.telefone = new Telefone(dto.telefone());
        this.endereco = new Endereco(dto.endereco());

    }

}
