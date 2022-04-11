package com.snake.deal;

import com.snake.enums.GameModel;
import com.snake.game.Snake;
import com.snake.game.SnakeNode;
import com.snake.swing.GamePanel;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class GameModeDealTest {
    private Snake mSnake1;
    private ArrayList<Object> mSnakeNodes;

    @Before
    public void setUp() throws Exception {
        GamePanel.gameMode = GameModel.SINGAL;
        mSnake1 = new Snake();
        mSnakeNodes = new ArrayList<>();
        mSnakeNodes.add(new SnakeNode(0,0));
        mSnakeNodes.add(new SnakeNode(0,0));
        mSnakeNodes.add(new SnakeNode(0,0));
        mSnakeNodes.add(new SnakeNode(0,0));
        mSnakeNodes.add(new SnakeNode(0,0));
        System.out.println("GameModeDealTest test setUp");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("GameModeDealTest test tearDown");
    }

    @Test
    public void eatEgg(){
        Assert.assertFalse(mSnake1.isEategg);
    }

}
