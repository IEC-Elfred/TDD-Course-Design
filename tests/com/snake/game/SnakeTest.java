package com.snake.game;

import com.snake.enums.Direction;
import com.snake.swing.GamePanel;
import com.snake.swing.MySnakeGame;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;


import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SnakeTest {

    private Snake snake;

    @Parameter(0)
    public int x;
    @Parameter(1)
    public int y;
    @Parameter(2)
    public Direction dir;
    @Parameter(3)
    public int expectedX;
    @Parameter(4)
    public int expectedY;

    @Parameters
    public static Collection data() {
        return Arrays.asList(new Object[]{60, 60, Direction.UP,60,30}, new Object[]{60, 60, Direction.DOWN,60,90},
                new Object[]{60, 60, Direction.LEFT,30,60}, new Object[]{60, 60, Direction.RIGHT,90,60});
    }

    @Before
    public void setUp() throws Exception {
        snake = new Snake();
        snake.addNode(60, 60);
        snake.addNode(60, 90);
        snake.addNode(60, 120);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void changeDir() {
        Direction[] directions = {Direction.LEFT, Direction.RIGHT, Direction.UP, Direction.DOWN};
        for (Direction dir1 : directions) {
            for (Direction dir2 : directions) {
                snake.setDir(dir1);
                snake.changeDirection(dir2);
                if(dir1 == dir2.getOppositeDirection()){
                    assertEquals(snake.getDir(),dir1);
                } else{
                    assertEquals(snake.getDir(),dir2);
                }
            }
        }
    }

    @Test
    public void snakeMove() {
        int[] res = snake.Snakemove(x,y,dir);
        assertEquals(expectedX,res[0]);
        assertEquals(expectedY,res[1]);
    }

    @Test
    public void addSnakeNode() {
        int expected = snake.snakeNode.size() + 1;
        snake.addSnakeNode();
        int res = snake.snakeNode.size();
        assertEquals(expected, res);
    }

}