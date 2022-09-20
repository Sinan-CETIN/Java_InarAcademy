public class Listing06_11 {
    public static void main(String[] args) {
        final int NUMBER_OF_CHARS = 175;
        final int CHARS_PER_LINE = 25;

        //print random characters between 'a' and 'z', 25 chars per line
        for(int i = 0; i < NUMBER_OF_CHARS; i++){
            if((i + 1) % CHARS_PER_LINE == 0)
                System.out.println(Listing06_10.getRandomLowerCaseLetter());
            else
                System.out.print(Listing06_10.getRandomLowerCaseLetter());
        }

        System.out.println();
        System.out.println();

        for(int i = 0; i < NUMBER_OF_CHARS; i++){
            if((i + 1) % CHARS_PER_LINE == 0)
                System.out.println(Listing06_10.getRandomCharacter('9', '0'));
            else
                System.out.print(Listing06_10.getRandomCharacter('9', '0'));
        }    }
}
