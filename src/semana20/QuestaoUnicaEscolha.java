package semana20;

import java.util.List;

public class QuestaoUnicaEscolha {
    private List<String> opcoes;
    private int resposta;

    public QuestaoUnicaEscolha(int numero, String enunciado, List<String> opcoes, int resposta) {
        super(numero, enunciado);
        this.opcoes = opcoes;
        this.resposta = resposta;
    }

    public List<String> getOpcoes() {
        return opcoes;
    }

    public boolean validarResposta(List<String> respostas) {
        int respostaSelecionada = Integer.parseInt(respostas.get(0));
        return respostaSelecionada == resposta;
    }

}
