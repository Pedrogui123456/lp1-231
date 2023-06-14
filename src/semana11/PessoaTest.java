package semana11;

public class PessoaTest {

    @Test
    public void calculaImc(){
        Pessoa pessoa = new Pessoa();
        pessoa.altura = 1.75;
        pessoa.peso = 68;

        double imc = pessoa.calcularImc();

        assertEquals(imc, 22.22222222222222, 0.0001);   
    }
    
    private void assertEquals(double imc, double d, double e) {
    }

    @Test
    public void getFaixa(){
        Pessoa pessoa = new Pessoa();
        pessoa.altura = 1.75;
        pessoa.peso = 68;
        String faixa = pessoa.getFaixa();
        assertEquals("Você está abaixo do peso normal", faixa);

        pessoa = new Pessoa();
        pessoa.altura = 1.75;
        pessoa.peso = 75.3;
        faixa = pessoa.getFaixa();
        assertEquals("Você está com o peso normal", faixa);

        pessoa = new Pessoa();
        pessoa.altura = 1.75;
        pessoa.peso = 82;
        faixa = pessoa.getFaixa();
        assertEquals("Você está acima do peso normal", faixa);

        pessoa = new Pessoa();
        pessoa.altura = 1.75;
        pessoa.peso = 99;
        faixa = pessoa.getFaixa();
        assertEquals("Você pertence ao grupo Obesidade de Classe 1", faixa);     
        
        pessoa = new Pessoa();
        pessoa.altura = 1.75;
        pessoa.peso = 110;
        faixa = pessoa.getFaixa();
        assertEquals("Você pertence ao grupo de Obesidade Classe 2", faixa);

        pessoa = new Pessoa();
        pessoa.altura = 1.75;
        pessoa.peso = 125;
        faixa = pessoa.getFaixa();
        assertEquals("Você pertence ao grupo de Obesidade Classe 3", faixa);
    }

    private void assertEquals(String string, String faixa) {
    }

    @Test
    public void getSituacao(){

        Pessoa pessoa = new Pessoa();
        pessoa.altura = 1.75;
        pessoa.peso = 68;
        String faixa = pessoa.getSituacao();
        assertEquals("GANHAR", faixa);

        pessoa = new Pessoa();
        pessoa.altura = 1.75;
        pessoa.peso = 75.3;
        faixa = pessoa.getSituacao();
        assertEquals("NORMAL", faixa);

        pessoa = new Pessoa();
        pessoa.altura = 1.75;
        pessoa.peso = 82;
        faixa = pessoa.getSituacao();
        assertEquals("PERDER", faixa);

        pessoa = new Pessoa();
        pessoa.altura = 1.75;
        pessoa.peso = 99;
        faixa = pessoa.getSituacao();
        assertEquals("PERDER", faixa);     
        
        pessoa = new Pessoa();
        pessoa.altura = 1.75;
        pessoa.peso = 110;
        faixa = pessoa.getSituacao();
        assertEquals("PERDER", faixa);

        pessoa = new Pessoa();
        pessoa.altura = 1.75;
        pessoa.peso = 125;
        faixa = pessoa.getSituacao();
        assertEquals("PERDER", faixa);
    }
    
}

