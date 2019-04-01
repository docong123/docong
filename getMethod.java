package Assignment6;

import java.util.ArrayList;
import java.util.Scanner;

public class getMethod {
    void getMethod(){
        System.out.println("Chương  trình   chạy");
    }
    Scanner sc = new Scanner(System.in);
    ArrayList<NEw>NewsList = new ArrayList<>();
    void insertNews(){
        NEw nhapTin = new NEw();
        System.out.println("hãy nhập tiêu đề bài viết: ");
        nhapTin.title = sc.nextLine();

        System.out.println("hãy nhập ngày phát hành: ");
        nhapTin.PublishDate = sc.nextLine();

        System.out.println("hãy nhập tên  tác giả: ");
        nhapTin.Author = sc.nextLine();

        System.out.println("hãy nhập nội dung: ");
        nhapTin.Content = sc.nextLine();

        System.out.println("hãy nhập 3 đánh giá: ");
        nhapTin.RateList[0] = sc.nextFloat();
        sc.nextLine();
        nhapTin.RateList[1] = sc.nextFloat();
        sc.nextLine();
        nhapTin.RateList[2] = sc.nextFloat();
        sc.nextLine();
        this.NewsList.add(nhapTin);
    }
    void ShowList(){
        if(NewsList.size()==0){
            System.out.println("chưa có bài viết nào! hãy nhập bài viết");
            return;
        }
        for (NEw each: NewsList){
            each.Display();
        }

    }

    void AvG(){
        if(NewsList.size()==0){
            System.out.println("chưa có bài viết nào! hãy nhập bài viết");
            return;
        }
        for (NEw each: NewsList){
            each.Calculate();
            each.Display();
        }
    }
}
