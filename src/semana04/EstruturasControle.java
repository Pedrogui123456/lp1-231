package semana04;

public class EstruturasControle {

    public static void main(String[] args) {
        // if

        final int MAIORIDADE = 18;
        var idade = 17;
        
        if (idade >= MAIORIDADE) {
            System.out.println("Maior de idade");
        }

        var ligado = true;
        if (ligado) {
            System.out.println("Está ligado");
        } else {
            System.out.println("Está desligado");    
        }

        // switch
        // char, byte, short, int
        // literal String
        // enum

        int n = 3;

        switch (n) {
            case 1:
                System.out.println("Numero 1");
                break;
            case 2:
                System.out.println("Numero 2");
                break;
            case 3:
                System.out.println("Numero 3");
                break;
            default:
                System.out.println("Não identificado");
                break;
        }

        // loops
        // for, foreach, while, do while

        int contador = 0;
        while(contador < 30) {
            System.out.println("Ligadoo!");
            contador++;
        }

        contador = 0;
        do {
            System.out.println("Do while Ligado!!");
            contador++;
        } while (contador < 3);


        for (int i = 0; i < 3; i++) {
            System.out.println("For Ligado!");
        }
        
        // String nome = "João";
        
        // Array
        // armazena mais de um elemento
        // acesso via index - numero inteiro
        // tamanho fixo no momento da  criação

        // nomes = [___, ___, ___]
        //           0    1    2
        String[] nomes = new String[3];
        nomes[0] = "Maria";
        nomes[1] = "Marta";
        nomes[2] = "Marcia";

        System.out.println(nomes[0]);
        System.out.println(nomes[1]);
        System.out.println(nomes[2]);

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        //foreatch
        for (String nome : nomes) {
            System.out.println(nome);
        }

        int[] numeros = { 1, 3, 5, 0 };
        for (int numero : numeros) {
            System.out.println(numero);
        }

    }
}
