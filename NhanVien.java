package Lab;

import java.util.Scanner;

public class NhanVien {
    String name;
    int age;
    String address;
    double salary;
    int totalTime;

    void inputInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten nhan vien: ");
        name = scanner.nextLine();
        System.out.println("Nhap tuoi nhan vien: ");
        age = scanner.nextInt();
        System.out.println("Nhap dia chi nhan vien: ");
        address = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Nhap Luong nhan vien: ");
        salary = scanner.nextDouble();
        System.out.println("Nhap thoi gian lam viec: ");
        totalTime = scanner.nextInt();
    }
    void printInfo(){
        System.out.println("Ten: "+name+ " Tuoi: "+age+ " Dia chi: "+address+ " Luong"+salary+ " thoi gian lam viec "+totalTime);
    }
    double tinhThuong(){
        double thuong=0;
        if (totalTime>=200){
            thuong= salary*20/100;
        }else if (totalTime<200 && totalTime>=100){
            thuong= salary*10/100;
        }
        return thuong;
    }

    public static void main(String[] args) {
        NhanVien nhanvien = new NhanVien();
        nhanvien.inputInfo();
        nhanvien.printInfo();
        System.out.println("Tien thuong"+ nhanvien.tinhThuong());
    }
}
