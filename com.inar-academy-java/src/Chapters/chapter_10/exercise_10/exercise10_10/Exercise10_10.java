package Chapters.chapter_10.exercise_10.exercise10_10;


public class Exercise10_10 {
    public static void main(String[] args) {
        int number = 2;
        Queue queue = new Queue();

        while (number < 120) {
            if (isPrime(number)) {
                queue.enqueue(number);
            }
            number++;
        }
        System.out.println("Size --> " + queue.getSize());
        display(queue);
        System.out.println("Size --> " + queue.getSize());

    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void display(Queue queue) {
        while(!queue.isEmpty()) {
            System.out.print(queue.getSize() + ")" + queue.dequeue() + "\n");
        }
    }
}
