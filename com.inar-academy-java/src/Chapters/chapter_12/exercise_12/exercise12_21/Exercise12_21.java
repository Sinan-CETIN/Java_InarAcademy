package Chapters.chapter_12.exercise_12.exercise12_21;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_21 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> sortedStringList = getElementFromFile();
        if (getIndex(sortedStringList) == -1) {
            System.out.println("Strings are sorted!");
        } else {
            System.out.println("Strings are not sorted. First 2 Strings out of order is [" +
                    sortedStringList.get(getIndex(sortedStringList)) + ", " + sortedStringList.get(getIndex(sortedStringList) + 1) + "]");
        }
    }

    public static ArrayList<String> getElementFromFile() throws IOException {
        String path = "C:\\Users\\sinan\\OneDrive\\Desktop\\srcDirectory\\SortedStrings.txt";
        File file = new File(path);
        if(!file.exists()) {
            System.out.println("File does not exists!");
            System.exit(1);
        }
        Scanner input = new Scanner(file);
        ArrayList<String> result = new ArrayList<>();
        while (input.hasNext()) {
            result.add(input.next());
        }
        return result;
    }

    public static int getIndex(ArrayList<String> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                return i;
            }
        }
        return -1;
    }
}
