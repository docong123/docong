package Assignment6;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. insert news");
        System.out.println("2 . view list news");
        System.out.println("3 . Average rate");
        System.out.println("4 . exit \n");
        Scanner sc = new Scanner(System.in);
        getMethod add = new getMethod();
        int one = scanner.nextInt();
        switch (one) {
            case 1 :
                add.insertNews();
                break;
            case 2 :
                add.ShowList();
                break;
            case 3 :
                add.AvG();
                break;
            case 4 :
                System.out.println("chương trình kết thúc");
                break;
            default :
                System.out.println("hãy chọn đúng phương thức (1-4) !");

        }
    }
}
