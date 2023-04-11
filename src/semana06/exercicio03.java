package semana06;

public class exercicio03 {
    import org.junit.Assert;
import org.junit.Test;

public class Ex03Test {

    @Test
    public void testCalcularVolumeAquario() {
        // Teste para o método de cálculo de volume do aquário
        double comprimento = 50.0;
        double altura = 30.0;
        double largura = 20.0;
        double expectedVolume = 30000.0;
        double calculatedVolume = Ex01.calcularVolumeAquario(comprimento, altura, largura);
        Assert.assertEquals(expectedVolume, calculatedVolume, 0.001);
    }

    @Test
    public void testCalcularPotenciaTermostato() {
        // Teste para o método de cálculo de potência do termostato
        double volumeAquario = 30000.0;
        double expectedPotencia = 150.0;
        double calculatedPotencia = Ex01.calcularPotenciaTermostato(volumeAquario);
        Assert.assertEquals(expectedPotencia, calculatedPotencia, 0.001);
    }

    @Test
    public void testCalcularFiltragemPorHora() {
        // Teste para o método de cálculo de filtragem por hora
        double volumeAquario = 30000.0;
        double expectedFiltragem = 600.0;
        double calculatedFiltragem = Ex01.calcularFiltragemPorHora(volumeAquario);
        Assert.assertEquals(expectedFiltragem, calculatedFiltragem, 0.001);
    }

    @Test
    public void testCalcularIMC() {
        // Teste para o método de cálculo de IMC
        double peso = 70.0;
        double altura = 1.75;
        double expectedIMC = 22.857;
        double calculatedIMC = Ex02.calcularIMC(peso, altura);
        Assert.assertEquals(expectedIMC, calculatedIMC, 0.001);
    }

    @Test
    public void testClassificarIMC() {
        // Teste para o método de classificação de IMC
        double imc = 22.857;
        String expectedClassificacao = "Peso normal";
        String calculatedClassificacao = Ex02.classificarIMC(imc);
        Assert.assertEquals(expectedClassificacao, calculatedClassificacao);
    }

    @Test
    public void testCalcularPesoIdeal() {
        // Teste para o método de cálculo de peso ideal
        double peso = 70.0;
        double altura = 1.75;
        double expectedPesoIdeal = 62.067;
        double calculatedPesoIdeal = Ex02.calcularPesoIdeal(peso, altura);
        Assert.assertEquals(expectedPesoIdeal, calculatedPesoIdeal, 0.001);
    }
}

}
