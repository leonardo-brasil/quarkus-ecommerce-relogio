package unitins.br.ecommerce.relogio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import unitins.br.ecommerce.relogio.DTO.RelogioRequestDTO;

@Entity
public class Relogio extends DefaultEntity {
    
    private String modelo;
    private String material;
    private Double preco;
    private Double desconto;
    private Integer estoque;
    private TipoRelogio tipoRelogio;
    @ManyToOne
    private Marca marca;

    public Relogio() {}

    public Relogio(String modelo, String material, Double preco, Double desconto, Integer estoque, TipoRelogio tipoRelogio, Marca marca) {

        this.modelo = modelo;
        this.material = material;
        this.preco = preco;
        this.desconto = desconto;
        this.estoque = estoque;
        this.tipoRelogio = tipoRelogio;
        this.marca = marca;

    }

    public Relogio(RelogioRequestDTO dto) {

        this.modelo = dto.modelo();
        this.material = dto.material();
        this.preco = dto.preco();
        this.desconto = dto.desconto();
        this.estoque = dto.estoque();
        this.tipoRelogio = dto.tipoRelogio();

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    public TipoRelogio getTipoRelogio() {
        return tipoRelogio;
    }

    public void setTipoRelogio(TipoRelogio tipoRelogio) {
        this.tipoRelogio = tipoRelogio;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void absorv(RelogioRequestDTO dto) {

        this.modelo = dto.modelo();
        this.material = dto.material();
        this.preco = dto.preco();
        this.desconto = dto.desconto();
        this.estoque = dto.estoque();
        this.tipoRelogio = dto.tipoRelogio();

    }

}
