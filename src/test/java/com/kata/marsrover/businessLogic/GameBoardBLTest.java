package com.kata.marsrover.businessLogic;

import com.kata.marsrover.model.Direction;
import com.kata.marsrover.model.GameBoard;
import com.kata.marsrover.model.Obstacle;
import com.kata.marsrover.model.Point;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Arrays;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GameBoardBLTest {

    private GameBoard gameBoard;
    private GameBoardBL gameBoardBL;
    private Point x;
    private Point y;
    private List<Obstacle> obstacles;
    private Direction direction = Direction.NORTH;

    @BeforeAll
    public void initialize() {
        x = new Point(1, 60);
        y = new Point(2, 60);
        obstacles = Arrays.asList(new Obstacle(5, 5), new Obstacle(10, 10));
        gameBoard = new GameBoard(x, y, direction, obstacles);
        gameBoardBL = new GameBoardBL();
    }


    @Test
    void moveForwardShouldIncreaseYWhenDirectionIsNorth() {
        Point expected = new Point(y.getValue() + 1, y.getMaxValue());
        gameBoard.setDirection(Direction.NORTH);
        gameBoardBL.moveForward(gameBoard);
        assertEquals(gameBoard.getY(),expected);


    }

    @Test
    public void moveForwardShouldIncreaseXWhenDirectionIsEast() {
        Point expected = new Point(x.getValue() + 1, x.getMaxValue());
        gameBoard.setDirection(Direction.EAST);
        gameBoardBL.moveForward(gameBoard);
        assertEquals(gameBoard.getX(),expected);
    }

    @Test
    public void moveForwardShouldDecreaseYWhenDirectionIsSouth() {
        Point expected = new Point(y.getValue() - 1, y.getMaxValue());
        gameBoard.setDirection(Direction.SOUTH);
        gameBoardBL.moveForward(gameBoard);
        assertEquals(gameBoard.getY(),expected);
    }

    @Test
    public void moveForwardShouldDecreaseXWhenDirectionIsWest() {
        Point expected = new Point(x.getValue() - 1, x.getMaxValue());
        gameBoard.setDirection(Direction.WEST);
        gameBoardBL.moveForward(gameBoard);
        assertEquals(gameBoard.getX(),expected);
    }



    @Test
    public void moveBackwardShouldDecreaseYWhenDirectionIsNorth() {
        Point expected = new Point(y.getValue() - 1, y.getMaxValue());
        gameBoard.setDirection(Direction.NORTH);
        gameBoardBL.moveBackward(gameBoard);
        assertEquals(gameBoard.getY(),expected);
    }

    @Test
    public void moveBackwardShouldDecreaseXWhenDirectionIsEast() {
        Point expected = new Point(x.getValue() - 1, x.getMaxValue());
        gameBoard.setDirection(Direction.EAST);
        gameBoardBL.moveBackward(gameBoard);
        assertEquals(gameBoard.getX(),expected);
    }

    @Test
    public void moveBackwardShouldIncreaseYWhenDirectionIsSouth() {
        Point expected = new Point(y.getValue() + 1, y.getMaxValue());
        gameBoard.setDirection(Direction.SOUTH);
        gameBoardBL.moveBackward(gameBoard);
        assertEquals(gameBoard.getY(),expected);
    }

    @Test
    public void moveBackwardShouldIncreaseXWhenDirectionIsWest() {
        Point expected = new Point(x.getValue() + 1, x.getMaxValue());
        gameBoard.setDirection(Direction.WEST);
        gameBoardBL.moveBackward(gameBoard);
        assertEquals(gameBoard.getX(),expected);
    }

}