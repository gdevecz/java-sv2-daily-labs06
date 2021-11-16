package day02.cars;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarShopTest {

    CarShop carShop = new CarShop("Best Car", 10_000_000);
    @BeforeEach
    void init() {
        Car car1 = new Car("Toyota", 1.2, Color.BLACK, 2_300_000);
        Car car2 = new Car("Lamborghini", 5.2, Color.BLACK, 10_300_000);
        Car car3 = new Car("Suzuki", 1.4, Color.RED, 1_500_000);
        Car car4 = new Car("Toyota", 1.4, Color.GREY, 2_700_000);
        carShop.addCar(car1);
        carShop.addCar(car2);
        carShop.addCar(car3);
        carShop.addCar(car4);
        car1.decreasePrice(10);
    }

    @Test
    void testCreate() {

        assertEquals("Best Car", carShop.getName());
        assertEquals(10_000_000, carShop.getMaxPrice());
    }

    @Test
    void testAddCar() {
        assertEquals(3, carShop.getCarsForSell().size());
        Car car1 = new Car("Toyota", 1.2, Color.BLACK, 2_300_000);
        Car car2 = new Car("Lamborghini", 5.2, Color.BLACK, 10_300_000);

        assertEquals(true, carShop.addCar(car1));
        assertEquals(false, carShop.addCar(car2));
        assertEquals(4, carShop.getCarsForSell().size());
    }


    @Test
    void testSumCars() {

        assertEquals(6270000, carShop.sumCarPrice());
    }

    @Test
    void testNumberOfCarsCheaperThan() {
        assertEquals(1,carShop.numberOfCarsCheaperThan(2_000_000));
        assertEquals(0,carShop.numberOfCarsCheaperThan(1_000_000));
    }

    @Test
    void testCarsWithBrand() {

        assertEquals(2,carShop.carsWithBrand("Toyota").size());
        assertEquals(0,carShop.carsWithBrand("BMW").size());
    }
}