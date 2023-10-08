package thread01;

public class NewThread extends Thread{
    @Override //option
    public void run(){
        for (int i = 1; i<6; i++) {
            try {
                Thread.sleep(500); // sleep 500 mili giây
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
        System.out.println("Thread Done!");
    }
}
