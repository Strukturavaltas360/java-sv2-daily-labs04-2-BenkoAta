package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaneTest {
    @Test
    void testPlane() {
        Plane plane = new Plane(10);
        Passanger passanger = new Passanger("Teszt", "Ticket", 2);
        for (int i = 0; i < 10; i++) {
            assertTrue(plane.addPassanger(passanger));
        }
        assertFalse(plane.addPassanger(passanger));
        assertEquals(20, plane.numberOfPackages());
    }

}