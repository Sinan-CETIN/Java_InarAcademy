
public class Checkpoints04_02 {
    public static void main(String[] args) {
        // 4.8
        System.out.println("(int)'1' " + (int)'1');
        System.out.println("(int)'A' " + (int)'A');
        System.out.println("(int)'B' " + (int)'B');
        System.out.println("(int)'a' " + (int)'a');
        System.out.println("(int)'b' " + (int)'b');

        System.out.println("(char)40 " +(char)40);
        System.out.println("(char)59 " +(char)59);
        System.out.println("(char)79 " +(char)79);
        System.out.println("(char)85 " +(char)85);
        System.out.println("(char)90 " +(char)90);

        System.out.println((char)0X40);
        System.out.println((char)0X5A);
        System.out.println((char)0X71);
        System.out.println((char)0X72);
        System.out.println((char)0X7A);

        //4.10
        System.out.println("showing character '\\' and '\"' ");

        //4.11
        int i = '1';
        int j = '1' + '2' * ('4' - '3') + 'b' / 'a';
        int k = 'a';
        char c = 90;

        System.out.println(i + " " + j + " " + k + " " + c);

        // 4. 12
        c = 'A';
        i = (int)c;
        System.out.println(i);

        float fa = 1000.34f;
        int ia  = (int)fa;
        System.out.println(ia);

        double d = 1000.34;
        int is = (int)d;
        System.out.println(is);

        int id = 97;
        char ca = (char)id;
        System.out.println(ca);

        //4.13
        char x = 'a';
        char y = 'c';
        System.out.println(++x);
        System.out.println(y++);
        System.out.println(x - y);

        //4.14
        char ch = (char)('a' + Math.random() * ('z' - 'a'));

        //4.15

        System.out.println("'a' < 'b' " + ('a' < 'b'));
        System.out.println("'a' <= 'A' " + ('a' <= 'A'));
        System.out.println("'a' > 'b' " + ('a' > 'b'));
        System.out.println("'a' >= 'A' " + ('a' >= 'A'));
        System.out.println("'a' == 'a' " + ('a' == 'a'));
        System.out.println("'a' != 'b' " + ('a' != 'b'));
    }
}
