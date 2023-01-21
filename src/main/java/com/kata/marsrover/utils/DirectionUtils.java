package com.kata.marsrover.utils;

import com.kata.marsrover.model.Direction;

public class DirectionUtils {

    public static Direction getOppositeDirection(Direction direction) {
        return direction.values()[(direction.getValue() + 2) % 4];
    }
}
