package Lab_Session3;

public class MyThread extends Thread{
    public void run(){
        int a = 1;
        int n = 0;
        for (int i=2;a<=10;i++){
            for (int j=1;j<=i/2;j++){
                if (i%j==0){
                    n++;
                }
            }
            if (n<2){
                System.out.println("so nguyen to thu"+a);
                System.out.println(i);
                a++;
            }
            n=0;
            try {
                Thread.sleep(1500);
            }catch (Exception e){}
        }
    }
}
