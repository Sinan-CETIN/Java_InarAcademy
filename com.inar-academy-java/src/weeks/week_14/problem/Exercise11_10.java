package weeks.week_14.problem;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyStack stack = new MyStack();
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a String : ");
            String s = input.nextLine();
            stack.push(s);
        }
        System.out.println("stack size --> " + stack.size());
        System.out.println(stack.toString());

        stack.add(3, "Okul"); //bu methodu stack yapisinda kullanmamiz beklenmiyor ama miras yoluyla bize ArrayList kaliyor

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("stack size -->" + stack.size());
    }
}
