package semana11;

public class Aquario {
    public double comprimento;
    public double altura;
    public double largura;
    public double temperaturaAmbiente;
    public double temperaturaDesejada;

    public  double calcularVolume(){
        return (comprimento * altura * largura) / 1000;
    }
    public  double potenciaTermostato(){
        return calcularVolume()*0.05*(temperaturaAmbiente-temperaturaDesejada);
    }
    public  double filtragemPorHora(){
        return calcularVolume() * 3;
    }
    public double calcularPotenciaDoTermostato(double temperaturaDesejada2, double temperaturaAmbiente2) {
        return 0;
    }
    public double[] calcularQuantidadeLitrosFiltro() {
        return null;
    }    
}

