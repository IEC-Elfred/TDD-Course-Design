package com.snake.game;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.nio.channels.Pipe;

import static org.junit.Assert.*;

public class SnakeTest {

    private Snake snake;

    @Before
    public void setUp() throws Exception {
        snake = new Snake();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void drawSanke() {
    }

    @Test
    public void changeDir() {
    }

    @Test
    public void getHead() {
    }

    @Test
    public void getNode2() {
    }

    @Test
    public void removeLast() {
    }

    @Test
    public void getsnakeSize() {
    }

    @Test
    public void snakemove() {
    }

    @Test
    public void addSnakenode() {
        int expected = snake.snakeNode.size()+1;
        snake.addSnakenode();
        int res = snake.snakeNode.size();
        assertEquals(expected,res);
    }

    @Test
    public void getDirection() {
    }

    @Test
    public void setDirection() {
    }
}