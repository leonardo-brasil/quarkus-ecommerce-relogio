package unitins.br.ecommerce.relogio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import unitins.br.ecommerce.relogio.DTO.FuncionarioRequestDTO;

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

    public Funcionario() {}

    public Funcionario(String nome, String sobrenome, String email, String senha, Telefone telefone, Endereco endereco) {
    
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.endereco = endereco;

    }

    public Funcionario(FuncionarioRequestDTO dto) {

        this.nome = dto.nome();
        this.sobrenome = dto.sobrenome();
        this.email = dto.email();
        this.senha = dto.senha();
        this.telefone = new Telefone(dto.telefone());
        this.endereco = new Endereco(dto.endereco());

    }

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

    public void absorv(FuncionarioRequestDTO dto) {

        this.nome = dto.nome();
        this.sobrenome = dto.sobrenome();
        this.email = dto.email();
        this.senha = dto.senha();
        this.telefone = new Telefone(dto.telefone());
        this.endereco = new Endereco(dto.endereco());

    }

}
