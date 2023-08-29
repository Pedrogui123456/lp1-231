package semana20;

import java.util.List;

public class QuestaoVerdadeiroFalso extends Questao {
    private boolean resposta;

    public QuestaoVerdadeiroFalso(int numero, String enunciado, boolean resposta) {
        super(numero, enunciado);
        this.resposta = resposta;
    }

    public boolean validarResposta(List<String> respostas) {
        return respostas.get(0).equalsIgnoreCase(Boolean.toString(resposta));
    }

}
