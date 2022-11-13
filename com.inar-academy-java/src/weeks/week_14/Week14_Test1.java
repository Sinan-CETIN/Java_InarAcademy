package weeks.week_14;

public class Week14_Test1 {
    public static void main(String[] args) {
        Animal animal = new Animal(100, 65, true, false);
        for (int i = 0; i < 10; i++) {
            animal.runs();
        }
        Lion lion = new Lion(110,72,true, false, true);
        for (int i = 0; i < 10; i++) {
            lion.runs();
        }
    }
}
