package unitins.br.ecommerce.relogio.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import unitins.br.ecommerce.relogio.model.Venda;

@ApplicationScoped
public class VendaRepository implements PanacheRepository<Venda> {
    
}
