interface Action {
    void fly();
    void swim();
}
class Bird implements Action {
    @Override
    public void fly() {
        System.out.println("Bird is flying.");
    }
    @Override
    public void swim() {

    }

}
class Fish implements Action{
    @Override
    public void fly() {

    }

    @Override
    public void swim() {
        System.out.println("Fish is swimming.");
    }
}
public class interfaceex {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Fish fish = new Fish();
        bird.fly();
        fish.swim();

    }
}
