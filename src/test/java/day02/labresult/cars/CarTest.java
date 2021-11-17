package day02.labresult.cars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testCreateCar() {

        Car car = new Car("Toyota", 1.2, Color.BLUE, 120);

        assertEquals("Toyota",car.getBrand());
        assertEquals(1.2,car.getEngineSize());
        assertEquals(Color.BLUE,car.getColorOfCar());
        assertEquals(120,car.getPrice());

    }

    @Test
    void decreasePrice() {

        Car car = new Car("Toyota", 1.2, Color.BLUE, 120);

        car.decreasePrice(10);

        assertEquals(108,car.getPrice());
    }
}