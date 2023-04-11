package semana04;


import java.util.Scanner;

public class exercicio04 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o código identificador do funcionário: ");
        String codigo = sc.nextLine().trim();
        
        if (codigo.length() != 7) {
            System.out.println("Código inválido. O código deve ter 7 caracteres.");
            return;
        }
        
        if (!codigo.startsWith("BR") || !codigo.endsWith("X")) {
            System.out.println("Código inválido. O código deve iniciar com BR e finalizar com X.");
            return;
        }
        
        String numero = codigo.substring(2, 6);
        try {
            int num = Integer.parseInt(numero);
            if (num < 1 || num > 9999) {
                System.out.println("Código inválido. O número deve estar entre 0001 e 9999.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Código inválido. O número deve ser um valor numérico.");
            return;
        }
        
        System.out.println("Código válido.");
    }
}


