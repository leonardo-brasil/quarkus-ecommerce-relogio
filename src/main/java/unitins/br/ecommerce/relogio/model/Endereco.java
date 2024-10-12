package unitins.br.ecommerce.relogio.model;

import jakarta.persistence.Entity;
import unitins.br.ecommerce.relogio.DTO.EnderecoRequestDTO;

@Entity
public class Endereco extends DefaultEntity {
    
    private String cep;
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private String numero;
    private String complemento;

    public Endereco() {}

    public Endereco(String cep, String estado, String cidade, String bairro, String rua, String numero, String complemento) {

        this.cep = cep;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;

    }

    public Endereco(EnderecoRequestDTO dto) {

        this.cep = dto.cep();
        this.estado = dto.estado();
        this.cidade = dto.cidade();
        this.bairro = dto.bairro();
        this.rua = dto.rua();
        this.numero = dto.numero();
        this.complemento = dto.complemento();

    }

    public String getCep() {
        return cep;
    }
    
    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }
    
    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

}
