package weeks.week_12;

public class Location {
/*
(The Location class) Design a class named Location for locating a maximal
value and its location in a two-dimensional array. The class contains public data
fields row, column, and maxValue that store the maximal value and its indices
in a two-dimensional array with row and column as int types and maxValue as
a double type.
 */
    public int row;
    public int column;
    public double maxValue;

    public Location() {
        this(0,0,Double.MAX_VALUE);
    }
    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public int getRow() {
        return this.row;
    }

    public int getColumn() {
        return column;
    }

    public double getMaxValue() {
        return this.maxValue;
    }

    public String toString() {
        return "Row --> " + getRow() + "  \nColumn --> " + getColumn() + "  \nMaxValue --> " + getMaxValue() + "\n";
    }
}
