import java.util.concurrent.locks.ReentrantLock;

public class ticket  implements Runnable{

    private static int count =100;
    private ReentrantLock lock1=new ReentrantLock(true);
    @Override
    public void run() {
        while (true) {
            try{
                lock1.lock();
                if (count > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + "在卖票，现在还有" + count + "张票");
                    count--;
                } else {
                    break;
                }
            }finally {
                lock1.unlock();
            }

        }


    }






}
