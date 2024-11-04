package es.santander.ascender;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class pepeTest {
    @Test
    public void testSumar(){
        pepe sut = new pepe();
        assertTrue(sut.sumar(4, 3) == 7);
    }
}
