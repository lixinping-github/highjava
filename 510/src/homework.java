import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class homework implements Runnable {
    /*
     *银行有一个账户
     *两个储户分别向银行同一个账户中存3000元，每次存1000元，存三次。每次存完后打印钱数
     *涉及线程安全问题
     * */
    ReentrantLock lock = new ReentrantLock();
    private int money = 0;

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            lock.lock();//加锁
            try {
                try {
                    Thread.sleep(100);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                money += 1000;
                System.out.println(Thread.currentThread().getName() + "向账户中存钱1000元，目前账户余额" + money + "元");
            } finally {
                lock.unlock();
            }

        }
    }
}
