package com.kata.marsrover.model;

public class Obstacle {
    private int x;
    private int y;

    public Obstacle(int x, int y) {
        this.x=x;
        this.y=y;
    }
    public int getX() {
        return x;
    }
    public void setX(final int value) {
        x = value;
    }

    public int getY() {
        return y;
    }
    public void setY(final int value) {
        y = value;
    }


}
