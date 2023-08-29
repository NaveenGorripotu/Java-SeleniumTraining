import java.util.Scanner;
public class conditions {
    public  static  void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your test score: ");
        int score = obj.nextInt();

        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}

