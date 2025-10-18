package ricardo.dev.api_rest.dto;

public class ProductInsertResult {
    private String productName; 
    private boolean inserted; 
    private String message; 
    public ProductInsertResult(){

    }
    
    public ProductInsertResult(String productName, boolean inserted, String message) {
        this.productName = productName;
        this.inserted = inserted;
        this.message = message;
    }

    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public boolean isInserted() {
        return inserted;
    }
    public void setInserted(boolean inserted) {
        this.inserted = inserted;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
  
    
}
