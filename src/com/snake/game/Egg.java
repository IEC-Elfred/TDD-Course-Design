package com.snake.game;

import com.snake.enums.Classes;
import com.snake.enums.GameModel;
import com.snake.swing.GamePanel;

import java.util.Random;

public class Egg {
	public boolean isLive;// 蛋是否存活
	public  int x, y;
	private boolean isknock;// 是否与蛇位置重叠
	private Random rd;
	Snake snake1;
	Snake snake2;

	public Egg(Snake snake1, Snake snake2) {
		this.snake1 = snake1;
		this.snake2 = snake2;
		rd = new Random();
		isLive = false;
		isknock = true;
	}

	// 随机生成蛋的位置
	public void setRandom() {
		int xi = rd.nextInt(19*(30/SnakeContext.EGG_SIZE))+1;
		int yi = rd.nextInt(19*(30/SnakeContext.EGG_SIZE))+1;
		x = xi * SnakeContext.EGG_SIZE;
		y = yi * SnakeContext.EGG_SIZE;
		// 如果蛋的位置和蛇身、墙、 障碍重叠 则随机生成新位置
		while (isKnock()) {
			xi = rd.nextInt(19*(30/SnakeContext.EGG_SIZE))+1;
			yi = rd.nextInt(19*(30/SnakeContext.EGG_SIZE))+1;
			x = xi * SnakeContext.EGG_SIZE;
			y = yi * SnakeContext.EGG_SIZE;
		}
		isLive=true;

	}

	// 蛋的位置判断是否会与蛇重叠
	private boolean isKnock() {
		for (int i = 0; i < snake1.snakeNode.size(); i++) { // 单节蛇的XY
			int x0 = snake1.snakeNode.get(i).getX();
			int y0 = snake1.snakeNode.get(i).getY();
			// 重叠
			if (x + (SnakeContext.EGG_SIZE*2/3) > x0 && x < x0 + SnakeContext.EGG_SIZE && y + SnakeContext.EGG_SIZE > y0 && y < y0 + SnakeContext.EGG_SIZE) {
				isknock = true;
				return true;
			}
		}
		if (GamePanel.gameMode == GameModel.TWO) {
			for (int i = 0; i < snake2.snakeNode.size(); i++) { // 单节蛇的XY
				int x0 = snake2.snakeNode.get(i).getX();
				int y0 = snake2.snakeNode.get(i).getY();
				// 重叠
				if (x + (SnakeContext.EGG_SIZE*2/3) > x0 && x < x0 +SnakeContext.EGG_SIZE && y + SnakeContext.EGG_SIZE > y0 && y < y0 + SnakeContext.EGG_SIZE) {
					isknock = true;
					return true;
				}
			}
		}
		// 和墙重叠
		if (x + (SnakeContext.EGG_SIZE*2/3) > 570 || x < SnakeContext.EGG_SIZE || y + SnakeContext.EGG_SIZE > 570 || y < SnakeContext.EGG_SIZE) {
			isknock = true;
			return true;
		}
		// 和障碍重叠
		if (GamePanel.classes == Classes.HEIGHT)
			if (x + (SnakeContext.EGG_SIZE*2/3) > 150 && x < 180 && y + SnakeContext.EGG_SIZE > 150 && y < 420
					|| x + x + (SnakeContext.EGG_SIZE*2/3) > 450 && x < 480 && y + SnakeContext.EGG_SIZE > 150 && y < 420) {
				isknock = true;
				return true;
			}
		// 不重叠
		isknock = false;
		return false;

	}

	// 判断蛋是否被吃了
	public boolean haveEgg() {
		for (int i = 0; i < snake1.snakeNode.size(); i++) { // 单节蛇的XY
			int x0 = snake1.snakeNode.get(i).getX();
			int y0 = snake1.snakeNode.get(i).getY();
			// 相撞 这则蛋不存活 但被吃
			if (x + (SnakeContext.EGG_SIZE*2/3) > x0 && x < x0 + SnakeContext.EGG_SIZE && y + SnakeContext.EGG_SIZE > y0 && y < y0 + SnakeContext.EGG_SIZE) {
				isLive = false;
				snake1.isEategg=true;
				return false;
			}
		}
		if (GamePanel.gameMode == GameModel.TWO) {
			for (int i = 0; i < snake2.snakeNode.size(); i++) { // 单节蛇的XY
				int x0 = snake2.snakeNode.get(i).getX();
				int y0 = snake2.snakeNode.get(i).getY();
				// 相撞 这则蛋不存活 但被吃
				if (x + (SnakeContext.EGG_SIZE*2/3) > x0 && x < x0 + SnakeContext.EGG_SIZE && y + SnakeContext.EGG_SIZE > y0 && y < y0 + SnakeContext.EGG_SIZE) {
					isLive = false;
					snake2.isEategg=true;
					return false;
				}

			}
		}
		// 否则蛋依然存活
		isLive = true;
		return true;

	}

	public void setPosition(int x, int y){
		this.x = x;
		this.y = y;
	}
}
