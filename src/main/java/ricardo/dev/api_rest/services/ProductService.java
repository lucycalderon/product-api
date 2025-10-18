package ricardo.dev.api_rest.services;

import org.springframework.stereotype.Service;
import ricardo.dev.api_rest.models.Product;
import ricardo.dev.api_rest.repositories.ProductRepository;
import java.util.List;
@Service
public class ProductService {
    private final ProductRepository repo; 
    public ProductService(ProductRepository repo){
        this.repo = repo;
    }

    public List<Product> findAll(){
        return repo.findAll(); 
    }
    public Product save(Product product){
        return repo.save(product); 
    }
    public Product add(Product newProduct){
        return repo.save(newProduct); 
    }
}
