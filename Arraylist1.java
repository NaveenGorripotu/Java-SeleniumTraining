import java.util.ArrayList;

public class Arraylist1 {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> students = new ArrayList<>();

        // Adding elements to the ArrayList
        students.add("x");
        students.add("y");
        students.add("z");

        // Accessing and displaying elements using index
        System.out.println("Second student: " + students.get(1));

        // Displaying the entire ArrayList
        System.out.println("Students: " + students);

        // Removing an element from the ArrayList
        students.remove(0);

        // Displaying the updated ArrayList
        System.out.println("Students after removal: " + students);

        // Iterating through the ArrayList using a for-each loop
        System.out.println("Remaining students:");
        for (String student : students) {
            System.out.println(student);
        }
    }
}
