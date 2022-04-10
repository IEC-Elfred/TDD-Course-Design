package com.snake.game;

import com.snake.enums.Direction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;



import static org.junit.Assert.*;

public class SnakeTest {

    private Snake snake;

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
    public void addSnakeNode() {
        int expected = snake.snakeNode.size() + 1;
        snake.addSnakeNode();
        int res = snake.snakeNode.size();
        assertEquals(expected, res);
    }

}