package threads1.li.xin.ping;

public class Test {

//run subject at main thread
    public static void main(String... args){
         Thread t1= new Thread(){
            @Override
            public void run() {
                super.run();


                for(int i=0;i<100;i++){
                    if(i%2 == 0){
                        System.out.println(Thread.currentThread().getName()+"~"+i);
                        setName("lixinping1");
                    }
                }
            }
        };
        t1.start();

        Thread t2= new Thread(){
            @Override
            public void run() {
                super.run();

                this.setPriority(7);
                for(int i=0;i<100;i++){
                    if(i%2 == 0){
                        System.out.println(Thread.currentThread().getName()+"~"+i);
                        setName("lixinping2");
                    }
                }
            }
        };
        t2.start();
        //,注释

    }






}
