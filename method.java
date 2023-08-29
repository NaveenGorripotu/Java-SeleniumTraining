public class method {
    int calcSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        method obj = new method();
        int result = obj.calcSum(10, 3);
        System.out.println("Sum: " + result);
    }
}
