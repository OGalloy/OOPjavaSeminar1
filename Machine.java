
import java.util.List;
 

public class Machine {
    protected List<Product> productsList; 
    public Machine(List<Product> productList){
        this.productsList = productList;
    }

    public Product getProductByName(String name){
        for (Product item: this.productsList){
            if (name.equals(item.getName())){
                return item;
            }
        }
        throw new IllegalStateException("Product not found");
    }
}