package es.santander.ascender;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SaludoTest {
    @Test
    // public void saludarConElNombreDiciendoHola (otra opcion)
        public void TestSaludar(){
            Saludo saludo= new Saludo();

            String resultado = saludo.saludar("Rodrigo");

            assertEquals("Hola Rodrigo", resultado);
        }
}
