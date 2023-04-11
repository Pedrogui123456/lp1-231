package semana04;

import java.util.Scanner;

public class exercicio01 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = input.nextInt();

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("O antecessor de " + numero + " é " + antecessor + " e o sucessor é " + sucessor + ".");
    }
}




