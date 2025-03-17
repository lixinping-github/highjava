public class Main {
    public static void main(String[] args) {

//        ticket t =new ticket();
//
//        Thread t1=new Thread(t);
//        Thread t2=new Thread(t);
//        Thread t3=new Thread(t);
//        t1.start();
//        t2.start();
//        t3.start();
        bank b=new bank();
        Thread t1=new Thread(b);
        Thread t2=new Thread(b);
        t1.start();
        t2.start();

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println( b.balane);
    }
}