package Chapters.Chapter_07.Exercise_07;

import org.jetbrains.annotations.NotNull;

public class Exercise07_23 {
    public static void main(String[] args) {
        boolean[] locked = new boolean[100];

        changeLock(100, locked);

        System.out.println("Open locked door numbers are : ");
        printOpenLockerNumber(locked);
    }

    public static void changeLock(int numberOfStudent, boolean[] door) {
        for(int i = 1; i <= numberOfStudent; i++) {
            for (int j = (i - 1) ; j < door.length; j += i) {
                door[j] = door[j] ? false : true;
            }
        }
    }

    public static void printOpenLockerNumber(@NotNull boolean[] unlocked) {
        for (int i = 0; i < unlocked.length; i++) {
            if (unlocked[i]) {
                System.out.print((i + 1) + " ");
            }
        }
    }
}
