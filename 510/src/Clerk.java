public class Clerk {

    private int count =0;
    public int GetCount(){
        return this.count;
    }
    public synchronized void produceProduct() {
        if (count>=20){

            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
       if (count<20){
            count++;
           System.out.println(Thread.currentThread().getName()+"开始生产第"+count+"个产品");
           notify();
       }
    }

    public synchronized void consumeProduct() {
        if (count<=0){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
            if(count>0) {
                count--;
                System.out.println(Thread.currentThread().getName() + "开始生产第" + count + "个产品");

            notify();
            }
    }
}
