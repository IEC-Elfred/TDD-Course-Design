package com.snake.game;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EggTest {

    private Egg egg;
    private Snake snake;

    @Before
    public void setUp() throws Exception {
        snake = new Snake();
        egg = new Egg(snake, null);

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void setRandom() {
        egg.setRandom();
        assertTrue(egg.isLive);
    }

    @Test
    public void haveEgg() {
        boolean res = egg.haveEgg();
        assertTrue(res);
    }
}