package semana05;

import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double comprimento, altura, largura, volume, temperaturaDesejada, temperaturaAmbiente, potencia, filtragemPorHora;


        System.out.print("Digite o comprimento do aquário em centímetros: ");
        comprimento = scanner.nextDouble();

        System.out.print("Digite a altura do aquário em centímetros: ");
        altura = scanner.nextDouble();

        System.out.print("Digite a largura do aquário em centímetros: ");
        largura = scanner.nextDouble();

        System.out.print("Digite a temperatura desejada para o aquário em graus Celsius: ");
        temperaturaDesejada = scanner.nextDouble();

        System.out.print("Digite a temperatura ambiente em graus Celsius: ");
        temperaturaAmbiente = scanner.nextDouble();

    
        volume = (comprimento * altura * largura) / 1000;

      
        potencia = volume * 0.05 * (temperaturaDesejada - temperaturaAmbiente);

        
        filtragemPorHora = volume * 2;

        
        System.out.printf("O volume do aquário é de %.2f litros.\n", volume);
        System.out.printf("A potência do termostato necessária é de %.2f watts.\n", potencia);
        System.out.printf("A quantidade de filtragem por hora necessária é de %.2f litros.\n", filtragemPorHora);
    }
}


