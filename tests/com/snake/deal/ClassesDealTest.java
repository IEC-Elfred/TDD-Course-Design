package com.snake.deal;

import com.snake.enums.Classes;
import com.snake.enums.GameStatus;
import com.snake.game.Snake;
import com.snake.game.SnakeNode;
import com.snake.swing.GamePanel;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ClassesDealTest {
    private Snake mSnake1;
    private List<SnakeNode> mSnakeNodes;
    private Snake mSnake2;

    @Before
    public void setUp() throws Exception {
        mSnake1 = new Snake();
        mSnakeNodes = new ArrayList<>();
        mSnakeNodes.add(new SnakeNode(0,0));
        mSnakeNodes.add(new SnakeNode(0,0));
        mSnakeNodes.add(new SnakeNode(0,0));
        mSnakeNodes.add(new SnakeNode(0,0));
        mSnakeNodes.add(new SnakeNode(0,0));
        mSnake2 = new Snake();
        mSnakeNodes = new ArrayList<>();
        mSnakeNodes.add(new SnakeNode(0,0));
        mSnakeNodes.add(new SnakeNode(0,0));
        mSnakeNodes.add(new SnakeNode(0,0));
        mSnakeNodes.add(new SnakeNode(0,0));
        mSnakeNodes.add(new SnakeNode(0,0));
        GamePanel.classes = Classes.SIMPLE;
        mSnake1.isLive = false;
        GamePanel.gameStatus = GameStatus.GAMEOVER;
        System.out.println("ClassesDealTest test setUp");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("ClassesDealTest test tearDown");
    }
    @Test
    public void dieDeal(){
        Assert.assertFalse(mSnake1.isLive);
    }

    @Test
    public void robFood(){
        Assert.assertEquals(GameStatus.GAMEOVER,GamePanel.gameStatus);
    }
}
