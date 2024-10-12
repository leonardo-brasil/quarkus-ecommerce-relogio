package unitins.br.ecommerce.relogio.model;

import jakarta.persistence.Entity;
import unitins.br.ecommerce.relogio.DTO.TelefoneRequestDTO;

@Entity
public class Telefone extends DefaultEntity {
    
    private String codigoArea;
    private String numero;

    public Telefone() {}

    public Telefone(String codigoArea, String numero) {

        this.codigoArea = codigoArea;
        this.numero = numero;

    }

    public Telefone(TelefoneRequestDTO dto) {

        this.codigoArea = dto.codigoArea();
        this.numero = dto.numero();

    }

    public String getCodigoArea() {
        return codigoArea;
    }

    public void setCodigoArea(String codigoArea) {
        this.codigoArea = codigoArea;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}
