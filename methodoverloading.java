class Calc{
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
public class methodoverloading {
    public static void main(String[] args) {
        Calc obj = new Calc();
        System.out.println("Sum (int): " + obj.add(5, 3));
        System.out.println("Sum (double): " + obj.add(2.5, 3.7));
    }
}
