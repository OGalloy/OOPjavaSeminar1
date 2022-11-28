import java.util.List;

//Класс Автомат горячих напитков(дочений класс bottle)
public class HotDrinksMachine extends BottleMachine{
    public HotDrinksMachine(List<Product> hotDrinksList){
        super(hotDrinksList);
    }

    public Product  getProduct(String name, Double volume, Integer temperature){
        for (Product item: productsList){
            if (name.equals(item.getName()) & volume.equals(((Bottle) item).getVolume()) & temperature.equals(((HotDrink) item).getTempreture())){
                return item;
            }
        }
        throw new IllegalStateException("Not found Hot Drink " + name );
    }
} 