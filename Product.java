public class Product {

    protected String name;

    protected String brand;

    protected double price;

    private void processPrice(double price){
        if (price < 100){
            this.price = 250;
        }
        else{
            this.price = price;
        }
    }

    private void processName(String name){
        if (name == null || name.length() < 3){
            this.name = "<NAME>";
        }
        else{
            this.name = name;
        }
    }

    private void processBrand(String brand){
        if (brand == null || brand.length() < 3){
            this.brand = "<BRAND>";
        }
        else{
            this.brand = brand;
        }
    }

    public Product(String name, String brand, double price){
        processName(name);
        processBrand(brand);
        processPrice(price);
    }

    public Product(String name, double price){
        this(name, "<Brand>", price);
    }
    
    public Product(String name){
        this(name, 250);
    }   

    public Product()
    {
        this("<NAME>");
    }

    public String displayInfo(){
        return String.format("%s - %s - %.2f", name, brand, price);
    }

    public void setPrice(double price){
        processPrice(price);
    }

    public void setBrand(String brand) {
        processBrand(brand);
    }

    public void setName(String name) {
        processName(name);
    }
    
    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }
    
    public String getName() {
        return name;
    }
}
