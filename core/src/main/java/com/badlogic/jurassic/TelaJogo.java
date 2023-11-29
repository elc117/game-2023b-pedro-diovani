package com.badlogic.jurassic;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.audio.Sound;

public class TelaJogo implements Screen {
    final Jurassic game;
    OrthographicCamera camera;
    Texture tela, player;
    Quiz quiz;
    int dificuldade, resposta, fase;
    boolean botaoPressionado, botaoSolto,respondida;
    Pergunta perguntaRandom;
    Sound somAcerto, somErro;
    
    public TelaJogo(final Jurassic g){
        game = g;
        camera = new OrthographicCamera();
        camera.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

        tela = new Texture(Gdx.files.internal("telajogo.png"));
        quiz = CriaQuiz.criarQuiz();
        
        botaoPressionado = false;
        botaoSolto = false;
        
        respondida = false;
        dificuldade = 1;
        
        resposta = 0;
        fase = 1;
        
        player = new Texture("player.png");
        
        somAcerto = Gdx.audio.newSound(Gdx.files.internal("acerto.mp3"));
        somErro = Gdx.audio.newSound(Gdx.files.internal("erro.mp3"));
    }
    
    @Override
    public void render(float delta){
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        
        camera.update();
        game.batch.setProjectionMatrix(camera.combined);
        
        game.batch.begin();
        
        game.batch.draw(tela, 0, 0);
        
        if(fase == 1){
            game.batch.draw(player, 104, 330);
        }
        if(fase == 2){
            game.batch.draw(player, 62, 235); 
        }
        if(fase == 3){
            game.batch.draw(player, 312,214); 
        }
        if(fase == 4){
            game.batch.draw(player, 262,268);
        }
        if(fase == 5){
            game.batch.draw(player, 393,420); 
        }
        if(fase == 6){
            game.batch.draw(player, 470,374);
        }
        if(fase == 7){
            game.batch.draw(player, 448,268); 
        }
        if(fase == 8){
            game.batch.draw(player, 590,318); 
        }
        if(fase == 9){
            game.batch.draw(player, 681,282);
        }
        if(fase == 10){
            game.batch.draw(player, 699,233);
        }
        
        if(fase > 4) dificuldade = 2;
        if(fase > 8) dificuldade = 3;
 
        if(respondida == false){
            perguntaRandom = quiz.getRandomQuestion(dificuldade);
            respondida = true;
        }
        game.font.getData().setScale(1.35f);
        game.font.setColor(0, 0, 0, 1);
        game.font.draw(game.batch, perguntaRandom.getEnunciado(), 40, 215);
        
        game.font.getData().setScale(2f);
        game.font.draw(game.batch, perguntaRandom.getOpcoes().get(0), 100, 160);
        game.font.draw(game.batch, perguntaRandom.getOpcoes().get(1), 100, 60);
        game.font.draw(game.batch, perguntaRandom.getOpcoes().get(2), 550, 160);
        game.font.draw(game.batch, perguntaRandom.getOpcoes().get(3), 550, 60);
                
        String vidasString, numFaseString; 
        
        vidasString = String.valueOf(quiz.getJogador().getVidas());
        game.font.getData().setScale(2f);
        game.font.draw(game.batch, vidasString, 735, 525);
        
        numFaseString = String.valueOf(fase);
        game.font.getData().setScale(2f);
        game.font.draw(game.batch, numFaseString + " / 10", 785, 524);
        
        int x = Gdx.input.getX();
        int y = Gdx.input.getY();
        if(Gdx.input.isButtonPressed(Input.Buttons.LEFT)){
            botaoPressionado = true;
        }
        if(botaoPressionado == true && !Gdx.input.isButtonPressed(Input.Buttons.LEFT)){
            botaoSolto = true;
        }
          
        if(botaoPressionado == true) {
            game.font.setColor(1, 1, 1, 1);
            game.font.getData().setScale(2f);
            if (x >= 100 && x <= 345 && y >= 385 && y <= 425) {
                if(!botaoSolto){
                    game.font.draw(game.batch, perguntaRandom.getOpcoes().get(0), 100, 160);
                }else{
                    resposta = 1;
                }
            }
            
            if (x >= 100 && x <= 345 && y >= 485 && y <= 525) {
                if(!botaoSolto){
                    game.font.draw(game.batch, perguntaRandom.getOpcoes().get(1), 100, 60);
                }else{
                    resposta = 2;
                }                
            }
            
            if (x >= 480 && x <= 795 && y >= 385 && y <= 425) {
                if(!botaoSolto){
                    game.font.draw(game.batch, perguntaRandom.getOpcoes().get(2), 550, 160);
                }else{
                    resposta = 3;
                } 
            }
            
            if (x >= 540 && x <= 790 && y >= 485 && y <= 525) {    
                if(!botaoSolto){
                    game.font.draw(game.batch, perguntaRandom.getOpcoes().get(3), 550, 60);
                }else{
                    resposta = 4;
                } 
            }
            if(botaoSolto){
                botaoPressionado = false;
                botaoSolto = false;
            }
        }

        if (resposta != 0) {
            if (perguntaRandom.verificaResposta(resposta) == true) {
                quiz.getJogador().acertaPergunta();
                somAcerto.play();
                fase++;
            } else {
                quiz.getJogador().perdeVida();
                somErro.play();
            }
            respondida = false;
            resposta = 0;
        }
        
        if(fase > 10 || quiz.getJogador().getVidas() == 0){
            Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
            game.font.setColor(1, 1, 1, 1);
            game.font.getData().setScale(3f);
            if(fase > 10) game.font.draw(game.batch, "YOU WIN!", 350, 310);  
            if(quiz.getJogador().getVidas() == 0) game.font.draw(game.batch, "GAME OVER", 320, 310);
            game.font.getData().setScale(2f);
            game.font.draw(game.batch, "Click to play again", 330, 260);
            if (Gdx.input.isTouched()) {
                game.setScreen(new TelaStart(game)); 
            }
        }
       
        game.batch.end();
    }
    
    @Override
    public void resize(int width, int height) {
        
    }

    @Override
    public void show() {
    }

    @Override
    public void hide() {
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void dispose() {
        tela.dispose();
        player.dispose();
        somAcerto.dispose();
        somErro.dispose();
    }
}

