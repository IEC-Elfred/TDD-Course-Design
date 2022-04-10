package com.snake.extra;

import com.snake.enums.GameStatus;
import com.snake.swing.GamePanel;
import com.snake.swing.MySnakeGame;

public class Time implements Runnable{
	GamePanel gamePanel;
	public Time(GamePanel gamePanel){
		this.gamePanel=gamePanel;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(GamePanel.time!=0&&GamePanel.gameStatus ==GameStatus.START){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			GamePanel.time-=1;
			MySnakeGame.jlTime.setText("时间:"+"   "+GamePanel.time);
		}
	}

}
