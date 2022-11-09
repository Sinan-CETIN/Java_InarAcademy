package Chapters.chapter_11.listing_11;

import Chapters.chapter_11.listing_11.listing11_02.CircleFromSimpleGeometricObject;
import javafx.scene.shape.Circle;

import java.util.ArrayList;

public class Listing11_08 {
    public static void main(String[] args) {
        ArrayList<String> cityList = new ArrayList<>();
        // Add some cities in the list
        cityList.add("London");
        // cityList now contains [London]
        cityList.add("Denver");
        // cityList now contains [London, Denver]
        cityList.add("Paris");
        // cityList now contains [London, Denver, Paris]
        cityList.add("Miami");
        // cityList now contains [London, Denver, Paris, Miami]
        cityList.add("Seoul");
        // Contains [London, Denver, Paris, Miami, Seoul]
        cityList.add("Tokyo");
        // Contains [London, Denver, Paris, Miami, Seoul, Tokyo]

        System.out.println("List size --> " + cityList.size());
        System.out.println("Is Miami in the list ? " + cityList.contains("Miami"));
        System.out.println("The location of Denver in the list? " + cityList.indexOf("Denver"));
        System.out.println("Is the list empty ? --> " + cityList.isEmpty());

        // Insert a new city at index 2
        cityList.set(2, "Xian");

        // Contains [London, Denver, Xian, Paris, Miami, Seoul, Tokyo]

        // Remove a city from list
        cityList.remove("Miami");
        // Contains [London, Denver, Xian, Paris, Seoul, Tokyo]

        // Remove a city at index 1
        cityList.remove(1);
        // Contains [London, Xian, Paris, Seoul, Tokyo]

        // Display the contents in the list
        System.out.println(cityList.toString());

        // Display the contents in the list in reverse order
        for (int i = cityList.size() - 1; i >= 0; i--) {
            System.out.println(cityList.get(i) + " ");
        }
        System.out.println();

        // Create a list to store two circles
        ArrayList<CircleFromSimpleGeometricObject> list =
                new ArrayList<>();
        list.add(new CircleFromSimpleGeometricObject(2));
        list.add(new CircleFromSimpleGeometricObject(3));

        for (int i = 0; i < list.size(); i++) {
            System.out.println("The area of the circle? --> " + list.get(i).getArea());
        }
    }
}
