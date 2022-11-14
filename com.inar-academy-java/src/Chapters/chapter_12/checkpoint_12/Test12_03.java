package Chapters.chapter_12.checkpoint_12;

import java.io.PrintWriter;
//Checkpoint12_30z
public class Test12_03 {
    public static void main(String[] args) throws Exception {
        try (PrintWriter output = new PrintWriter("temp.txt");) {
            output.printf("amount is %f %e\r\n", 32.32, 32.32);
            output.printf("amount is %5.4f %5.4e\r\n", 32.32, 32.32);
            output.printf("%6b\r\n", false);
            output.printf("%6s\r\n", "Java");
        }
    }
}
