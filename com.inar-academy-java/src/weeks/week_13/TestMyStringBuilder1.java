package weeks.week_13;

public class TestMyStringBuilder1 {
    public static void main(String[] args) {
        MyStringBuilder1 myStringBuilder1 = new MyStringBuilder1("Inar Academy");
        String s1 = myStringBuilder1.toString();
        System.out.println(s1);
        String student = "Haluk";
        MyStringBuilder1 myStringBuilder2 = new MyStringBuilder1(student);
        myStringBuilder1.append(myStringBuilder2);
        String test = myStringBuilder1.toString();
        System.out.println(test);
        myStringBuilder1.append(1651);
        System.out.println(myStringBuilder1);
        System.out.println(myStringBuilder1.length());
        System.out.println(myStringBuilder1.charAt(3));

        System.out.println(myStringBuilder1.toLowerCase());
        System.out.println(myStringBuilder1);

        String school = "ASFGJWQEGKG";

        System.out.println(school.toLowerCase());
        System.out.println(school);

        MyStringBuilder1 myStringBuilder3 = myStringBuilder1.substring(0,21);

        System.out.println(myStringBuilder3);
        System.out.println(myStringBuilder1);


    }
}
