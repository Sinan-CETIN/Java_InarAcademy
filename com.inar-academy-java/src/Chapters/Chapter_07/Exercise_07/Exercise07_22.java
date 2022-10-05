package Chapters.Chapter_07.Exercise_07;

public class Exercise07_22 {
    public static void main(String[] args) {
        int[] board = placeQueens();
        printBoard(board);
    }

    public static int[] placeQueens() {
        int[] board = new int[8];
        int row = 0;
        int count = 0;
        while (row < board.length) {
            count++;
            boolean[] haveAppropriatePlace = createBooleanArray();
            if (checkPossiblePlace(board, row, haveAppropriatePlace)) {
                place(row, board, haveAppropriatePlace);
                row++;
            } else {
                row = 0;
            }
        }
        System.out.println(count);
        return board;
    }

    public static boolean[] createBooleanArray() {
        boolean[] array = new boolean[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = true;
        }
        return array;
    }


    public static boolean checkPossiblePlace(int[] board, int row, boolean[] havePlace) {
        for (int i = 0; i < row; i++) {
            int vertical = board[i];
            int rightDiagonal = board[i] + (row - i);
            int leftDiagonal = board[i] - (row - i);

            havePlace[vertical] = false;

            if (rightDiagonal < 8) {
                havePlace[rightDiagonal] = false;
            }

            if (leftDiagonal >= 0) {
                    havePlace[leftDiagonal] = false;
            }
        }

        for (int i = 0; i < havePlace.length; i++) {
            if (havePlace[i]) { // true mean there is a possible place to place queen
                return true;
            }
        }
        return false;
    }

    public static void place(int row, int[] board, boolean[] place) {
        int queenPlace = (int) (Math.random() * 8);
        while (!place[queenPlace]) {
            queenPlace = (int) (Math.random() * 8);
        }
        board[row] = queenPlace;
    }

    public static void printBoard(int[] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i] == j) {
                    System.out.print("|Q");
                } else {
                    System.out.print("| ");
                }
            }
            System.out.println("|");
        }
    }
}

