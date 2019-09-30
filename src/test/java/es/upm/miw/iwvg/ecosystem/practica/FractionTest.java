package es.upm.miw.iwvg.ecosystem.practica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionTest {
    private Fraction fraction;

    @BeforeEach
    void before() { fraction = new Fraction(12, 2); }

    @Test
    void testDecimal() { assertEquals(6, fraction.decimal()); }

    @Test
    void testGetNumerator() { assertEquals(12, fraction.getNumerator()); }

    @Test
    void testGetDenominator() { assertEquals(2, fraction.getDenominator()); }

    @Test
    void testIsProper() { assertEquals(false, fraction.isProper()); }

    @Test
    void testIsImproper() { assertEquals(true, fraction.isImproper()); }

    @Test
    public void testIsEquivalent() {
        assertTrue(fraction.isEquivalent(new Fraction(24,4)));
        assertFalse(fraction.isEquivalent(new Fraction(3,5)));
    }

    @Test
    public void testSumFractions() {
        Fraction fraction2 = new Fraction(2,4);
        fraction.sumFractions(fraction2);
        assertEquals(52, fraction.getNumerator());
        assertEquals(8, fraction.getDenominator());
    }
}