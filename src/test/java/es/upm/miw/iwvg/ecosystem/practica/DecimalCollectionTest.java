package es.upm.miw.iwvg.ecosystem.practica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecimalCollectionTest {

    private DecimalCollection decimalCollection;

    @BeforeEach
    void before() {
        this.decimalCollection = new DecimalCollection();
        this.decimalCollection.add(2.45);
        this.decimalCollection.add(5.69);
        this.decimalCollection.add(4.1);
    }

    @Test
    void testSize() { assertEquals(3, this.decimalCollection.size()); }

    @Test
    void testSum() { assertEquals(12.24, this.decimalCollection.sum(), 10e-5); }

    @Test
    void testHigher() { assertEquals(5.69, this.decimalCollection.higher(), 10e-5); }

    @Test
    void testLower() { assertEquals(2.45, this.decimalCollection.lower(), 10e-5);}

    @Test
    void testMedia() { assertEquals(4.08, this.decimalCollection.media(), 10e-5);}
}