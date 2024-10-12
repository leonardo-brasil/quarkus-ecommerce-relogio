package unitins.br.ecommerce.relogio.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import unitins.br.ecommerce.relogio.DTO.MarcaRequestDTO;

@Entity
public class Marca extends DefaultEntity {

    private String nome;
    private String descricao;
    private String fundador;
    private LocalDate anoFundacao;
    private String paisOrigem;

    public Marca() {}

    public Marca(String nome, String descricao, String fundador, LocalDate anoFundacao, String paisOrigem) {
        this.nome = nome;
        this.descricao = descricao;
        this.fundador = fundador;
        this.anoFundacao = anoFundacao;
        this.paisOrigem = paisOrigem;
    }

    public Marca(MarcaRequestDTO dto) {

        this.nome = dto.nome();
        this.descricao = dto.descricao();
        this.fundador = dto.fundador();
        this.anoFundacao = dto.anoFundacao();
        this.paisOrigem = dto.paisOrigem();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFundador() {
        return fundador;
    }

    public void setFundador(String fundador) {
        this.fundador = fundador;
    }

    public LocalDate getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(LocalDate anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    // Método que atualiza o objeto atual com as informações do DTO
    public void absorv(MarcaRequestDTO dto) {

        this.nome = dto.nome();
        this.descricao = dto.descricao();
        this.fundador = dto.fundador();
        this.anoFundacao = dto.anoFundacao();
        this.paisOrigem = dto.paisOrigem();

    }
    
}
