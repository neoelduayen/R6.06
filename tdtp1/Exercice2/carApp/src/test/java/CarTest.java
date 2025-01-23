import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    private Car car;
    private Driver driver;

    @BeforeEach
    public void setUp() {
        car = new Car("Sedan", "Bleu");
    }

    @Test
    public void testAccelerate() {
        car.accelerate();
        assertThat(car.getSpeed()).isEqualTo(10);
    }

    @Test
    public void testSlowDown() {
        car.accelerate();
        car.slowDown();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    public void testStartCar() {
        Car car = new Car("Sedan", "Bleu");
        car.startCar(driver);
        // How to assert that the demarrerVoiture method was called?
    }

    @Test
    public void testStopCar() {
        Car car = new Car("Sedan", "Blue");
        car.stopCar(driver);
        // How to assert that the arreterVoiture method was called?
    }

    @Test
    public void testChangeSpeed() {
        Car car = new Car("Sedan", "Blue");

        car.changeSpeed(80, driver);
        assertThat(car.getSpeed()).isEqualTo(80);
    }
}
