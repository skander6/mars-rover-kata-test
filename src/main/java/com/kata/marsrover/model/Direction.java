package com.kata.marsrover.model;

public enum Direction {

    NORTH('N'),
    EAST('E'),
    SOUTH('S'),
    WEST('W');

    private char tag;

    private Direction(char tag) {

        this.tag = tag;
    }

    public char getTag() { return tag; }

    }

