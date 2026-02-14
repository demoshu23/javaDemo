// src/test/java/MainTest.java
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testGreet() {
        // Calls the public static method in Main.java
        String result = Main.greet("Jenkins");
        assertEquals("Hello, Jenkins!", result);
    }
}
