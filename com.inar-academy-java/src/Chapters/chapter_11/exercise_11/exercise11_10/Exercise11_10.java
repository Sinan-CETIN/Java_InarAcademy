package Chapters.chapter_11.exercise_11.exercise11_10;


public class Exercise11_10 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(11);
        myStack.push(111);
        myStack.push(1111);
        myStack.push(11111);
        myStack.push(111111);
        myStack.push(1111111);
        System.out.println(myStack.peek());
        myStack.pop();
        display(myStack);
    }

    public static void display(MyStack stack) {
        while (!stack.isEmpty()) {
            System.out.println(stack.pop().toString());
        }
    }
}
