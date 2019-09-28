package es.upm.miw.iwvg.ecosystem.practica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {
    private Point point;

    @BeforeEach
    void before() { point = new Point(4,5); }

    @Test
    void testModule() { assertEquals(6.4031, point.module(),10e-5); }

    @Test
    void testPhase() { assertEquals(0.8960, point.phase(), 10e-5); }

    @Test
    void testTranslateOrigin() {
        this.point.translateOrigin(new Point(1, 2));
        assertEquals(3, point.getX());
        assertEquals(3, point.getY());
    }

    @Test
    void testPointX() { assertEquals(4, point.getX()); }

    @Test
    void testPointY() { assertEquals(5, point.getY()); }

}