package inheritance;

public class Admin extends Developer{
    public void Manage(){
        System.out.println("Edit/Delete");
    }
    public static void main(String[] args){
        Admin obj = new Admin();
        obj.read();
        obj.write();
        obj.Manage();
    }
}
