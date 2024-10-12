package unitins.br.ecommerce.relogio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
public class Fornecedor extends DefaultEntity {
    
    private String nome;
    private String cnpj;
    private String email;
    @OneToOne
    private Telefone telefone;
    @OneToOne
    private Endereco endereco;

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

}
