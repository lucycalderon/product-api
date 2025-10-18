package ricardo.dev.api_rest.models;
import jakarta.persistence.*;


@Entity
@Table(name="products")
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
    private String name; 
    private double prince;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrince() {
        return prince;
    }
    public void setPrince(double prince) {
        this.prince = prince;
    } 
    
}
