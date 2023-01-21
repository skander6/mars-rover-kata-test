package com.kata.marsrover.model;

import java.util.List;

public class GameBoard {

    private Point x;
    private Point y;
    private Direction direction;
    private List<Obstacle> obstacles;
    private boolean encounteredObstacle = false;

    public GameBoard(Point x, Point y, Direction direction, List<Obstacle> obstacles) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.obstacles = obstacles;
    }

    public void setX(Point value) { x = value; }
    public Point getX() { return x; }

    public void setY(Point value) { y = value; }
    public Point getY() { return y; }

    public void setDirection(Direction value) {
        direction = value;
    }
    public Direction getDirection() {
        return direction;
    }
    public void setObstacles(List<Obstacle> value) {
        obstacles = value;
    }
    public List<Obstacle> getObstacles() {
        return obstacles;
    }

    public void setEncounteredObstacle(boolean encounteredObstacle) {
        this.encounteredObstacle = encounteredObstacle;
    }
}
