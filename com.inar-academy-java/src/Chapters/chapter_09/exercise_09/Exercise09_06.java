package Chapters.chapter_09.exercise_09;

public class Exercise09_06 {
    public static void main(String[] args) {

        int[] array = createArray(100000);

        StopWatch time = new StopWatch();
        sort(array);
        time.stop();
        System.out.println("Array sorted in " + (time.getElapsedTime() / 1000) + " seconds");

    }

    public static int[] createArray(int number) {
        int[] result = new int[number];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int)(Math.random() * number);
        }
        return result;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
