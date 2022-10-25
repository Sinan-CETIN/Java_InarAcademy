package Chapters.chapter_10.listing_10;

public class StackOfInteger {
    private int[] elements;
    private int size = 0;
    public static final int DEFAULT_CAPACITY = 16;

    public StackOfInteger() {
    this(DEFAULT_CAPACITY);
    }
    public StackOfInteger(int capacity) {
        elements = new int[capacity];
    }

    /** Push a new integer to the top of the stack */
    public void push(int value) {
        if(size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements,0,temp,0,elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }

    /** Return and remove the top element from the stack */
    public int pop() {
        return elements[--size];
    }
    public int peek() {
        return elements[size - 1];
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
