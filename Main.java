
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Лист товаров
        List<Product> list = new ArrayList<Product>(
                Arrays.asList(
                        new Product("Mars", 100.0),
                        new Product("Twix", 50.2)));
        
        //Объект АвтоматТоваров
        Machine machine = new Machine(list);
        String key = "Twix";
        System.out.println(machine.getProductByName(key)+ " OK");

        //Лист напитков
        List<Product> listBottle = new ArrayList<Product>(
            Arrays.asList(
                new Bottle("Coca Cola", 10.5, 0.5),
                new Bottle("Sprite", 10.2, 0.7)
            )
        );
        
        //Объект Автомат напитков
        Machine bottleMachine = new BottleMachine(listBottle);
        String keyBottle = "Sprite";
        System.out.println(bottleMachine.getProductByName(keyBottle)+" OK");

        //Создаём лист горячих напитков
        List<Product> hotDrinksList = new ArrayList<Product>(Arrays.asList(
            new HotDrink("Cofe", 5.2, 0.3, 60 ),
            new HotDrink("Tea", 3.0, 0.4, 70 )
            )
        ); 
        
        //Создаём класс АвтоматГорячихНапитков
        HotDrinksMachine hdMachime = new HotDrinksMachine(hotDrinksList);
        String drinkName = "Tea";
        Double drinkVolume = 0.4;
        Integer drinkTemp = 70;
        
        //Выводим объект. если такой объект присутсвует в Автомате Горячих напитков
        System.out.println(hdMachime.getProduct(drinkName, drinkVolume, drinkTemp)+" OK");
    }

}
 