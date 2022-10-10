package Chapters.chapter_07.exercise_07;

public class Exercise07_13 {
    public static void main(String[] args) {
        int i1 = 5, i2 = 10, i3 =12 ,i4 = 53, i5 = 23, i6 = 34;
        int number = getRandom(i1, i2, i3);
        int number2 = getRandom(i1, i2, i3, i4, i4, i5 ,i6);
        System.out.println("Number 1 is " + number);
        System.out.println("Number 2 is " + number2);
    }

    public static int getRandom(int...numbers) {
        int number = (int)(1 + Math.random() * 53);
        while(include(numbers, number)) {
            number =(int)(1 + Math.random() * 53);
        }
        return number;
    }

    public static boolean include(int[] array, int key) {

        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                return true;
            }
        }
        return false;
    }
}
