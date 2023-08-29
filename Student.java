package Encapsulation;

public class Student {
    private  int rollNumber;
    private String name;
    private boolean isAttended;

    public Student(int rollNumber){
        this.rollNumber =rollNumber;
    }
    public void getStAttendance(boolean status){
        if(!isAttended)
            isAttended=status;

        System.out.println("Teacher assigned Attendance");

    }
    public void setStAttendance(){
        System.out.println("Teacher accessed Student Attendance");
    }

}
