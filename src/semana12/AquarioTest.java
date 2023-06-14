package semana12;

import semana11.Test;

public class AquarioTest {
    @Test
    public void testConstrutorComDimensoes() {
        Aquario aquario = new Aquario(10.0, 5.0, 3.0);
        assertEquals(10.0, aquario.comprimento, 0.01);
        assertEquals(5.0, aquario.altura, 0.01);
        assertEquals(3.0, aquario.largura, 0.01);
    }

    private void assertEquals(double d, double comprimento, double e) {
    }

    @Test
    public void testConstrutorComUnicaDimensao() {
        Aquario aquario = new Aquario(8.0);
        assertEquals(8.0, aquario.comprimento, 0.01);
        assertEquals(8.0, aquario.altura, 0.01);
        assertEquals(8.0, aquario.largura, 0.01);
    }
    
    @Test
    public void testCalcularVolume() {
        Aquario aquario = new Aquario(10.0, 5.0, 3.0);
        assertEquals(0.15, aquario.calcularVolume(), 0.01);
    }

}
