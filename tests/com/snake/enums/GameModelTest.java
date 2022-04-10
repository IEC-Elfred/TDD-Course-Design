package com.snake.enums;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class GameModelTest {

    private GameModel gameModel;
    private Integer integer;
    private String name;

    public GameModelTest(GameModel gameModel, Integer integer, String name) {
        this.gameModel=gameModel;
        this.integer=integer;
        this.name=name;
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("twoModel test setUp");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("twoModel test tearDown");
    }

    @Parameterized.Parameters(
            name = "{index}:getClasses[{0}]={1},getName[{0}]={2}"
    )
    public static Collection data() {
        return Arrays.asList(new Object[]{GameModel.TWO, 1,"双人"}, new Object[]{GameModel.SINGAL, 0,"单人"});
    }

    @Test
    public void getModel() {
        System.out.println(this.integer + ", " + this.gameModel.getModel());
        Assert.assertEquals(this.integer, this.gameModel.getModel());
    }

    @Test
    public void getName() {
        System.out.println(this.name + ", " + this.gameModel.getName());
        Assert.assertEquals(this.name, this.gameModel.getName());
    }
}