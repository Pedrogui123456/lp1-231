package semana06;

import java.util.Scanner;

public class Aquario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento do aquário em centímetros: ");
        double comprimento = scanner.nextDouble();

        System.out.print("Digite a altura do aquário em centímetros: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite a largura do aquário em centímetros: ");
        double largura = scanner.nextDouble();

        double volume = calcularVolumeAquario(comprimento, altura, largura);
        double potenciaTermostato = calcularPotenciaTermostato(volume);
        double filtragemPorHora = calcularFiltragemPorHora(volume);

        System.out.println("Volume do aquário: " + volume + " litros");
        System.out.println("Potência do termostato necessária: " + potenciaTermostato + " watts");
        System.out.println("Quantidade de filtragem por hora necessária: " + filtragemPorHora + " litros/hora");
    }

    public static double calcularVolumeAquario(double comprimento, double altura, double largura) {
        // Fórmula para calcular o volume: comprimento * altura * largura
        double volumeEmCm = comprimento * altura * largura;
        double volumeEmLitros = volumeEmCm / 1000; // 1 litro = 1000 cm³
        return volumeEmLitros;
    }

    public static double calcularPotenciaTermostato(double volume) {
        // Fórmula para calcular a potência do termostato: 0.1 watt por litro
        double potencia = volume * 0.1;
        return potencia;
    }

    public static double calcularFiltragemPorHora(double volume) {
        // Fórmula para calcular a quantidade de filtragem por hora: 3 vezes o volume do aquário
        double filtragem = volume * 3;
        return filtragem;
    }
}


