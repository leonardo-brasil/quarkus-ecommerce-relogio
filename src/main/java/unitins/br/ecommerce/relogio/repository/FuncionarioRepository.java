package unitins.br.ecommerce.relogio.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import unitins.br.ecommerce.relogio.model.Funcionario;

@ApplicationScoped
public class FuncionarioRepository implements PanacheRepository<Funcionario> {
    
}
