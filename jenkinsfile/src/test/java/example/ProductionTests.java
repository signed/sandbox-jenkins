package example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductionTests {
    @Test
    void theTest(TestReporter testReporter) {
        testReporter.publishEntry("one", "thrown");
        assertEquals(42, new Production().theQuestion());
        testReporter.publishEntry("two", "catch");
    }
}