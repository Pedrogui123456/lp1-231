package semana20;

import java.util.ArrayList;
import java.util.List;

public class Prova {
    private List<Questao> questoes;

    public Prova() {
        this.questoes = new ArrayList<>();
    }

    public void adicionarQuestao(Questao questao) {
        questoes.add(questao);
    }

    public int calcularPontuacao(List<List<String>> respostas) {
        int pontuacao = 0;
        for (int i = 0; i < questoes.size(); i++) {
            Questao questao = questoes.get(i);
            if (questao.validarResposta(respostas.get(i))) {
                pontuacao++;
            }
        }
        return pontuacao;
    }
}