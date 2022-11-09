package Chapters.chapter_11.checkpoint_11;

public class Checkpoint11_01 {
    public static void main(String[] args) {
        System.out.println("True or false ? A subclass is a subset of a superclass. --> False\n" +
                "What keyword do you use to define a subclass. --> extends\n" +
                "What is a single inheritance. --> A java class may inherit directly from only one superclass\n" +
                "What is multiple inheritance --> Deriving a subclass from several classes but java does not allow multiple inheritance.\n");
        System.out.println("11.5 how does a subclass invoke its superclass's constructer --> with super() keywords\n" +
                "True or false? When invoking a constructer from a subclass, its superclass's no-arg constructer is always invoked --> true\n" +
                "11.7 True or false? You can override a private method defined in a superclass. --> False\n" +
                "11.8 True or false? You can override a static method defined in a superclass. True\n" +
                "11.9 How do you explicitly invoke a superclass’s constructor from a subclass? --> super()\n" +
                "11.10 How do you invoke an overridden superclass method from a subclass?\n" +
                "if it is static with SuperClassName.methodName() if not with super.methodName()");
    }
}
