import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class DriverTest {

    private Driver conducteur;

    @BeforeEach
    public void setUp() {
        conducteur = new Driver("John", 20);
    }

    @Test
    public void testIsAdult() {
        assertThat(conducteur.isAdult()).isTrue();
    }
}
