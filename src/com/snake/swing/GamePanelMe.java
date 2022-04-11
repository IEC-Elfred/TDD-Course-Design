package com.snake.swing;

import com.snake.enums.TwoModel;

import javax.swing.*;

public class GamePanelMe {
    private int main;
    public GamePanelMe(int main){
        this.main=main;
    }
    // 吃蛋
    public int eatEgg(int score) {
        score += 10;
        return score;
    }

    // 判断玩家输赢
    public String whoWin(boolean snake1,boolean snake2,TwoModel twoModel) {
        if (snake1 == false && snake2== true) {
            return "玩家2胜！";
        } else if (snake1 == true && snake2 == false) {
            return "玩家1胜！";
        }
        if(twoModel == TwoModel.TWO_2){
            if(snake1 == false && snake2== false){
                return "同归于尽鸟！";
            }
        }
        return "Error";
    }
}
