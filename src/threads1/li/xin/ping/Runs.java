package threads1.li.xin.ping;
import static java.lang.System.*;
public class Runs implements Runnable{ //run方法调用runnable接口
    private int count = 100;


    public void run(){

        while(true){

            if(count>0){

                count--;
                out.println(Thread.currentThread().getName()+"卖出了1张票，现在还剩"+count+"张票");

            }else{
                break;
            }

        }
    }
}
