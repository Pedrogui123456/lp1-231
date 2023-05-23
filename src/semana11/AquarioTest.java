package semana11;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.Test;

public class AquarioTest {
   
    @Test
    public void testaCalcularVolume() {

        Aquario aquario = new Aquario();
        aquario.comprimento = 20.0;
        aquario.altura = 20.0;
        aquario.largura = 10.0;

        double volume = aquario.calcularVolume();

        assertEquals(4.0, volume);
    }

    @Test
    public void testaCalcularPotenciaDoTermostato() {

        Aquario aquario = new Aquario();
        aquario.comprimento = 20.0;
        aquario.altura = 20.0;
        aquario.largura = 10.0;
        double temperaturaDesejada = 32;
        double temperaturaAmbiente = 22;

        double potencia = aquario.calcularPotenciaDoTermostato(temperaturaDesejada, temperaturaAmbiente);

        assertEquals(2.0, potencia);
    }



    @Test 
    public void testaCalcularQuantidadeLitrosFiltro() {

        Aquario aquario = new Aquario();
        aquario.comprimento = 20.0;
        aquario.altura = 20.0;
        aquario.largura = 10.0;
        double [] esperado = {8.0, 12.0};

        double [] filtragem = aquario.calcularQuantidadeLitrosFiltro();

        assertArrayEquals(esperado, filtragem);
    }

}

