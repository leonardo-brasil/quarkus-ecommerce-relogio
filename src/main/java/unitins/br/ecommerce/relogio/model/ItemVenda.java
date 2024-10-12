package unitins.br.ecommerce.relogio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class ItemVenda extends DefaultEntity {
    
    private Double preco;
    private Integer quantidade;
    @ManyToOne
    private Relogio relogio;

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Relogio getRelogio() {
        return relogio;
    }

    public void setRelogio(Relogio relogio) {
        this.relogio = relogio;
    }

}
