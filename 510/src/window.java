import java.util.concurrent.locks.ReentrantLock;

public class window implements  Runnable{




    private ReentrantLock lock=new ReentrantLock(true);
    private int count=100;
    @Override
    public void run() {

        while (true){
                lock.lock();  //加锁操作和解锁操作必须同时要有，否则报错
                    try {
                        if (count > 0) {
                        try {
                            Thread.sleep(100);  //处于忙等待
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        count--;
                        System.out.println(Thread.currentThread().getName() + "售票一张，还剩" + count);
                    } else {
                        break;
                    }
                    }finally {
                        lock.unlock();
                    }



        }
    }
}
