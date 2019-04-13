package Lab_Session3;

public class Main {
    public static void main(String[] args) {
        Thread s1 = new Thread();
        s1.setName("myJavaThread");
        System.out.println(s1.getName());
        s1.start();

        MyThread n1 = new MyThread();
        n1.start();

    }
}
