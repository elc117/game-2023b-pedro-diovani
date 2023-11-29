package com.badlogic.jurassic;

import java.util.ArrayList;
import java.util.Random;

public class Quiz {
    private ArrayList<Pergunta> questoes;
    private Jogador jogador;

    public Quiz() {
        this.questoes = new ArrayList<>();
        this.jogador = new Jogador(3, 0);
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public void addQuestion(Pergunta questao) {
        this.questoes.add(questao);
    }
    
    public Pergunta getRandomQuestion(int dificuldadeUser) {
        Random random = new Random();
        int randomIndex;
        do{
            randomIndex = random.nextInt(questoes.size());
        }while(questoes.get(randomIndex).isRespondida() || dificuldadeUser != questoes.get(randomIndex).getDificuldade());
        questoes.get(randomIndex).setRespondida(true);
        return questoes.get(randomIndex);
    }
}
