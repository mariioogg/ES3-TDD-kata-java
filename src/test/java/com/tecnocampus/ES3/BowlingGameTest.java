package com.tecnocampus.ES3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BowlingGameTest {

    private Game g;
    @BeforeEach
    public void setUp(){
        g = new Game();
    }

    @Test
    public void createGame(){
        g = new Game();
    }

    @Test
    public void rollABall(){
        g = new Game();
        g.roll(0);
    }

}
