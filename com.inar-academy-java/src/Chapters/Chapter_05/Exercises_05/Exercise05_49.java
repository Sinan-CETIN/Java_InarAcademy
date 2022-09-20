import java.util.Scanner;

public class Exercise05_49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string:");
        String s = input.nextLine();
        int countVowel = 0;
        int countConsonant = 0;
        s = s.toUpperCase();
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
                if(s.charAt(i) == 'A' || s.charAt(i) == 'I' || s.charAt(i) == 'U' ||
                        s.charAt(i) == 'O' || s.charAt(i) == 'E')
                    countVowel++;
                else
                    countConsonant++;
            }
        }
        System.out.println("The number of vowels is " + countVowel);
        System.out.println("The number of consonants is " + countConsonant);
    }
}
