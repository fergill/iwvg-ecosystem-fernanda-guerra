package es.upm.miw.iwvg.ecosystem.practica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}