package semana20;

import java.util.ArrayList;
import java.util.List;

public class SistemaQuestoes {
    public static void main(String[] args) {
        // Criação das questões
        QuestaoVerdadeiroFalso questaoVF = new QuestaoVerdadeiroFalso(1, "Java é uma linguagem de programação.", true);

        List<String> opcoesUnica = new ArrayList<>();
        opcoesUnica.add("a) Verdadeiro");
        opcoesUnica.add("b) Falso");
        QuestaoUnicaEscolha questaoUnica = new QuestaoUnicaEscolha(2, "Qual é a capital da França?", opcoesUnica, 0);

        List<String> opcoesMultipla = new ArrayList<>();
        opcoesMultipla.add("a) Maçã");
        opcoesMultipla.add("b) Banana");
        opcoesMultipla.add("c) Laranja");
        opcoesMultipla.add("d) Pera");
        List<Integer> respostasMultipla = new ArrayList<>();
        respostasMultipla.add(0);
        respostasMultipla.add(2);
        QuestaoMultiplaEscolha questaoMultipla = new QuestaoMultiplaEscolha(3, "Quais frutas são amarelas?", opcoesMultipla, respostasMultipla);

        // Criação da prova
        Prova prova = new Prova();
        prova.adicionarQuestao(questaoVF);
        prova.adicionarQuestao(questaoUnica);
        prova.adicionarQuestao(questaoMultipla);

        // Simulação de respostas do usuário
        List<List<String>> respostasUsuario = new ArrayList<>();
        List<String> respostasQuestao1 = new ArrayList<>();
        respostasQuestao1.add("Verdadeiro");
        respostasUsuario.add(respostasQuestao1);

        List<String> respostasQuestao2 = new ArrayList<>();
        respostasQuestao2.add("0"); // Opção "a) Verdadeiro"
        respostasUsuario.add(respostasQuestao2);

        List<String> respostasQuestao3 = new ArrayList<>();
        respostasQuestao3.add("0"); // Opção "a) Maçã"
        respostasQuestao3.add("2"); // Opção "c) Laranja"
        respostasUsuario.add(respostasQuestao3);

        // Calcula e exibe a pontuação da prova
        int pontuacao = prova.calcularPontuacao(respostasUsuario);
        System.out.println("Sua pontuação total: " + pontuacao);
    }
}





