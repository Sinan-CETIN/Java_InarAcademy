package weeks.week_14.problem;

import java.util.ArrayList;

/*
  (Implement MyStack using inheritance) In Listing 11.10, MyStack is implemented
using composition. Define a new stack class that extends ArrayList.
Draw the UML diagram for the classes and then implement MyStack. Write
a test program that prompts the user to enter five strings and displays them in
reverse order.
   */
public class MyStack extends ArrayList<Object> {
    //pop() peek() |push()| size() isEmpty() toString()
    public MyStack() {

    }

    public MyStack(int capacity) {
        super(capacity);
    }


    public void push(Object o) {
        super.add(o);
    }

    public Object pop() {
        return super.remove(super.size() - 1);
    }

    public Object peek() {
        return super.get(super.size() - 1);
    }

    public int size() {
        return super.size();
    }

    public boolean isEmpty() {
        return super.size() == 0;
    }

    @Override
    public String toString() {
        return "Stack --> " + super.toString();
    }
}
