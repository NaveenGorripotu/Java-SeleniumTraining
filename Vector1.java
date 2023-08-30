package collectionspractice;
import java.util.*;

class Vector1{
    public static void main(String[] args) {
        Vector<String> v1 =new Vector<String>();
        v1.add("Naveen");
        v1.add(0,"Mahesh");
        v1.add(1,"Nikhil");
        System.out.println(v1);
        Vector<String> v2 =new Vector<String>();
        //addition of elements in list
        v2.add("Abhinav");
        v2.add("Vikas");
        v1.addAll(2,v2);
        System.out.println(v1);
        //retrieval of elements from list
        System.out.println(v1.get(1));
        //deletion of elements from list
       /* v1.remove(0);
        v1.remove("Nikhil");
        System.out.println(v1);
        //deleting total list
         v1.clear();
        System.out.println(v1);
         */
        //verification of elements in list
        System.out.println(v1.contains("Nikhil"));
        //update elements in list
        v1.set(0,"Zoheb");
        System.out.println(v1);


    }
}