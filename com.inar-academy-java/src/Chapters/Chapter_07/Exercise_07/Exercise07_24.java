package Chapters.Chapter_07.Exercise_07;

public class Exercise07_24 {
    public static void main(String[] args) {
        int[] deck = initializeDeck();
        shuffle(deck);
        String[] pickSuits = {"", "", "", ""};
        String[] pickNumbers = new String[4];// pick 1 by 1

        int pickNumber = pickCardsFromDeckOneOfEachSuit(deck, pickSuits, pickNumbers);
        printPicks(pickNumber, pickSuits, pickNumbers);

    }

    public static int[] initializeDeck() {
        int[] deck = new int[52];
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        return deck;
    }

    public static void shuffle(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index = (int) (Math.random() * array.length);
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }

    public static int pickCardsFromDeckOneOfEachSuit(int[] deck, String[] pickSuits, String[] pickNumbers) {
        int count = 0;
        int pick = 0;
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        while (pick < 4) {
            count++;
            int index = (int) (Math.random() * deck.length);
            String suit = suits[deck[index] / 13];
            if(!haveSuit(suit,pickSuits)) {
                pickSuits[pick] = suit;
                pickNumbers[pick] = ranks[deck[index] % 13];
                pick++;
            }
        }
        return count;
    }

    public static boolean haveSuit(String suit, String[] picks) {
        for (int i = 0; i < picks.length; i++) {
            if (picks[i].equals(suit)) {
                return true;
            }
        }
        return  false;
    }

    public static void printPicks(int pickNumber, String[] suits, String[] numbers) {
        for (int i = 0; i < suits.length; i++) {
            System.out.println(numbers[i] + " of " + suits[i]);
        }

        System.out.println("Number of picks : " + pickNumber);
    }








}
