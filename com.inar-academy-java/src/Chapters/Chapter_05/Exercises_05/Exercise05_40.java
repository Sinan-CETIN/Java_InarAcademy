public class Exercise05_40 {
    public static void main(String[] args) {
        int tail = 0;
        int head = 0;
        // 0 indicates tail and 1 head
        for(int i = 0; i < 1_000_000; i++){
            if((int)(Math.random() * 2) == 0)
                tail++;
            else
                head++;
        }
        System.out.println("After 1.000.000 flip\n   tail " + tail + "\n   head  " + head);
    }
}
