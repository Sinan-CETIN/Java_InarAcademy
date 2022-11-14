package Chapters.chapter_12.listing_12;

import java.io.File;
public class Listing12_12 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\sinan\\OneDrive\\Desktop\\sinancetin.txt");
        System.out.println("Does it exist" + file.exists());
        System.out.println("The file has " + file.length() + " bytes");
        System.out.println("Can it be read? " + file.canRead());
        System.out.println("Can it be written ? " + file.canWrite());
        System.out.println("Is it a directory ? " + file.isDirectory());
        System.out.println("Is it a file ? " + file.isFile());
        System.out.println("Is it absolute ? " + file.isAbsolute());
        System.out.println("Is it hidden ? " + file.isHidden());
        System.out.println("Absolute path is " + file.getAbsolutePath());
        System.out.println("Last modified on " + new java.util.Date(file.lastModified()));
        file = new File("c:\\Users\\sinan\\OneDrive\\Desktop\\FILE1");
        if (file.mkdir()) {
            System.out.println("We create a directory!");
        }
        file =new File("c:\\Users\\sinan\\OneDrive\\Desktop\\kemal.txt");
        System.out.println(file.exists());
    }
}
