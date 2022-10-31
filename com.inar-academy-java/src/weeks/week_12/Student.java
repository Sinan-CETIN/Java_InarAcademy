package weeks.week_12;

public class Student {
    private String name;
    private String surname;
    private int id;
    private String email;

    public Student(){
        this("Sinan", "cetin", 4240, "sinanctn54@gmail.com");
    }
    public Student(String name, String surname, int id, String email) {
        this.name = name;
        this.surname = surname.toUpperCase();
        this.id = id;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void print() {
        System.out.println("Student's information");
        System.out.println("--------------------------");
        System.out.println("Name --> " + getName());
        System.out.println("Surname --> " + getSurname());
        System.out.println("ID --> " + getId());
        System.out.println("E-mail --> " + getEmail());
    }
}
