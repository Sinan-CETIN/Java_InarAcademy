package weeks.week_13;

public class TestHome {
    public static void main(String[] args) {
        Home home = new Home();
        home.print();
        System.out.println();
        Home home1 = new Home(80,1,3,false,800000,1200,"Dag manzarasi", 2000);
        home1.print();
    }
}
