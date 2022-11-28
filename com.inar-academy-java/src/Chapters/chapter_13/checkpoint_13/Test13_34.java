package Chapters.chapter_13.checkpoint_13;

import Chapters.chapter_13.listing_13.listing13_13.Rational;

public class Test13_34 {
    public static void main(String[] args) {
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(1, -2);
        System.out.println(r1.add(r2));
    }
}
