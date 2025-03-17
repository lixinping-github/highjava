public class bank implements Runnable{
    public double balane=0;

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            balane += 1000;
            System.out.println(Thread.currentThread().getName()+"存钱，现有余额" + balane);
        }
    }
}
