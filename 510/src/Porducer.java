public class Porducer extends Thread{
    private Clerk clerk;
    public Porducer(Clerk clerk){
        this.clerk=clerk;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + "开始生产...");

            try {
                sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            clerk.produceProduct();


        }
    }




}
