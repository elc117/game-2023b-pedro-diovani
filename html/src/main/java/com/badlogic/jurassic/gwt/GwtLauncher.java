package com.badlogic.jurassic.gwt;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;
import com.badlogic.jurassic.Jurassic;

public class GwtLauncher extends GwtApplication {
        @Override
        public GwtApplicationConfiguration getConfig () {
            return new GwtApplicationConfiguration(920, 550);
        }

        @Override
        public ApplicationListener createApplicationListener () {
            return new Jurassic();
        }
}
