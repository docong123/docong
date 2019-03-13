package Lab;

import java.util.Scanner;

public class Student {
    public int StudentCode;
    public double SumPoint;
    public int age;
    public String ClassName;

    /**
     * Constructor
     */
    public Student() {
    }
    public Student (int StudentCode, double SumPoint, int age , String ClassName) {
        this.StudentCode = StudentCode;
        this.SumPoint = SumPoint;
        this.age = age ;
        this.ClassName= ClassName;
    }
    /**
     * Getter and Setter
     */
    public int getStudentCode() {
        return StudentCode;
    }

    public void setStudentCode(int studentCode) {
        StudentCode = studentCode;
    }

    public double getSumPoint() {
        return SumPoint;
    }

    public void setSumPoint(double sumPoint) {
        SumPoint = sumPoint;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    /**
     * Nhập thông tin từ bàn phím
     */
    public void InputInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap ma sinh vien: ");
        this.setStudentCode(scanner.hasNextInt()?scanner.nextInt():1);

        System.out.println("Nhap tuoi: ");
        this.setAge(scanner.hasNextInt()?scanner.nextInt():18);

        System.out.println("Nhap diem trung bình: ");
        this.setSumPoint(scanner.hasNextDouble()?scanner.nextDouble():0);
        scanner.nextLine();
        System.out.println("Nhap ten lop: ");
        this.setClassName(scanner.hasNextLine()?scanner.nextLine():"");
    }
    /**
     * Show Student Info
     */
    public void showInfo(){
        System.out.println("ma sinh vien: "+this.getStudentCode()+"  "+"Lop: "+this.getClassName()+"  "+"Tuoi"+this.getAge()+"  "+"Diem trung binh"+this.SumPoint);
    }
    public void checkReward(){
        if (this.getSumPoint() > 8){
            System.out.println("Sinh Vien Dat Hoc Bong");
            return;
        }else
        System.out.println("Sinh Vien khong dat hoc bong");

    }

    public static void main(String[] args) {
        Student student=new Student();
        student.InputInfo();
        student.showInfo();
        student.checkReward();
        System.out.println(student.getClassName() + 1 );
    }
}
