package com.badlogic.jurassic;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;

public class TelaStart implements Screen {
    final Jurassic game;
    OrthographicCamera camera;
    Texture fundo;
    float fundoX;
    Texture titulo;
    Texture start;
    
    
    public TelaStart(final Jurassic g){
        game = g;
        camera = new OrthographicCamera();
        camera.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        
        fundo = new Texture("fundoStart.jpg");
        fundoX = 0;
        
        titulo = new Texture("titulo.png");
        start = new Texture("start.png");
        
    }
    
    @Override
    public void render(float delta){
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        
        camera.update();
        game.batch.setProjectionMatrix(camera.combined);
        
        game.batch.begin();
        game.batch.draw(fundo, fundoX, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        game.batch.draw(fundo, fundoX + Gdx.graphics.getWidth(), 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        
        game.batch.draw(titulo, 0, 0);
        game.batch.draw(start, 0, 0);
        
        game.batch.end();
       
        fundoX -= 20 * delta;
        if (fundoX <= -Gdx.graphics.getWidth()) {
            fundoX = 0;
        }
        
        if (Gdx.input.isTouched()) {
            game.setScreen(new TelaJogo(game));
            dispose();
        }
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
        fundo.dispose();
        titulo.dispose();
        start.dispose();
    }
}

