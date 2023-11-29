package com.badlogic.jurassic;

public class Jogador{
    private int vidas;
    private int acertos;

    public Jogador(int vidas, int acertos) {
        this.vidas = vidas;
        this.acertos = acertos;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getAcertos() {
        return acertos;
    }

    public void setAcertos(int acertos) {
        this.acertos = acertos;
    }

    public void perdeVida (){
        this.setVidas(this.getVidas() - 1);
    }

    public void acertaPergunta(){
        this.setAcertos(this.getAcertos() + 1);
    }
}
