package threads1.li.xin.ping;
import java.lang.Thread;
public class Test {

//run subject at main thread
    public static void main(String... args){
//    new Thread(){
//
//        @Override
//        public void run(){
//            Thread.currentThread().setName("线程1");
//            for (int i=0;i<100;i++){
//                if (i %2 ==0)
//                System.out.println(Thread.currentThread().getName() + "~" + i);
//            }
//        }
//    }.start();
//    //--------------------------------------------------------------------------------
//
//        new Thread(){
//            @Override
//            public void run(){
//                Thread.currentThread().setName("线程2");
//                for (int i=0;i<100;i++){
//                    if (i %2 !=0)
//                        System.out.println(Thread.currentThread().getName() + "~" + i);
//                }
//            }
//        }.start();
//

    Thread.currentThread().setName("主线程");
    Threadtest t1=new Threadtest(true,"线程1");

    t1.start();

    for (int i=0;i<100;i++){
        if (i % 2 != 0)
        System.out.println(Thread.currentThread().getName()+ "~"+i);
    }







 }


}