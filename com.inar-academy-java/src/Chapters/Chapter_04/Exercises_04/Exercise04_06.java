import java.sql.SQLOutput;

public class Exercise04_06 {
    public static void main(String[] args){
        //choose three random points for a circle
        final double RADIUS = 40;
        double angle1 = Math.random() * 2 * Math.PI;
        double x1 = RADIUS * Math.cos(angle1);
        double y1 = RADIUS * Math.sin(angle1);
        double angle2 = Math.random() * 2 * Math.PI;
        double x2 = RADIUS * Math.cos(angle2);
        double y2 = RADIUS * Math.sin(angle2);
        double angle3 = Math.random() * 2 * Math.PI;
        double x3 = RADIUS * Math.cos(angle3);
        double y3 = RADIUS * Math.sin(angle3);

        System.out.println("The 3 points are (" + x1 + "," + y1 + "), (" +
                x2 + "," + y2 + ") and (" + x3 + "," + y3 + ")");



    }
}
