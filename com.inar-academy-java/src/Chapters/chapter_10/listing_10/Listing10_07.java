package Chapters.chapter_10.listing_10;

public class Listing10_07 {
    public static void main(String[] args) {
        StackOfInteger stackOfInteger = new StackOfInteger();
        for (int i = 0; i < 10; i++) {
            stackOfInteger.push(i);
        }

        while(!stackOfInteger.empty()) {
            System.out.print(stackOfInteger.pop() + " ");
        }
    }
}
