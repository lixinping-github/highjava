package threads1.li.xin.ping;
import jdk.nashorn.internal.runtime.regexp.joni.exception.InternalException;

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


//        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
//    Thread.currentThread().setName("主线程");
//    Threadtest t1=new Threadtest(true,"线程1");
//
//        t1.setPriority(Thread.MIN_PRIORITY);
//    //解决我主动抛出来的一个异常
//    t1.start();
//
//
//    for (int i=0;i<100;i++) {
//        if (i % 2 != 0){
//        System.out.println(Thread.currentThread().getName()+ "~"+i);
//
//        }
//    }


//        threefifteenwork t1=new threefifteenwork();
//        threefifteenwork t2=new threefifteenwork();
//        threefifteenwork t3=new threefifteenwork();
//        t3.start();
//        t1.start();
//        t2.start();
    Runs r1=new Runs();


    Thread threads1=new Thread(r1);
    Thread threads2=new Thread(r1);
    Thread threads3=new Thread(r1);
    threads1.setName("窗口1");
    threads1.start();
//  746line  run

    threads2.setName("窗口2");
    threads2.start();


    threads3.setName("窗口3");
    threads3.start();

 }


}