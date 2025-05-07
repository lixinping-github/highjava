package threads1.li.xin.ping;

import static java.lang.System.out;

public class threefifteenwork  extends Thread{
    private static int  count=100;
    @Override
    public void run() {
        super.run();

        while (true){
            if(count >0){
                out.println(Thread.currentThread().getName()+"卖出一张票，现在还有"+count+"张票");
                count--;
            }else {
                break;
            }
        }







    }



}
