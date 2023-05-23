package semana12;

    import static org.junit.jupiter.api.Assertions.assertEquals;
    import org.junit.Test;
    
    public class PessoaTest {
        @Test
        public void calculaImc(){
            Pessoa pessoa = new Pessoa(1.72, 68);
            double imc = pessoa.calcularImc();
            assertEquals(imc, 22.22222222222222, 0.0001);   
        }
        
        @Test
        public void getFaixa(){
            Pessoa pessoa = new Pessoa(1.75, 68);
            String faixa = pessoa.getFaixa();
            assertEquals("Você está abaixo do peso normal", faixa);
    
            pessoa = new Pessoa(1.75, 75.3);
            faixa = pessoa.getFaixa();
            assertEquals("Você está com o peso normal", faixa);
    
            pessoa = new Pessoa(1.75, 82);
            faixa = pessoa.getFaixa();
            assertEquals("Você está acima do peso normal", faixa);
    
            pessoa = new Pessoa(1.75, 99);
            faixa = pessoa.getFaixa();
            assertEquals("Você pertence ao grupo Obesidade de Classe 1", faixa);     
            
            pessoa = new Pessoa(1.75, 110);
            faixa = pessoa.getFaixa();
            assertEquals("Você pertence ao grupo de Obesidade Classe 2", faixa);
    
            pessoa = new Pessoa(1.75, 125);
            faixa = pessoa.getFaixa();
            assertEquals("Você pertence ao grupo de Obesidade Classe 3", faixa);
        }
    
        @Test
        public void getSituacao(){
    
            Pessoa pessoa = new Pessoa(1.75, 68);
            String faixa = pessoa.getSituacao();
            assertEquals("GANHAR", faixa);
    
            pessoa = new Pessoa(1.75, 75.3);
            faixa = pessoa.getSituacao();
            assertEquals("NORMAL", faixa);
    
            pessoa = new Pessoa(1.75, 82);
            faixa = pessoa.getSituacao();
            assertEquals("PERDER", faixa);
    
            pessoa = new Pessoa(1.75, 99);
            faixa = pessoa.getSituacao();
            assertEquals("PERDER", faixa);     
            
            pessoa = new Pessoa(1.75, 110);
            faixa = pessoa.getSituacao();
            assertEquals("PERDER", faixa);
    
            pessoa = new Pessoa(1.75, 125);
            faixa = pessoa.getSituacao();
            assertEquals("PERDER", faixa);
        }
        
    }