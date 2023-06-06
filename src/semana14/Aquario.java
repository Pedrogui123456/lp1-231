package semana14;

public class Aquario {
   
    private double comprimento;
    private double altura;
    private double largura;
    private double temperaturaAmbiente;
    private double temperaturaDesejada;
    
        public Aquario(double comprimento, double altura, double largura,double temperaturaAmbiente, double temperaturaDesejada){
            this.setComprimento(comprimento);
            this.setAltura(altura);
            this.setLargura(largura);
            this.setTemperaturaAmbiente(temperaturaAmbiente);
            this.setTemperaturaDesejada(temperaturaDesejada);
        }

        public  double calcularVolume(){
            return (comprimento * altura * largura) / 1000;
        }
        public  double potenciaTermostato(){
            return calcularVolume()*0.05*(temperaturaAmbiente-temperaturaDesejada);
        }
        public  double filtragemPorHora(){
            return calcularVolume() * 3;
        }    

        public double getComprimento(){
            return comprimento;
        }
        public double getAltura(){
            return altura;
        }        

        public double getLargura(){
            return largura;
        }
        
        public double getTemperaturaAmbiente(){
            return temperaturaAmbiente;
        }
        
        public double getTemperaturaDesejada(){
            return temperaturaDesejada;
        }

        public void setComprimento(double comprimento){
            if(comprimento > 0.0){
               throw new RuntimeException("Comprimento válido");
            } 
            this.comprimento = comprimento;
        }    

        public void setAltura(double altura){
            if(altura > 0.0){
               throw new RuntimeException("Altura válida");
            }   
            this.altura = altura;
        }

        public void setLargura(double largura){
            if(largura > 0.0){
               throw new RuntimeException("Largura válida");
            } 
            this.largura = largura;  
        }

        public void setTemperaturaAmbiente(double temperaturaAmbiente){
            if(temperaturaAmbiente > 0.0){
               throw new RuntimeException("Temperatura Ambiente válida");
            }   
            this.temperaturaDesejada = temperaturaAmbiente;
        }

        public void setTemperaturaDesejada(double temperaturaDesejada){
            if(temperaturaDesejada > 0.0){
               throw new RuntimeException("Temperatura desejada válida");
            }   
            this.temperaturaDesejada = temperaturaDesejada;
        }

}
    
