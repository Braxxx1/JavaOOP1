public class BottleOfWater extends Product{
    
    private double volume;

    private void processVolume(double volume){
        if (volume < 0){
            this.volume = 0.5;
        }
        else{
            this.volume = volume;
        }
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        processVolume(volume);
    }

    public BottleOfWater(String name, String brand, double price, double volume){
        super(name, brand, price);
        processVolume(volume);
    }


    @Override
    public String displayInfo() {
        // TODO Auto-generated method stub
        return String.format("Бутылка с водой \n\t[Наименование: %s\n\tПроизводитель: %s\n\tСтоимость: %.2f\n\tОбъём: %.2f]", name, brand, price, volume);
    }
}
