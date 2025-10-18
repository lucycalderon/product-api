package ricardo.dev.api_rest.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import ricardo.dev.api_rest.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findByName(String name); 
}
