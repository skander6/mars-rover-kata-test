package com.kata.marsrover.businessLogic;

import com.kata.marsrover.model.Direction;
import com.kata.marsrover.model.GameBoard;
import com.kata.marsrover.model.Obstacle;
import com.kata.marsrover.utils.DirectionUtils;

public class GameBoardBL {


    protected boolean move(Direction direction, GameBoard gameBoard) {
        int x = gameBoard.getX().getValue();
        int y = gameBoard.getY().getValue();
        switch (direction) {
            case NORTH:
                y = gameBoard.getY().getForwardValue();
                break;
            case EAST:
                x = gameBoard.getX().getForwardValue();
                break;
            case SOUTH:
                y = gameBoard.getY().getBackwardValue();
                break;
            case WEST:
                x = gameBoard.getX().getBackwardValue();
                break;
        }
        if (!hasObstacle(x, y,gameBoard)) {
            gameBoard.getX().setValue(x);
            gameBoard.getY().setValue(y);
            return true;
        } else {
            return false;
        }
    }

    private boolean hasObstacle(int xLocation, int yLocation, GameBoard gameBoard) {
        for (Obstacle obstacle : gameBoard.getObstacles()) {
            if (obstacle.getX() == xLocation && obstacle.getY() == yLocation) {
                gameBoard.setEncounteredObstacle(true);
                return true;
            }
        }
        return false;
    }


    public boolean moveForward(GameBoard gameBoard) {
        return move(gameBoard.getDirection(),gameBoard);
    }

    public boolean moveBackward(GameBoard gameBoard) {
        return move(DirectionUtils.getOppositeDirection(gameBoard.getDirection()),gameBoard);
    }

    private void changeDirection(GameBoard gameBoard, int action) {
        int directions = Direction.values().length;
        int index = (directions + gameBoard.getDirection().getValue() + action) % directions;
        gameBoard.setDirection(Direction.values()[index]);
    }

    public void changeDirectionLeft(GameBoard gameBoard) {
        changeDirection(gameBoard, -1);
    }

    public void changeDirectionRight(GameBoard gameBoard) {
        changeDirection(gameBoard,  1);

    }
}
