package threads1.li.xin.ping;
import java.lang.Thread;
import java.lang.Runnable;


public class Threadtest extends Thread {
    private Runnable target;

//用来查找0--100之间的偶数
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
