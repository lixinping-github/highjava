package threads1.li.xin.ping;
import static java.lang.System.*;
public class threefifteenwork  extends Thread{
    int count=0;
    @Override
    public void run() {
        super.run();

            for (int i=0;i<100;i++){
                if(i%2==0){
                   out.println(Thread.currentThread().getName()+"~"+i);
                }
            }


    }



}
