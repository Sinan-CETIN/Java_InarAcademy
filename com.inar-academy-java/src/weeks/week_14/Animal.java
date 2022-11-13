package weeks.week_14;

public class Animal {
    /*
    + weight
+ height
+ hasSwimmingSkills
+ hasFlyingSkills
————————
+ runs
+ eats
+ sleeeps
     */
    private double height; // cm
    private double weight; //kg
    private boolean hasSwimmingSkills;
    private boolean hasFlyingSkills;
    private int runCount = 0;

    public Animal() {
        this(0, 0, false, false);
    }

    public Animal(double height, double weight, boolean hasSwimmingSkills, boolean hasFlyingSkills) {
        this.height = height;
        this.weight = weight;
        this.hasSwimmingSkills = hasSwimmingSkills;
        this.hasFlyingSkills = hasFlyingSkills;
    }

    public void runs() {
        if (runCount >= 3){
            this.runCount = 0;
            this.eats();
            this.sleeps();
            return;
        }
        System.out.println("Animal is running right now! =]");
        runCount++;
    }

    public void eats() {
        System.out.println("Animal is eating right now! =]");
        if(runCount > 0) {
            runCount--;
        }
    }

    public void sleeps() {
        System.out.println("Shhhh! Animal is sleeping!");
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
}
