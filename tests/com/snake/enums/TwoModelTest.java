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
public class TwoModelTest {

    private TwoModel twoModel;
    private Integer integer;
    private String name;

    public TwoModelTest(TwoModel twoModel, Integer integer, String name) {
        this.twoModel=twoModel;
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
        return Arrays.asList(new Object[]{TwoModel.TWO_1, 1,"激斗"}, new Object[]{TwoModel.TWO_2, 2,"互相伤害"});
    }
    @Test
    public void getModel() {
        System.out.println(this.integer + ", " + this.twoModel.getModel());
        Assert.assertEquals(this.integer, this.twoModel.getModel());
    }

    @Test
    public void getName() {
        System.out.println(this.name + ", " + this.twoModel.getName());
        Assert.assertEquals(this.name, this.twoModel.getName());
    }
}