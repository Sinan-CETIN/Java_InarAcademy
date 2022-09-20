public class Exercise04_03 {
    public static void main(String[] args){
        double xChar = 35.227085;
        double yChar = - 80.843124;
        double xAta = 33.753746;
        double yAta = - 84.386330;
        double xFlo = 27.994402;
        double yFlo = - 81.760254;
        double xSav = 32.076176;
        double ySav = - 81.088371;

        final double RADIUS = 6_371.01;
        //side1 is (Char to Ata)
        double side1 = RADIUS * Math.acos(Math.sin(Math.toRadians(xChar)) *
                Math.sin(Math.toRadians(xAta)) + Math.cos(Math.toRadians(xChar)) *
                Math.cos(Math.toRadians(xAta)) *
                Math.cos(Math.toRadians(yChar - yAta)));
        // side2 (Char to Flo)
        double side2 = RADIUS * Math.acos(Math.sin(Math.toRadians(xChar)) *
                Math.sin(Math.toRadians(xFlo)) + Math.cos(Math.toRadians(xChar)) *
                Math.cos(Math.toRadians(xFlo)) *
                Math.cos(Math.toRadians(yChar - yFlo)));
        // side3 is (Ata to Flo)
        double side3 = RADIUS * Math.acos(Math.sin(Math.toRadians(xAta)) *
                Math.sin(Math.toRadians(xFlo)) + Math.cos(Math.toRadians(xAta)) *
                Math.cos(Math.toRadians(xFlo)) *
                Math.cos(Math.toRadians(yAta - yFlo)));

        //  side4 is (Sav to ata)
        double side4 = RADIUS * Math.acos(Math.sin(Math.toRadians(xSav)) *
                Math.sin(Math.toRadians(xAta)) + Math.cos(Math.toRadians(xSav)) *
                Math.cos(Math.toRadians(xAta)) *
                Math.cos(Math.toRadians(ySav - yAta)));
        //  side5 (Sav to Flo)
        double side5 = RADIUS * Math.acos(Math.sin(Math.toRadians(xSav)) *
                Math.sin(Math.toRadians(xFlo)) + Math.cos(Math.toRadians(xSav)) *
                Math.cos(Math.toRadians(xFlo)) *
                Math.cos(Math.toRadians(ySav - yFlo)));

        double s1 = (side1 + side2 + side3) / 2;
        double s2 = (side3 + side4 + side5) / 2;
        double area1 = Math.pow(s1 * (s1 - side1) * (s1 - side2) * (s1 - side3) , 0.5);
        double area2 = Math.pow(s2 * (s2 - side3) * (s2 - side4) * (s2 - side5) , 0.5);
        double totalArea = area1 + area2;

        System.out.println("the estimated area enclosed by Atlanta, Georgia;\n" +
                "Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina is \n" + totalArea);

    }
}
