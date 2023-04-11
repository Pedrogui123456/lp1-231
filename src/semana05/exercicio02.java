package semana05;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double peso, altura, imc, pesoIdeal;
        String classificacao;

        System.out.print("Digite o seu peso em quilogramas (Kg): ");
        peso = scanner.nextDouble();

        System.out.print("Digite a sua altura em metros (m): ");
        altura = scanner.nextDouble();

        imc = peso / (altura * altura);

        if (imc < 18.5) {
            classificacao = "Baixo peso";
        } else if (imc < 25.0) {
            classificacao = "Peso normal";
        } else if (imc < 30.0) {
            classificacao = "Excesso de peso";
        } else if (imc < 35.0) {
            classificacao = "Obesidade de Classe 1";
        } else if (imc < 40.0) {
            classificacao = "Obesidade de Classe 2";
        } else {
            classificacao = "Obesidade de Classe 3";
        }

        pesoIdeal = 24.9 * (altura * altura);

        double diferencaPeso = pesoIdeal - peso;

        System.out.printf("Seu IMC é de %.2f, o que corresponde à classificação \"%s\".\n", imc, classificacao);
        System.out.printf("Para atingir o IMC de 24.9, você precisa %s %.2f kg.\n", diferencaPeso > 0 ? "ganhar" : "perder", Math.abs(diferencaPeso));
    }
}


