package day02.labresult.cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {

    private String name;

    private int maxPrice;

    private List<Car> carsForSell = new ArrayList<>();

    public CarShop(String name, int maxPrice) {
        this.name = name;
        this.maxPrice = maxPrice;
    }


    public boolean addCar(Car car) {
        if (car.getPrice() > maxPrice) {
            return false;
        }
        carsForSell.add(car);
        return true;
    }

    public int sumCarPrice() {
        int sumPriceOfCars = 0;

        for (Car actualCar : carsForSell) {
            sumPriceOfCars += actualCar.getPrice();
        }
        return sumPriceOfCars;
    }

    public int numberOfCarsCheaperThan(int price) {
        int numberOfCheaperCars = 0;

        for (Car actualCar : carsForSell) {
            if (actualCar.getPrice() <= price) {
                numberOfCheaperCars++;
            }
        }
        return numberOfCheaperCars;
    }

    public List<Car> carsWithBrand(String brand) {
        List<Car> carsOfABand = new ArrayList<>();

        for (Car actualCar : carsForSell) {
            if (brand.equals(actualCar.getBrand())) {
                carsOfABand.add(actualCar);
            }
        }
        return carsOfABand;
    }

    public String getName() {
        return name;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public List<Car> getCarsForSell() {
        return carsForSell;
    }
}