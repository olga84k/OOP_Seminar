import Products.BootleOfWater;
import Products.GlasHotDrink;
import Products.Product;
import VendingMachines.VendingMachine;

public class seminar_1 {

    public static void main(String[] args) throws Exception { {
        Product item1 = new Product("Cola", 88.0);
        item1.setName("Cola");
        item1.setPrice(88.0);
        VendingMachine itemMachine = new VendingMachine(300);
        itemMachine.addProduct(item1);
        itemMachine.addProduct(new Product("Чипсы", 50.0));
        itemMachine.addProduct(new Product("Печенье", 60.0));
        itemMachine.addProduct(new Product("Шоколад", 90.0));
        itemMachine.addProduct(new Product("Орешки", 150.0));
        itemMachine.addProduct(new Product("Сухарики", 30.0));
        itemMachine.addProduct(new BootleOfWater("Вода", 120.0, 130));
        itemMachine.addProduct(new BootleOfWater("Лимонад", 120.0, 100));
        itemMachine.addProduct(new BootleOfWater("Cola", 100.0, 35));
        itemMachine.addProduct(new GlasHotDrink("Кофе", 100.0, 50, "70 градусов"));
        itemMachine.addProduct(new GlasHotDrink("Чай", 120.0, 150, "80 градусов"));
        itemMachine.addProduct(new GlasHotDrink("Горячий шоколад", 200.0, 150, "50 градусов"));


        for(Product prod: itemMachine.getProdAll())
        {
            System.out.println(prod.toString());
        }

    }
}
}