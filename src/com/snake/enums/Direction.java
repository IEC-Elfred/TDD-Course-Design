package com.snake.enums;

/**
 * 移动方向枚举 方向上下左右
 */
public enum Direction {
    UP, LEFT, DOWN, RIGHT;

    public Direction getOppositeDirection() {
        return Direction.values()[(this.ordinal() + 2) % 4];
    }
}

