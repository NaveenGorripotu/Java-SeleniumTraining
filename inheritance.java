class Animal1 {
    void eat(){
        System.out.println("eating...");
    }
}
class Dog extends Animal1 {
    void bark(){
        System.out.println("barking...");
    }
}
class BabyDog extends Dog{
    void weep(){
        System.out.println("weeping...");
    }
}
public class inheritance {
    public static void main(String[] args){
        BabyDog d=new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }
}
