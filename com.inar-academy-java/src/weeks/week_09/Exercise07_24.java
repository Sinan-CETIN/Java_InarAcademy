package weeks.week_09;

public class Exercise07_24 {
    // create a deck
    // shuffle deck
    // pick four cards one of each suit
    // display your picks
    // show number of picks
    public static void main(String[] args) {
        int[] deck = new int[52];
        initiliaze(deck);
        shuffle(deck);

        int[] picks = new int[4];
        int numberOfPicks = pickCards(deck, picks);

        display(picks);

        System.out.println("Number of picks:" + numberOfPicks);
    }

    public static void initiliaze(int[] deck) {
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
    }

    public static void shuffle(int[] deck) {
        //deck[0] = 24; deck[24];
        for (int i = 0; i < deck.length; i++) {
            int index = (int) (Math.random() * deck.length);

            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;

        }
    }

    public static int pickCards(int[] deck, int[] picks) {
        int countPicks = 0;

        // checking whether we have one of each suit
        while (!hasOneOfEachSuit(picks)) {
            countPicks++;
            // pick 4 by 4
            for (int i = 0; i < 4; i++) {
               picks[i] = (int) (Math.random() * 52);
            }
        }

        return countPicks;
    }

    // 0 = spades ace
    // 1 = spades 2
    // 2 spades 3
    //******
    // 12 spades king
    // 13 clubbs ace
    // 51 Diamonds King 51 / 13 = 3 51 % 13 = 12

    //0 - 12 spades   35 / 13 = 2 ---- 35 % 13 = 9   20
    //13 - 25 Clubs
    //26 - 39 Hearts
    //40 - 52 Diamonds

    public static boolean hasOneOfEachSuit(int[] pick) {
        for (int i = 0; i < pick.length - 1; i++) {
            for (int j = i + 1; j < pick.length; j++) {

                int suit1 = pick[i] / 13;
                int suit2 =pick[j] / 13;

                if (suit1 == suit2) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void display(int[] pick) {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (int i = 0; i < pick.length; i++) { // 30  0
            int suitIndex = pick[i] / 13; //  30 / 13 = 2
            int rankIndex = pick[i] % 13; // 30 % 13 = 7
            System.out.println(ranks[rankIndex] + " of " + suits[suitIndex]);

        }

    }
}
