import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testGreet() {
        String result = Main.greet("Jenkins");
        assertEquals("Hello, Jenkins!", result);
    }
}
