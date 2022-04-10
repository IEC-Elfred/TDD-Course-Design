package com.snake.game;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class EggTest {
    @Parameter(0)
    public int x;
    @Parameter(1)
    public int y;
    @Parameter(2)
    public boolean expected;

    private Egg egg;
    private Snake snake;

    @Parameters
    public static Collection data() {
        return Arrays.asList(new Object[]{60, 30, true}, new Object[]{60, 60, false}, new Object[]{60, 90, false},
                new Object[]{30, 30, true}, new Object[]{30, 60, true}, new Object[]{30, 90, true}
                , new Object[]{90, 30, true}, new Object[]{90, 60, true}, new Object[]{90, 90, true});
    }

    @Before
    public void setUp() throws Exception {
        snake = new Snake();
        snake.addNode(60, 60);
        snake.addNode(60, 90);
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
        egg.setPosition(x, y);
        boolean res = egg.haveEgg();
        assertEquals(expected, res);
    }
}