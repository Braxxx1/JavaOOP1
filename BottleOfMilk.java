/**
 * BottleOfMilk
 */
public class BottleOfMilk extends Product{

    private double volume;

    private double fat;

    private void processVolume(double volume){
        if (volume < 500){
            this.volume = 500;
        }
        else{
            this.volume = volume;
        }
    }

    private void processFat(double fat){
        if (fat > 15 || fat < 3){
            this.fat = 10;
        }
        else{
            this.fat = fat;
        }
    }


    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        processFat(fat);
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        processVolume(volume);
    }

    public BottleOfMilk(String name, String brand, double price, double volume, double fat){
        super(name, brand, price);
        processVolume(volume);
        processFat(fat);
    }


    @Override
    public String displayInfo() {
        // TODO Auto-generated method stub
        return String.format("Бутылка с молоком \n\t[Наименование: %s\n\tПроизводитель: %s\n\tСтоимость: %.2f\n\tОбъём: %.2f\n\tЖирность: %.2f]", name, brand, price, volume, fat);
    }
}