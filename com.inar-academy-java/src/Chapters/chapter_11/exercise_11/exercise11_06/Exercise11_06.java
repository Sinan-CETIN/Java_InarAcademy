package Chapters.chapter_11.exercise_11.exercise11_06;


import Chapters.chapter_10.listing_10.Loan;
import Chapters.chapter_11.listing_11.listing11_02.CircleFromSimpleGeometricObject;
import java.util.ArrayList;
import java.util.Date;

public class Exercise11_06 {
    public static void main(String[] args) {
        ArrayList<Loan> loanList = new ArrayList<Loan>();
        loanList.add(new Loan(5, 10, 10000));
        loanList.add(new Loan(4, 10, 10000));
        loanList.add(new Loan(3, 10, 10000));
        loanList.add(new Loan(2, 10, 10000));

        ArrayList<Date> dateList = new ArrayList<>();
        dateList.add(new Date());
        dateList.add(new Date(123512341236L));
        dateList.add(new Date(23512341236L));
        dateList.add(new Date(243512341236L));

        ArrayList<CircleFromSimpleGeometricObject> circleList = new ArrayList<>();
        circleList.add(new CircleFromSimpleGeometricObject());
        circleList.add(new CircleFromSimpleGeometricObject(5));
        circleList.add(new CircleFromSimpleGeometricObject(8));
        circleList.add(new CircleFromSimpleGeometricObject(7));

        display(loanList);
        display(dateList);
        display(circleList);

        System.out.println("\n\n\n\n");

        System.out.println(loanList);
        System.out.println(dateList);
        System.out.println(circleList);
    }

    public static void display(ArrayList<?> list) {
        System.out.println("{");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
            System.out.println("=====================");
        }
        System.out.println("}\n----------------------------");
    }
}
