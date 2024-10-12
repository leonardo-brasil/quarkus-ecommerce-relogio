package unitins.br.ecommerce.relogio.model;

import java.time.LocalDate;
import java.util.ArrayList;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Pedido extends DefaultEntity {

    private Double valorTotal;
    private LocalDate data;
    @ManyToOne
    private Fornecedor fornecedor;
    @OneToMany(cascade = CascadeType.ALL)
    private ArrayList<ItemPedido> itensPedido;
    @OneToOne(cascade = CascadeType.ALL)
    private Pagamento pagamento;

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

    public ArrayList<ItemPedido> getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(ArrayList<ItemPedido> itensPedido) {
        this.itensPedido = itensPedido;
    }
    
}
