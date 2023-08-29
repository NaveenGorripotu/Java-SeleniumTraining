package inheritance;

public class Developer extends Guest{
    public void write(){
        System.out.println("Writing");
    }
    public static void main (String[] args){
        Developer Obj1 = new Developer();
        Obj1.write();
        Obj1.read();
    }
}
