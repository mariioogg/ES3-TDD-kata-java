package com.tecnocampus.ES3;

import org.junit.jupiter.api.Test;

public class BowlingGameTest {

    @Test
    public void createGame(){
        var g = new Game();
    }

    @Test
    public void rollABall(){
        var g = new Game();
        g.roll(0);
    }
}
