package ricardo.dev.api_rest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ricardo.dev.api_rest.dto.ProductInsertResult;
import ricardo.dev.api_rest.models.Product;
import ricardo.dev.api_rest.services.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public List<Product> getAll() {
        return service.findAll();
    }

    @PostMapping
    public List<ProductInsertResult> setProduct(@RequestBody List<Product> newProducts) {

        return service.add(newProducts);

    }

}
