public class ChocolateBar extends Product{
    
    private double calories;

    private void processCalories(double calories){
        if (calories < 0){
            this.calories = 100;
        }
        else{
            this.calories = calories;
        }
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        processCalories(calories);
    }

    public ChocolateBar(String name, String brand, double price, double calories){
        super(name, brand, price);
        processCalories(calories);
    }


    @Override
    public String displayInfo() {
        // TODO Auto-generated method stub
        return String.format("Плитка Шоколада \n\t[Наименование: %s\n\tПроизводитель: %s\n\tСтоимость: %.2f\n\tКалории: %.2f]", name, brand, price, calories);
    }
}
