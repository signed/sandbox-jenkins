package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductionTests {
    @Test
    void theTest() {
        assertEquals(42, new Production().theQuestion());
    }
}