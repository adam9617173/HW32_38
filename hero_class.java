import java.util.Scanner;

/**
 * book_class
 */
public class hero_class {
    Scanner scn = new Scanner(System.in);
    private String hrname;
    private String hrskill;
    private String hrcontry;
    private String hrsex;
    private int num;
    public hero_class(){

    }

    public void sethrname(String newname){
        System.out.println("Hero's name : ");
        newname = scn.nextLine();
        this.hrname = newname;
    }
    public void sethrskill(String newskill){
        System.out.println("Hero's skill : ");
        newskill = scn.nextLine();
        this.hrskill = newskill;
    }
    public void sethrcontry(String newcontry){
        System.out.println("Where is this hero comes from : ");
        newcontry = scn.nextLine();
        this.hrcontry = newcontry;
    }
    public void sethrsex(String newsex){
        System.out.println("Hero is male or female : ");
        newsex = scn.nextLine();
        this.hrcontry = newsex;
    }
    public void sethrlv(int newnum){
        System.out.println("Hero's level is: ");
        newnum = scn.nextInt();
        this.num = newnum;
    }
    public String gethrname(){
        return this.hrname;
    }
    public String gethrskill(){
        return this.hrskill;
    }
    public String gethrcontry(){
        return this.hrcontry;
    }
    public String gethrsex(){
        return this.hrsex;
    }
    public int gethrlv(){
        return this.num;
    }


    public void showInfo(){
        System.out.println();
        System.out.println("Hero's name : " + this.hrname);
        System.out.println("Hero's skill : " + this.hrskill);
        System.out.println("Hero come from : " +  this.hrcontry);
        System.out.println("Hero sex is : " +  this.hrsex);
        System.out.println("Hero's level is : " + this.num);
        System.out.println();
    }
}