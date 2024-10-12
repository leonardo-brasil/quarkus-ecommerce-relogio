package unitins.br.ecommerce.relogio.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import unitins.br.ecommerce.relogio.DTO.MarcaRequestDTO;

@Entity
public class Marca extends DefaultEntity {

    private String nome;
    private String descricao;
    private String fundador;
    private LocalDate dataFundacao;
    private String paisOrigem;

    public Marca() {}

    public Marca(String nome, String descricao, String fundador, LocalDate anoFundacao, String paisOrigem) {
        this.nome = nome;
        this.descricao = descricao;
        this.fundador = fundador;
        this.dataFundacao = anoFundacao;
        this.paisOrigem = paisOrigem;
    }

    public Marca(MarcaRequestDTO dto) {

        this.nome = dto.nome();
        this.descricao = dto.descricao();
        this.fundador = dto.fundador();
        this.dataFundacao = dto.dataFundacao();
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

    public LocalDate getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(LocalDate anoFundacao) {
        this.dataFundacao = anoFundacao;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public void absorv(MarcaRequestDTO dto) {

        this.nome = dto.nome();
        this.descricao = dto.descricao();
        this.fundador = dto.fundador();
        this.dataFundacao = dto.dataFundacao();
        this.paisOrigem = dto.paisOrigem();

    }
    
}
