package threads1.li.xin.ping;
import java.lang.Thread;
public class Test {

//run subject at main thread
    public static void main(String... args){
    Threadtest t1=new Threadtest(true);
    t1.start();
    Threadtest t2= new Threadtest(false);
    t2.start();


    }


}
