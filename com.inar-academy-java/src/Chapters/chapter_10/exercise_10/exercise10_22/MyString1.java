package Chapters.chapter_10.exercise_10.exercise10_22;

public class MyString1 {

    private char[] chars;

    public MyString1(char[] chars) {
        this.chars = chars;
    }

    public char charAt(int index) {
        if (index < 0 || index >= this.length()) {
            System.out.println("Invalid index!");
            System.exit(1);
        }
        return chars[index];
    }

    public int length() {
        return this.chars.length;
    }

    public MyString1 substring(int begin, int end) {
        char[] chars = createCharArray(begin, end);
        return new MyString1(chars);
    }

    private char[] createCharArray(int begin, int end) {
        if ((begin < 0 || begin > end) || (end > this.length() || end < begin)) {
            System.out.println("Invalid begin or end input!");
            System.exit(2);
        }
        int count = 0;
        char[] result = new char[end - begin];
        for (int i = begin; i < end; i++) {
            result[count++] = this.charAt(i);
        }

        return result;
    }

    public MyString1 toLowerCase() {
        char[] chars = new char[this.length()];
        for (int i = 0; i < this.chars.length; i++) {

            if (Character.isLetter(this.charAt(i))) {
                chars[i] = Character.toLowerCase(this.charAt(i));
            } else {
                chars[i] = this.charAt(i);
            }

        }
        return new MyString1(chars);
    }

    public boolean equals(MyString1 s) {
        if (this.length() != s.length()) {
            return false;
        }
        for (int i = 0; i < this.length(); i++) {
            if (this.charAt(i) != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static MyString1 valueOf(int i) {
        String s = i + "";
        return new MyString1(s.toCharArray());
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < this.length(); i++) {
            result += this.charAt(i);
        }
        return result;
    }
}
