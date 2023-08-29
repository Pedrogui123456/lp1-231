package semana20;

import java.util.ArrayList;
import java.util.List;

public class QuestaoMultiplaEscolha extends Questao{
 
    private List<String> opcoes;
    public QuestaoMultiplaEscolha(int numero, String enunciado, List<String> opcoes, List<Integer> respostas) {
        super(numero, enunciado);
        this.opcoes = opcoes;
    }

    public List<String> getOpcoes() {
        return opcoes;
    }

    public boolean validarResposta(List<String> respostas) {
        List<Integer> respostasSelecionadas = new ArrayList<>();
        for (String resposta : respostas) {
            respostasSelecionadas.add(Integer.parseInt(resposta));
        }
        return respostasSelecionadas.equals(respostas);
    }

}
 