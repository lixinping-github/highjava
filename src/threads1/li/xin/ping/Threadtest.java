package threads1.li.xin.ping;
import java.lang.Thread;
import java.lang.Runnable;


public class Threadtest extends Thread {
    private Runnable target;
    boolean bol;
    public Threadtest(boolean bol,String name){
        super(name);
        this.bol=bol;

    }
//用来查找0--100之间的偶数
    @Override
    public void run() {
        super.run();
        this.yield();
        for (int i=0;i<100;i++){
            if (bol){
                if(i%2 == 0){
                    System.out.println(Thread.currentThread().getName()+"~"+i);
                }
            }else{
                if(i%2 != 0){
                    System.out.println(Thread.currentThread().getName()+"~"+i);
                }
            }

        }
    } //重写run方法

 public static void he(){
        System.out.println("哈哈哈嗝");
 }
}
