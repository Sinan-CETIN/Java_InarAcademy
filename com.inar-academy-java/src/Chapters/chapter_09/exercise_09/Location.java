package Chapters.chapter_09.exercise_09;

public class Location {
 /*
 The Location class) Design a class named Location for locating a maximal
value and its location in a two-dimensional array. The class contains public data
fields row, column, and maxValue that store the maximal value and its indices
in a two-dimensional array with row and column as int types and maxValue as
a double type.
Write the following method that returns the location of the largest element in a
two-dimensional array:
  */
    private int row;
    private int column;
    private double maxValue;

    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public double getMaxValue() {
        return maxValue;
    }

    public String toString() {
        return "Max value in row --> " + getRow() + " | column --> " + getColumn() + " | max value -- > " + getMaxValue();
    }

}
