import java.util.Scanner;

/**
 * book_class
 */
public class Student_Class {
    Scanner scn = new Scanner(System.in);
    private String sdname;
    private String sdcontry;
    private int IDnum;
    public Student_Class(){

    }

    public void setsdname(String newname){
        System.out.println("Student's name : ");
        newname = scn.nextLine();
        this.sdname = newname;
    }
    public void setsdcontry(String newcontry){
        System.out.println("Student comes from  : ");
        newcontry = scn.nextLine();
        this.sdcontry = newcontry;
    }
    public void setbkID(int newID){
        System.out.println("Student ID : ");
        newID = scn.nextInt();
        this.IDnum = newID;
    }
    public String getsdname(){
        return this.sdname;
    }
    public String getsdcontry(){
        return this.sdcontry;
    }
    public int getsdID(){
        return this.IDnum;
    }


    public void showInfo(){
        System.out.println();
        System.out.println("Name : " + this.sdname);
        System.out.println("Come from : " + this.sdcontry);
        System.out.println("ID : " + this.IDnum);
        System.out.println();
    }
}