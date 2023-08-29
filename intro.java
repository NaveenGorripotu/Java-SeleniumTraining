class Person {
    String name;
    int age;

    void introduce() {
        System.out.println("Hi, myself " + name + " and my age is " + age + " years old.");
    }
}
public class intro {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Raju";
        p1.age = 25;
        p1.introduce();

        Person p2 = new Person();
        p2.name = "Ramesh";
        p2.age = 30;
        p2.introduce();
    }
}
