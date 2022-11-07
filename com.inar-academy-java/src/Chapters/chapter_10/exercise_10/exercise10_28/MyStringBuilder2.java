package Chapters.chapter_10.exercise_10.exercise10_28;

import Chapters.chapter_10.exercise_10.exercise10_27.MyStringBuilder1;

public class MyStringBuilder2 {

    public static final int DEFAULT_CAPACITY = 8;
    private char[] chars;

    public MyStringBuilder2() {
        this(new char[DEFAULT_CAPACITY]);
    }

    public MyStringBuilder2(char[] chars) {
        this.chars = chars;
    }

    public MyStringBuilder2(String s) {
        this.chars = s.toCharArray();
    }

    public MyStringBuilder2 substring(int begin) {
        char[] ch = new char[this.chars.length - begin];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = this.chars[begin++];
        }
        this.chars = ch;
        return new MyStringBuilder2(this.chars);
    }

    public int length() {
        return this.chars.length;
    }

    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
        String string = this.toString();
        String start = string.substring(0, offset);
        String end = string.substring(offset);
        String result = start + s.toString() + end;
        this.chars = result.toCharArray();
        return new MyStringBuilder2(this.chars);
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < this.chars.length; i++) {
            s += this.chars[i];
        }
        return s;
    }

    public MyStringBuilder2 toUpperCase() {
        for (int i = 0; i < this.length(); i++) {
            if (Character.isLowerCase(this.chars[i])) {
                Character.toUpperCase(this.chars[i]);
            }
        }
        return new MyStringBuilder2(this.chars);
    }

    public MyStringBuilder2 reverse() {
        int end = this.chars.length - 1;
        for (int i = 0; i < this.chars.length / 2; i++) {
            char temp = this.chars[i];
            this.chars[i] = this.chars[end];
            this.chars[end--] = temp;
        }
        return new MyStringBuilder2(this.chars);
    }
}
