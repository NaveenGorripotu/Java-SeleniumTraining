abstract class Animal {
    public abstract void Sound();
    public void sleep() {

        System.out.println("Sleeping");
    }
}

class Pig extends Animal {
    public void Sound() {
        System.out.println("The pig sounds \"wee wee\" ");
    }

}

public class Abstraction {
    public static void main(String[] args) {
        Pig obj1 = new Pig();
        obj1.Sound();
        obj1.sleep();
    }
}
