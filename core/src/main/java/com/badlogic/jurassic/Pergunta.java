package com.badlogic.jurassic;

import java.util.ArrayList;

public class Pergunta {
    private String enunciado;
    private int dificuldade;
    private ArrayList<String> opcoes;
    private int resposta;
    private boolean respondida;
    
    public Pergunta(String enunciado, int dificuldade, ArrayList<String> opcoes, int resposta, boolean respondida) {
        this.enunciado = enunciado;
        this.dificuldade = dificuldade;
        this.opcoes = opcoes;
        this.resposta = resposta;
        this.respondida = respondida;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    public ArrayList<String> getOpcoes() {
        return opcoes;
    }

    public void setOpcoes(ArrayList<String> opcoes) {
        this.opcoes = opcoes;
    }

    public int getResposta() {
        return resposta;
    }

    public void setResposta(int resposta) {
        this.resposta = resposta;
    }

    public boolean isRespondida() {
        return respondida;
    }

    public void setRespondida(boolean respondida) {
        this.respondida = respondida;
    }
    
    public void escreveEnunciado() {
        System.out.println(this.getEnunciado());
            for(int i = 0; i < 4; i++){
                System.out.println(this.getOpcoes().get(i));
            }
    }

    public boolean verificaResposta(int respostaUser) {
        if(respostaUser == resposta) {
            return true;
        }else{
            return false;
        }
    }
}