package semana21;

import java.util.ArrayList;

// interface = contrato
// conjunto de metodos (somente assinatura, sem corpo)
// classe concreta que IMPLEMENTA a interface



public class Main {
    
   public static void main(String[] args) {
        System.out.println("Main...");

        Quadrado q1 = new Quadrado(10);
        Quadrado q2 = new Quadrado(20);

        Retangulo r1 = new Retangulo(10,5);

        Circulo c1 = new Circulo(5);


        Tela tela = new Tela();
        tela.addFigura(new Quadrado(10));
        tela.addFigura(new Quadrado(20));
        tela.addFigura(r1);
        tela.addFigura(new Circulo(5));
        System.out.println(tela.totalArea());
        System.out.println(tela.totalPerimetro());

        //arrays
        double[] notas = new double[3];
        notas[0] = 10.0;
        notas[1] = 3.0;
        notas[2] = 5.0;
        //notas[3] = 5.0;

        System.out.println(notas[0]);

        //Coleções
        //List
        //Set
        //Map chave - valor

        //String[] nomes = new String[10];
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Pedro");
        nomes.add("Guilherme");
        nomes.add("Lucas");

        String nome = nomes.get(1);
        System.out.println(nome);

        System.out.println(nomes.size());

        nomes.clear();

        System.out.println(nomes.size());

        for (int i = 0; i < notas.size(); i++) {
            String nome = nomes.get(1);
        }

        for (String nome : nomes) {
            nome
        }

    }
}
