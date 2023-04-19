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
    public void rollABall(){
        g.roll(0);
    }

    @Test
    public void gutter_game(){
        for(var i = 0; i < 20; i += 1)
            g.roll(0);

        assertThat(g.score()).isEqualTo(0);
    }

}
