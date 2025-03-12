package threads1.li.xin.ping;
import java.lang.Thread;
import java.lang.Runnable;


public class TestThread extends Thread {
    private Runnable target;
    @Override
    public void run() {
        if (target != null) {
            target.run();
        }
    } //重写run方法
    public void starts(){
        for (int i=0;i<100;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }

}
