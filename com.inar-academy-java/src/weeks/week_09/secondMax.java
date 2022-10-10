package weeks.week_09;

public class secondMax {
    public static int secondMax(int[] array) {
        int max = array[0] > array[1] ? array[0] : array[1];
        int secondMax = array[0] < array[1] ? array[0] : array[1];

        for (int i = 2; i < array.length; i++) {
            if(array[i] > max) {
                secondMax = max;
                max =array[i];
            }

            if (array[i] > secondMax && array[i] < max) {
                secondMax = array[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int[] array = createArray(20);
        display(array);
        System.out.println(secondMax(array));
        
    }
    
    public static int[] createArray(int size) {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = (int)(Math.random() * 100);
        }
        return result;

    }

    public static void display(int[] array) {
        for (int a = 0; a < array.length; a++) {
            System.out.print(array[a] + " ");
        }
        System.out.println();
    }
}
