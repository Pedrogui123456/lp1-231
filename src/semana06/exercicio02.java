package semana06;

import java.util.Scanner;
public class exercicio02 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o peso (Kg): ");
        double peso = scanner.nextDouble();
        System.out.print("Digite a altura (m): ");
        double altura = scanner.nextDouble();

        double imc = calcularIMC(peso,altura);
        String classificacao = getClassificacaoIMC(imc);
        double pesoIdeal = calcularPesoIdeal(altura);

        System.out.println("Seu IMC é: " + imc);
        System.out.println("Classificação do IMC: " + classificacao);
        System.out.println("Peso ideal para IMC de 24,9: " + pesoIdeal);
        System.out.println("Quantidade de peso a perder/ganhar: " + (pesoIdeal - peso));
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String getClassificacaoIMC(double imc) {
        if (imc < 16) {
            return "Magreza grave";
        } else if (imc >= 16 && imc < 17) {
            return "Magreza moderada";
        } else if (imc >= 17 && imc < 18.5) {
            return "Magreza leve";
        } else if (imc >= 18.5 && imc < 25) {
            return "Peso normal";
        } else if (imc >= 25 && imc < 30) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc < 35) {
            return "Obesidade grau 1";
        } else if (imc >= 35 && imc < 40) {
            return "Obesidade grau 2 (severa)";
        } else {
            return "Obesidade grau 3 (mórbida)";
        }
    }

    public static double calcularPesoIdeal(double altura) {
        return 24.9 * (altura * altura);
    }
}




   