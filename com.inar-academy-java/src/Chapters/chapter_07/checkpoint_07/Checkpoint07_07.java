package Chapters.chapter_07.checkpoint_07;

public class Checkpoint07_07 {
    public static void selectionSort(double[] list){
        for (int i = 0; i < list.length - 1; i++) {
            double max = list[i];
            int maxIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (max < list[j]) {
                    max = list[j];
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                double temp = list[i];
                list[i] = list[maxIndex];
                list[maxIndex] = temp;
            }
        }
    }

    public static double[] createArray(){
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100) / 1.0;
        }
        return array;
    }

    public static void main(String[] args) {
        double[] array = createArray();
        selectionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
