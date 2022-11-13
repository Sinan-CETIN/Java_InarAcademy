package weeks.week_14;

public class Lion {
    private double height; // cm
    private double weight; //kg
    private boolean hasSwimmingSkills;
    private boolean hasFlyingSkills;
    private boolean tail;
    private int runCount = 0;

    public Lion() {
        this(0, 0, false, false, false);
    }

    public Lion(double height, double weight,boolean hasSwimmingSkills, boolean hasFlyingSkills, boolean tail) {
        this.height = height;
        this.weight = weight;
        this.hasSwimmingSkills = hasSwimmingSkills;
        this.hasFlyingSkills = hasFlyingSkills;
        this.tail = tail;
    }

    public void runs() {
        if (runCount >= 4){
            this.runCount = 0;
            this.eats();
            this.sleeps();
            return;
        }
        System.out.println("A lion is running right now! =]");
        runCount++;
    }

    public void eats() {
        System.out.println("A lion is eating right now! =]");
        if(runCount > 0) {
            runCount--;
        }
    }

    public void sleeps() {
        System.out.println("Shhhh! A lion is sleeping!");
        if(runCount > 0) {
            runCount--;
        }
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isHasSwimmingSkills() {
        return this.hasSwimmingSkills;
    }

    public void setHasSwimmingSkills(boolean hasSwimmingSkills) {
        this.hasSwimmingSkills = hasSwimmingSkills;
    }

    public boolean isHasFlyingSkills() {
        return this.hasFlyingSkills;
    }

    public void setHasFlyingSkills(boolean hasFlyingSkills) {
        this.hasFlyingSkills = hasFlyingSkills;
    }

    public boolean isTail() {
        return this.tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }
}
