public class Exercise05_15 {
    public static void main(String[] args) {
        final int CHARACTER_PER_LINE = 10;
        int count = 1;
        char ch = '!';
        while(ch <= '~'){
            if(count % CHARACTER_PER_LINE == 0)
                System.out.println(ch);
            else
                System.out.print(ch + " ");
            ch++;
            count++;
        }

    }
}
