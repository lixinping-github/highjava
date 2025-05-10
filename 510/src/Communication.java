import java.util.concurrent.locks.ReentrantLock;

public class Communication implements Runnable {
    private int count = 1;
    ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                notify();

                if (count < 100) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException i) {

                    }
                    System.out.println(Thread.currentThread().getName() + ":" + count);
                    count++;

                    try { //调用如下线程进入阻塞状态
                        wait();
                    } catch (InterruptedException i) {
                        i.printStackTrace();
                    }
                } else {
                    break;
                }


            }

        }
    }
}
