package unitins.br.ecommerce.relogio.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import unitins.br.ecommerce.relogio.model.Pagamento;

@ApplicationScoped
public class PagamentoRepository implements PanacheRepository<Pagamento> {
    
}
