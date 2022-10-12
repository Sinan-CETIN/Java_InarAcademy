package weeks.week_09;

public class Exercise07_23 {
    // create 100 closed door
    //
    // her gecen ogrenci kapinin durumunu degistiriyor
    public static void main(String[] args) {
        // false indicates that door is closed
        boolean[] doors = new boolean[100];

        int numberOfStudents = 100;

        updateDoors(numberOfStudents, doors);

        displayOpenDoor(doors);

    }

    public static void updateDoors(int numberOfStudents, boolean[] doors) {

        for (int student = 1; student <= numberOfStudents; student++) {
            for (int doorNumber = student - 1; doorNumber < doors.length; doorNumber += student) {

                if (doors[doorNumber]) {
                    doors[doorNumber] = false;
                } else {
                    doors[doorNumber] = true;

                }
            }
        }
    }

    public static void displayOpenDoor(boolean[] doors) {
        for (int i = 0; i < doors.length; i++) {
            if (doors[i]) {
                System.out.print((i + 1) + " ");
            }
        }
    }
}
