package com.snake.swing;

import com.snake.enums.TwoModel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class GamePanelTest {
    @Parameterized.Parameter(0)
    public String excepted_result;
    @Parameterized.Parameter(1)
    public boolean snake1;
    @Parameterized.Parameter(2)
    public boolean snake2;
    @Parameterized.Parameter(3)
    public TwoModel twoModel;
    @Parameterized.Parameter(4)
    public int raw_score;
    @Parameterized.Parameter(5)
    public int excepted_score;

    private GamePanelMe gamePanelMe;
    public GamePanelTest(){

    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(
                new Object[]{"玩家1胜！", true,false,TwoModel.TWO_1,10,20},
                new Object[]{"玩家2胜！", false,true,TwoModel.TWO_2,-10,0},
                new Object[]{"同归于尽鸟！",false,false,TwoModel.TWO_2,20,30},
                new Object[]{"Error", true,true,TwoModel.TWO_2,-20,-10},
                new Object[]{"Error",false,false,TwoModel.TWO_1,20,30});
    }

    @Before
    public void setUp() throws Exception {
        gamePanelMe=new GamePanelMe(10);
    }

    @After
    public void tearDown() throws Exception {
        gamePanelMe=null;
    }

    @Test
    public void eatEgg() {
        assertEquals(this.excepted_score,gamePanelMe.eatEgg(raw_score));
    }

    @Test
    public void whoWin() {
        assertEquals(this.excepted_result,gamePanelMe.whoWin(snake1,snake2,twoModel));
    }
}