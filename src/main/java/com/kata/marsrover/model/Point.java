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

    public int getForwardValue() {
        return (getValue() + 1) % (getMaxValue() + 1);
    }

    public int getBackwardValue() {
        if (getValue() > 0) return getValue() - 1;
        else return getMaxValue();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Point point = (Point) o;

        return (value==point.getValue() && maxValue==point.getMaxValue());
    }
}
