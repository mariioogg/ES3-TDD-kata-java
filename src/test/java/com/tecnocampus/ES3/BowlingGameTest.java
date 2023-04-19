package com.tecnocampus.ES3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BowlingGameTest {

    @BeforeEach
    public void setUp(){
        var g = new Game();
    }

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
