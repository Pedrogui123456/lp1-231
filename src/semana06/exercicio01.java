package semana06;

import java.util.Scanner;

public class exercicio01 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o comprimento do aquário (em cm): ");
        double comprimento = scanner.nextDouble();

        System.out.println("Informe a altura do aquário (em cm): ");
        double altura = scanner.nextDouble();

        System.out.println("Informe a largura do aquário (em cm): ");
        double largura = scanner.nextDouble();

        double volume = calcularVolumeAquario(comprimento, altura, largura);
        System.out.println("Volume do aquário em litros: " + volume);

        double potenciaTermostato = calcularPotenciaTermostato(volume);
        System.out.println("Potência do termostato necessária (em watts): " + potenciaTermostato);

        double filtragemPorHora = calcularFiltragemPorHora(volume);
        System.out.println("Quantidade de filtragem por hora necessária (em litros): " + filtragemPorHora);
    }

    public static double calcularVolumeAquario(double comprimento, double altura, double largura) {
        // Fórmula para calcular o volume de um aquário: volume = comprimento x altura x largura
        return (comprimento * altura * largura) / 1000; // converter cm³ para litros
    }

    public static double calcularPotenciaTermostato(double volume) {
        // Fórmula para calcular a potência do termostato: potencia = volume / 100
        return volume / 100;
    }

    public static double calcularFiltragemPorHora(double volume) {
        // Fórmula para calcular a quantidade de filtragem por hora: filtragem = volume / 4
        return volume / 4;
    }
}





