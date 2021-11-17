package day02.labresult.cars;

public class Car {

    private String brand;

    private double engineSize;

    private Color colorOfCar;

    private int price;

    public Car(String manufacturer, double engineSize, Color colorOfCar, int price) {
        this.brand = manufacturer;
        this.engineSize = engineSize;
        this.colorOfCar = colorOfCar;
        this.price = price;
    }


    public void decreasePrice(int percent) {
        double decreasingValue = price * (percent / 100.0);
        price = (int) (price - decreasingValue);
    }

    public String getBrand() {
        return brand;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public Color getColorOfCar() {
        return colorOfCar;
    }

    public int getPrice() {
        return price;
    }
}
