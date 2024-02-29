package ec.seguridaddigital.javacourse;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    @Test
    void getMessage_returnsCorrectMessage() {
        assertEquals("Hello, world", new Main().getMessage());
    }
}
