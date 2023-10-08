package thread01;

public class TestThreadApplication {
    public static void main(String[] args) throws InterruptedException {
//        Tạo đối tượng Thread(class)
        MultiThreadVsThread mThread = new MultiThreadVsThread();
        mThread.start(); // Bắt đầu chạy luồng

//        Tạo đối tượng Thread(Runnable interface)
        MultiThreadVsRunnable mThreadVsRunnable = new MultiThreadVsRunnable();
        Thread thread = new Thread(mThreadVsRunnable);
                thread.start(); // Bắt đầu chạy luồng

//        Tạo Thread "NewThread"
        NewThread newThread = new NewThread();
        System.out.println("Name: " + newThread.getName());
        System.out.println("Id: " + newThread.getId());
        newThread.start();
        newThread.join(2000);
        // Khi newThread hoàn thành nhiệm vụ trong 2000 mili giây thì các luồng khác mới bắt đầu thực hiện
//  join(): chờ 1 luồng khết thúc (chết)
//  Hay: nó làm cho các thread đang chạy ngừng hoạt động cho đến khi luồng mà nó tham hia hoàn thành 1 nhiệm vụ nào đó
//        Bắt buộc sử dụng sử dụng throws InterruptedException

        NewThread newThread1 = new NewThread();
        NewThread newThread2 = new NewThread();
        NewThread newThread3 = new NewThread();
        NewThread newThread4 = new NewThread();
        newThread1.start();
        newThread2.start();
        newThread3.start();
        newThread4.start();

//        public void run(): thực hiện hành động luồng
//        start(): Bắt đầu thực thi
//        sleep(): Tạm ngừng trong vao lâu
//        interrupt(): Check luồng kết thúc, Ngắt luồng -> gián đoạn Thread
    }
}
