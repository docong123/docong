package Lab_Session3;

public class SubThread implements Runnable{
    public void run() {
        for (int i = 10; i >=0; i--) {
            try {
                System.out.println("Dem nguoc thoi gian:" + i);
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
        System.out.println("Chúc mừng baby");
    }
}
