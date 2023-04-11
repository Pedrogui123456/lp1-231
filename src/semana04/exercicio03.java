package semana04;

import java.util.Scanner;

public class exercicio03 {
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        double valorDesconto = 0;
        double valorFinal = valorCompra;

        if (valorCompra >= 0.01 && valorCompra < 10) {
            valorDesconto = 0;
        } else if (valorCompra >= 10 && valorCompra < 100) {
            valorDesconto = valorCompra * 0.05;
        } else if (valorCompra >= 100 && valorCompra < 500) {
            valorDesconto = valorCompra * 0.1;
        } else if (valorCompra >= 500) {
            valorDesconto = valorCompra * 0.15;
        }

        valorFinal = valorCompra - valorDesconto;

        System.out.println("Valor da compra: R$ " + valorCompra);
        System.out.println("Valor do desconto: R$ " + valorDesconto);
        System.out.println("Valor final com desconto: R$ " + valorFinal);
    }
}


