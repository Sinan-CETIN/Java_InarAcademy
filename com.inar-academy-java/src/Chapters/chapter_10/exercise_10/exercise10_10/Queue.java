package Chapters.chapter_10.exercise_10.exercise10_10;

public class Queue {
    public static final int DEFAULT_CAPACITY = 8;

    private int[] elements;
    private int size;


    public Queue() {
        this(DEFAULT_CAPACITY);
    }

    public Queue(int capacity) {
        this.elements = new int[capacity];
        size = 0;
    }

    public void enqueue(int v) {
        ensureCapacity();
        elements[size++] = v;
    }

    private void ensureCapacity() {
        if (elements.length <= size) {
            int[] temp = new int[elements.length * 2 + 1];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
    }

    public int dequeue() {
        int result = elements[0];

        shiftingElementsLeft();
        size--;

        return result;
    }

    private void shiftingElementsLeft() {
        for (int i = 1; i < getSize(); i++) {
            elements[i - 1] = elements[i];
        }
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }
}
