package threads1.li.xin.ping;
import java.lang.Thread;
public class Test {

//run subject at main thread
    public static void main(String... args){

        ThreadTest1 test1=new ThreadTest1();
        Thread th=new Thread(test1);
        th.start();   //可以放多
    }


}
