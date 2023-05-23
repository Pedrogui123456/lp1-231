package semana06;

    import java.util.Scanner;

public class IMCCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu peso em Kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a sua altura em metros: ");
        double altura = scanner.nextDouble();

        double imc = calcularIMC(peso, altura);
        System.out.println("Seu IMC é: " + imc);

        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
            double pesoIdeal = calcularPesoIdeal(24.9, altura);
            double pesoDiferenca = pesoIdeal - peso;
            System.out.println("Você precisa ganhar " + pesoDiferenca + " Kg para atingir o peso normal.");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Você está no peso normal.");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Você está acima do peso.");
            double pesoIdeal = calcularPesoIdeal(24.9, altura);
            double pesoDiferenca = peso - pesoIdeal;
            System.out.println("Você precisa perder " + pesoDiferenca + " Kg para atingir o peso normal.");
        } else {
            System.out.println("Você está obeso.");
            double pesoIdeal = calcularPesoIdeal(24.9, altura);
            double pesoDiferenca = peso - pesoIdeal;
            System.out.println("Você precisa perder " + pesoDiferenca + " Kg para atingir o peso normal.");
        }
    }

    public static double calcularIMC(double peso, double altura) {
        // Fórmula para calcular o IMC: peso / (altura * altura)
        double imc = peso / (altura * altura);
        return imc;
    }

    public static double calcularPesoIdeal(double imcIdeal, double altura) {
        // Fórmula para calcular o peso ideal: imcIdeal * (altura * altura)
        double pesoIdeal = imcIdeal * (altura * altura);
        return pesoIdeal;
    }
}

}
