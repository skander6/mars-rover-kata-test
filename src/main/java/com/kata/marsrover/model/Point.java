package com.kata.marsrover.model;

public class Point {

    private int value;
    private int maxValue;

    public Point(int value, int maxValue) {
        setValue(value);
        setMaxValue(maxValue);
    }

    public void setValue(int value) { this.value = value; }
    public int getValue() { return value; }
    public void setMaxValue(int value) { maxValue = value; }
    public int getMaxValue() { return maxValue; }

}
