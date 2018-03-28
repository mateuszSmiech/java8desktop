package pl.msmiech.java8desktop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {

    private Point pointZero;

    @BeforeEach
    void setup() {
        pointZero = new Point(0, 0);
    }

    @Test
    void distanceToAllPointsAre0() {
        double result = pointZero.distanceTo(new Point(0, 0));

        assertEquals(0, result);
    }

    @Test
    public void distanceToOnePointEquals0() {
        double result = pointZero.distanceTo(new Point(100, 100));

        double x = (100 - 0) * Math.cos((0 + 100) / 2);
        double y = (100 - 0);
        double d = Math.sqrt(x * x + y * y) * 6371;

        assertEquals(d, result);
    }

}