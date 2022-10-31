package weeks.week_12;

public class Player {

    private String name;

    private int fee;

    public Player() {
        this("", 0);
    }


    public Player(String name, int fee) {
        this.name = name;
        this.fee = fee;
    }

    public String getName() {
        return name;
    }

    public int getFee() {
        return fee;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }
}
