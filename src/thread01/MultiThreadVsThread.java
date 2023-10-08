package thread01;

/*
Sử dụng Thread: Chạy nhanh, hiệu quả hơn
Ưu điểm của đa luồng:
- Có thể thực hiện nhiều luồng cùng 1 lúc
- Tiết kiệm thời gian
- Các luồng độc lập với nhau, nếu có ngoài lệ xảy ra thì chỉ xảy ra ở 1 luồng duy nhất
- Thread: là một đợn vị nhỏ nhất của máy tính thực hiện 1 công việc riêng biệt
Đa luồng (Multithreading) với Đa nhiệm (Multitasking)
Đa luồng: Một tiến trình thực hiện nhiều luồng (nghe nhạc: play, pause, next, ...)
LiffeCycle of Thread:
    Next -> Runnable -> Running -> Terminated
1. New: Luồng ở trạng thái 1 instance của lớp Thread nhưng trước khi gọi phương thức start()
2. Runnable: Luồng ở trạng thái này sau khi gọi phương thức start()
3. Running: Luồng ở trạng thái này khi thread scheduler đã chọn nó
4. Non-Runnable: Đây là trạng tháu luồng vẫn còn sống nhưng không đủ điều kiện để chạy
5. Terminated: Một luồng đã ở
 */

public class MultiThreadVsThread extends Thread {

}
