import java.util.Scanner;

/**
 * book_class
 */
public class chess_class {
    Scanner scn = new Scanner(System.in);
    private String chname;
    private String chskill;
    private String chcolor;
    private String chrule;
    private int num;
    public chess_class(){

    }

    public void setchname(String newname){
        System.out.println("Chess's name : ");
        newname = scn.nextLine();
        this.chname = newname;
    }
    public void setchskill(String newskill){
        System.out.println("Chess's skill : ");
        newskill = scn.nextLine();
        this.chskill = newskill;
    }
    public void setchcolor(String newcolor){
        System.out.println("Chess's color : ");
        newcolor = scn.nextLine();
        this.chcolor = newcolor;
    }
    public void setchrule(String newrule){
        System.out.println("Chess's rule : ");
        newrule = scn.nextLine();
        this.chrule = newrule;
    }
    public void setchlv(int newnum){
        System.out.println("Chess's level is: ");
        newnum = scn.nextInt();
        this.num = newnum;
    }
    public String getchname(){
        return this.chname;
    }
    public String getchskill(){
        return this.chskill;
    }
    public String getchcolor(){
        return this.chcolor;
    }
    public String getchrule(){
        return this.chrule;
    }
    public int getchlv(){
        return this.num;
    }


    public void showInfo(){
        System.out.println();
        System.out.println("Chess's name : " + this.chname);
        System.out.println("Chess's skill : " + this.chskill);
        System.out.println("Chess's color : " +  this.chcolor);
        System.out.println("Chess's rule : " +  this.chrule);
        System.out.println("Chess's level : " + this.num);
        System.out.println();
    }
}