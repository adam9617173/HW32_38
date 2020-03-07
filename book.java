/**
 * hw32_38
 */
public class book {

    public static void main(String[] args) {
        book_class bk1 = new book_class();
        book_class bk2 = new book_class();
        book_class bk3 = new book_class();

        bk1.setbkname("");
        bk1.setbkwriter("");
        bk1.setbkcost(0);
        bk1.showInfo();

        bk2.setbkname("");
        bk2.setbkwriter("");
        bk2.setbkcost(0);
        bk2.showInfo();

        bk3.setbkname("");
        bk3.setbkwriter("");
        bk3.setbkcost(0);
        bk3.showInfo();
    }
}