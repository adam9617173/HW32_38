import java.util.Scanner;

/**
 * book_class
 */
public class book_class {
    Scanner scn = new Scanner(System.in);
    private String bkname;
    private String bkwriter;
    private int num;
    public book_class(){

    }

    public void setbkname(String newname){
        System.out.println("Book's name : ");
        newname = scn.nextLine();
        this.bkname = newname;
    }
    public void setbkwriter(String newwriter){
        System.out.println("Book's writer's name : ");
        newwriter = scn.nextLine();
        this.bkwriter = newwriter;
    }
    public void setbkcost(int newcost){
        System.out.println("Book's cost : ");
        newcost = scn.nextInt();
        this.num = newcost;
    }
    public String getbkname(){
        return this.bkname;
    }
    public String getbkwriter(){
        return this.bkwriter;
    }
    public int getbkcost(){
        return this.num;
    }


    public void showInfo(){
        System.out.println();
        System.out.println("Book's name : " + this.bkname);
        System.out.println("Book's writer : " + this.bkwriter);
        System.out.println("Book's cost : " + this.num);
        System.out.println();
    }
}