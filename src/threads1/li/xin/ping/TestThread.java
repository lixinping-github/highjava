package threads1.li.xin.ping;
import java.lang.Thread;
import java.lang.Runnable;


public class TestThread extends Thread {
    private Runnable target;


    @Override
    public void run() {
        super.run();
        for (int i=0;i<100;i++){
            if(i%2 == 0){
                System.out.println(Thread.currentThread().getName()+"~"+i);
            }
        }
    } //重写run方法


}
