import java.util.ArrayList;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        // Product product1 = new Product();
        // System.out.println(product1.displayInfo());

        BottleOfWater bottleOfWater1 = new BottleOfWater("Name2", null, 0, 5);
        // System.out.println(bottleOfWater1.displayInfo());

        Product bottleOfWater2 = new BottleOfWater(null, null, 0, 0);
        // System.out.println(bottleOfWater2.displayInfo());

        BottleOfMilk bottleOfMilk1 = new BottleOfMilk(null, null, 0, 0, 0);
        // System.out.println(bottleOfMilk1.displayInfo());

        Product bottleOfMilk2 = new BottleOfMilk(null, null, 0, 0, 0);
        // System.out.println(bottleOfMilk2.displayInfo());
        Product chocolateBar1 = new ChocolateBar("Ягодный микс", null, 0, 120);

        ArrayList<Product> list = new ArrayList<>();
        list.add(bottleOfMilk2);
        list.add(bottleOfWater2);
        list.add(bottleOfMilk1);
        list.add(bottleOfWater1);
        list.add(chocolateBar1);

        VendingMachine vendingMachine = new VendingMachine(list);

        BottleOfWater bottleOfWaterRes = vendingMachine.getBottleOfWater("Name2", 5);
        if (bottleOfWaterRes != null){
            System.out.println("Вы купили: ");
            System.out.println(bottleOfWaterRes.displayInfo());
        }
        else{
            System.out.println("Такой бутылки нет!");
        }

        ChocolateBar chocolateBarRes = vendingMachine.getChocolateBar("Ягодный микс", 120);
        if (chocolateBarRes != null){
            System.out.println("Вы купили: ");
            System.out.println(chocolateBarRes.displayInfo());
        }
        else{
            System.out.println("Такой шоколадки нет!");
        }
    }
}