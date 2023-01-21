package com.kata.marsrover.businessLogic;

import com.kata.marsrover.model.Direction;
import com.kata.marsrover.model.GameBoard;
import com.kata.marsrover.model.Obstacle;
import com.kata.marsrover.model.Point;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
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
    public void beforeCoordinatesTest() {
        x = new Point(1, 60);
        y = new Point(2, 60);
        obstacles = Arrays.asList(new Obstacle(5, 5), new Obstacle(10, 10));
        gameBoard = new GameBoard(x, y, direction, obstacles);
    }

    @Test
    void move() {
    }

    @Test
    void moveForward() {
        Point expected = new Point(y.getValue() + 1, y.getValue());
        gameBoard.setDirection(Direction.NORTH);
        gameBoardBL.moveForward();
        assertEquals(gameBoard.getY(),expected);
    }

    @Test
    void moveBackward() {
    }
}