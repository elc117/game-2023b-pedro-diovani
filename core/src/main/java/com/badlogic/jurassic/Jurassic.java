package com.badlogic.jurassic;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Jurassic extends Game {
    public SpriteBatch batch;
    public BitmapFont font;
    
    @Override
    public void create(){
        batch = new SpriteBatch();
        font = new BitmapFont();
        this.setScreen(new TelaStart(this));
    }
    
    @Override
    public void render(){
        super.render();
    }
    
    @Override
    public void dispose(){
        batch.dispose();
        font.dispose();
    }
}