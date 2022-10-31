package weeks.week_12;

public class Week12_01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Serhat", "gulbas" , 4114, "sg@gmail.com");

        s1.print();
        System.out.println();

        s2.print();
        s1.setEmail("sinan@inar.com");

        System.out.println();
        s1.print();
    }
}
