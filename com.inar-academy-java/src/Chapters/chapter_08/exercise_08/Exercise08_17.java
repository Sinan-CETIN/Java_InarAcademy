package Chapters.chapter_08.exercise_08;

import java.util.Scanner;

public class Exercise08_17 {
    /*
    It first reads two integers n and limit, where n indicates the
    number of banks and limit is the minimum total assets for keeping a bank safe. It
    then reads n lines that describe the information for n banks with IDs from 0 to n-1.
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of banks --> ");
        int numberOfBanks = input.nextInt();
        System.out.print("Enter the limit of minimum total assets for keeping a bank safe --> ");
        double limit = input.nextDouble();
        double[][] banksAssets = createBarrowerTable(numberOfBanks, input);
        boolean[] unsafeBanks = findUnsafeBanks(banksAssets, limit);
        displayUnsafeBanks(unsafeBanks);


    }

    public static double[][] createBarrowerTable(int numberOfBanks, Scanner input) {
        double[][] result = new double[numberOfBanks][];
        for (int i = 0; i < result.length; i++) {

            System.out.print("Enter the bank" + i + " balance --> ");
            double balance = input.nextDouble();

            System.out.println("Enter the number of banks that borrowed money from bank" + i + " --> ");
            int numberOfBanksThatBorrowedMoney = input.nextInt();

            //create necessary columns --> one for balance, one for barrower bank count, and (count * 2 pair (bank ID and amount))
            result[i] = new double[(numberOfBanksThatBorrowedMoney * 2) + 2];

            result[i][0] = balance;
            result[i][1] = numberOfBanksThatBorrowedMoney;

            for (int j = 2; j < result[i].length; j++) {

                if (j % 2 == 0) {
                    System.out.print("Enter bank ID that barrowed money from this bank --> ");
                    double ID = input.nextDouble();
                    result[i][j] = ID;
                } else {
                    System.out.print("Enter the amount barrowed --> ");
                    double barrowedAmount = input.nextDouble();
                    result[i][j] = barrowedAmount;
                }
            }
        }
        return result;
    }

    public static boolean[] findUnsafeBanks(double[][] banks, double limit) {
        boolean[] isBankSafe = new boolean[banks.length];
        //At first, we think every bank is safe
        for (int i = 0; i < isBankSafe.length; i++) {
            isBankSafe[i] = true;
        }

        boolean needNext = true;

        while (needNext) {
            int count = 0;

            for (int i = 0; i < banks.length; i++) {
                double sum = banks[i][0];
                for (int j = 2; j < banks[i].length; j += 2) {
                    int barrowerBankID = (int)banks[i][j];
                    //checking whether bank can take the money it gives to other bank
                    if (isBankSafe[barrowerBankID]) {
                        sum += banks[i][j + 1];
                    } else {
                        continue;
                    }

                }
                //checking whether we have a new unsafe bank
                if ((sum < limit) && isBankSafe[i]) {
                    isBankSafe[i] = false;
                    count++;
                }

            }
            // if a new bank unsafe we need to check how it effects the other
            if (count == 0) {
                needNext = false;
            }
        }
        return isBankSafe;
    }

    public static void displayUnsafeBanks(boolean[] unsafeBanks) {
        System.out.print("Unsafe banks --> ");
        for (int i = 0; i < unsafeBanks.length; i++) {
            if (!unsafeBanks[i]) {
                System.out.print(i + " ");
            }

        }
    }
}
