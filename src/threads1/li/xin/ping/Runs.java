package threads1.li.xin.ping;
import javax.sql.rowset.Joinable;

import static java.lang.System.*;
public class Runs implements Runnable{ //run方法调用runnable接口
    private int count = 100;

    public Runs(){

    }
    Object obj=new Object();
    public void run(){
        synchmothed();

    }

    public synchronized void synchmothed(){
        while(true){

                if (count > 0) {
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    count--;

                    out.println(Thread.currentThread().getName() + "卖出了1张票，现在还剩" + count + "张票");

                } else {
                    break;
                }
        }
    }


}
