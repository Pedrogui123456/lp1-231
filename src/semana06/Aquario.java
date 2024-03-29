package semana06;

import java.util.Scanner;

public class Aquario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Comprimento aquário:(cm) ");
        double comprimento = scanner.nextDouble();
        System.out.println("Altura aquário:(cm) ");
        double altura = scanner.nextDouble();
        System.out.println("Largura aquário:(cm) ");
        double largura = scanner.nextDouble();
        System.out.println("Temperatura ambiente: (C⁰)");
        double temperaturaAmbiente = scanner.nextDouble(); 
        System.out.println("Temperatura desejada:(C⁰) ");
        double temperaturaDesejada = scanner.nextDouble();

        double volume = volume(comprimento, altura, largura);

        System.out.println("\nVolume do aquário:" + volume);
        System.out.println("A potência do termostato é: " + potenciaTermostato(volume, temperaturaAmbiente, temperaturaDesejada));
        System.out.println("A filtragem por hora é: "+ filtragemPorHora(volume));
    }

    public static double volume(double comprimento, double altura, double largura){
        return (comprimento * altura * largura) / 1000;
    }
    public static double potenciaTermostato(double volume, double temperaturaAmbiente, double temperaturaDesejada){
        return volume*0.05*(temperaturaAmbiente-temperaturaDesejada);
    }
    public static double filtragemPorHora(double volume){
        return volume * 3;
    }
}
