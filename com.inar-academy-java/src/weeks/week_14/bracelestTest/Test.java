package chapters.chapter_12.Exercises12.E12;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

// If you cannot run the program from cmd,
// you can try it on a notepad document that you paste a code from your framework
// Example for try: File file = new File("C:\\Users\\Serhat\\Desktop\\document.txt")
public class Test {
    public static void main(String[] args) throws Exception {
       /* if (args.length != 1) {
            System.out.println("Usage: java E12_12 [filename]");
            System.exit(1);
        }*/
        String path = new Scanner(System.in).nextLine();
        File file = new File(path);

        if (!file.exists()) {
            System.out.println("File " + args[0] + " not found");
            System.exit(2);
        }

        String s = "";

        try (
                Scanner input = new Scanner(file)
        ) {
            while (input.hasNext()) {
                s += input.nextLine() + " \n";
            }
            s = s.replaceAll("\n\\s*\\{", " {");
        }
        try (
                PrintWriter output = new PrintWriter(file)
        ) {
            output.print(s);
        }
    }

}