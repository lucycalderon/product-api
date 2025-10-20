package ricardo.dev.api_rest.services;

import org.springframework.stereotype.Service;

import ricardo.dev.api_rest.dto.ProductInsertResult;
import ricardo.dev.api_rest.models.Product;
import ricardo.dev.api_rest.repositories.ProductRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public List<Product> findAll() {
        return repo.findAll();
    }

    public Product save(Product product) {
        return repo.save(product);
    }

    public List<ProductInsertResult> add(List<Product> newProducts) {
        List<ProductInsertResult> results = new ArrayList<>();
        for (Product product : newProducts) {
            boolean exists = repo.findByName(product.getName()).isPresent();
            if (exists)
                results.add(new ProductInsertResult(product.getName(), false, "Already exists"));
            else {
                repo.save(product);
                results.add(new ProductInsertResult(product.getName(), true, "Inserted"));
            }
        }

        return results;
    }

    public void deleteProduct(Long id) {
        if (!repo.existsById(id)) {

        }
        repo.deleteById(id);
    }
}
