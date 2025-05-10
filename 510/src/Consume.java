public class Consume extends  Thread {
private Clerk clerk;
    public Consume(Clerk clerk){
        this.clerk=clerk;
    }

    @Override
    public void run() {

        while (true) {
            synchronized (Clerk.class) {


                clerk.consumeProduct();
                System.out.println(Thread.currentThread().getName() + "开始消费..."+clerk.GetCount());

                try {
                    sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }

        }
    }


}
