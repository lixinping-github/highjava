package threads1.li.xin.ping;
import java.lang.Thread;
public class Test {

//run subject at main thread
    public static void main(String... args){

        ThreadTest1 test1=new ThreadTest1();
        ThreadTest1 test2=new ThreadTest1();
        new Thread(test1).start();
        new Thread(test2).start();
           //可以放多个
        for(int i= 0;i<100;i++){
            if (i %2 != 0){
                System.out.println(Thread.currentThread().getName()+i);
            }
        }
    }


}
