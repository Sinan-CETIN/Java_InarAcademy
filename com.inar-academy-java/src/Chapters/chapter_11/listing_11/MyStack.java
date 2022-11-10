package Chapters.chapter_11.listing_11;

import java.util.ArrayList;

public class MyStack {
   private ArrayList<Object> list = new ArrayList<>();

   public boolean isEmpty() {
       return this.list.isEmpty();
   }
   public int getSize() {
       return this.list.size();
   }

   public Object peek() {
       return list.get(list.size() - 1);
   }

   public Object pop() {
       return list.remove(list.size() - 1);
   }

   public void push(Object o) {
       list.add(o);
   }

   @Override
    public String toString() {
       return "Stack: " + list.toString();
   }
}
