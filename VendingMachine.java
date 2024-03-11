import java.util.List;


public class VendingMachine {
    
    private List<Product> products;

    public VendingMachine(List<Product> products){
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(String name, double volume){
        for (Product product: products){
            if (product instanceof BottleOfWater){
                BottleOfWater bottleOfWater = (BottleOfWater)product;
                if (bottleOfWater.getVolume() == volume && bottleOfWater.getName().equals(name)){
                    return bottleOfWater;
                }
            }
        }
        return null;
    }

    public ChocolateBar getChocolateBar(String name, double calories){
        for (Product product: products){
            if (product instanceof ChocolateBar){
                ChocolateBar chocolateBar = (ChocolateBar)product;
                if (chocolateBar.getCalories() == calories && chocolateBar.getName().equals(name)){
                    return chocolateBar;
                }
            }
        }
        return null;
    }
}
