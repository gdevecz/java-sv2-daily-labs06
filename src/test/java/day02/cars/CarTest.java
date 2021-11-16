package day02.cars;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void decreasePrice() {
        Car car1 = new Car("Toyota", 1.2, Color.BLACK, 2_300_000);
        Car car2 = new Car("Lamborghini", 5.2, Color.BLACK, 10_300_000);

        car1.decreasePrice(10);
        assertEquals(2070000,car1.getPrice());
    }
}