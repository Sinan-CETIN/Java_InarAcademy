package Chapters.Chapter_07.Exercise_07;

public class Exercise07_24Edition2 {
    public static void main(String[] args) {
        int[] deck = initializeDeck();
        shuffle(deck);
        int[] pick =new int[4];// pick 4 by 4
        int pickNumber =  pickCardsFromDeckOneOfEachSuit(deck, pick);
        printPick(pick);
        System.out.print("Number of picks : ");
        System.out.println(pickNumber);
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

    public static int pickCardsFromDeckOneOfEachSuit(int[] deck, int[] picks) {
        int count = 0;
        while (!isOneOfEachSuit(picks)) {
            pickFourCard(picks, deck);
            count++;
        }
        return count;
    }

    public static void printPick(int[] picks) {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        for (int i = 0; i < picks.length; i++) {
            System.out.println(ranks[picks[i] % 13] + " of " + suits[picks[i] / 13]);
        }
    }

    public static void pickFourCard(int[] picks, int[] deck) {
        for (int i = 0; i < picks.length; i++) {
            picks[i] = deck[(int)(Math.random() * 52)];
        }
    }

    public static boolean isOneOfEachSuit(int[] picks) {
        for (int i = 0;  i < picks.length; i++) {
            for (int j = 0; j < picks.length; j++) {
                if(i == j) {
                    continue;
                }
                if (picks[i] / 13 == picks[j] / 13)
                    return false;
            }
        }
        return true;
    }
}
