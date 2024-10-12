package unitins.br.ecommerce.relogio.model;

import java.time.LocalDate;
import java.util.ArrayList;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Venda extends DefaultEntity {
    
    private Double valorTotal;
    private LocalDate data;
    @ManyToOne
    private Usuario usuario;
    @OneToOne(cascade = CascadeType.ALL)
    private Pagamento pagamento;
    @OneToMany(cascade = CascadeType.ALL)
    private ArrayList<ItemVenda> itensVenda;

    public Double getValorTotal() {
        return valorTotal;
    }
    
    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public ArrayList<ItemVenda> getItensVenda() {
        return itensVenda;
    }

    public void setItensVenda(ArrayList<ItemVenda> itensVenda) {
        this.itensVenda = itensVenda;
    }

}
