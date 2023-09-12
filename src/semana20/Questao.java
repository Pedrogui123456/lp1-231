package semana20;

import java.util.ArrayList;
import java.util.List;

public abstract class Questao {
    private int numero;
    private String enunciado;

    public Questao(int numero, String enunciado) {
        this.numero = numero;
        this.enunciado = enunciado;
    }

    public int getNumero() {
        return numero;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public abstract boolean validarResposta(List<String> respostas);
}      