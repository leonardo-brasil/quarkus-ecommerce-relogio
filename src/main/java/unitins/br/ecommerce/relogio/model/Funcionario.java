package unitins.br.ecommerce.relogio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
public class Funcionario extends DefaultEntity {
    
    private String nome;
    private String sobrenome;
    private String email;
    private String senha;
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

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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
