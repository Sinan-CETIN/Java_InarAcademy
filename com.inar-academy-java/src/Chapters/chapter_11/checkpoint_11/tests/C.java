package Chapters.chapter_11.checkpoint_11.tests;

class A {
    public A() {
        System.out.println(
                "A's no-arg constructor is invoked");
    }
}
class B extends A {
}
public class C {
    public static void main(String[] args) {
        B b = new B();
    }
}