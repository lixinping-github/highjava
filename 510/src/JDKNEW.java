import java.util.concurrent.Callable;

public class JDKNEW implements Callable {
    private int count=0;
    private int num=0;
    @Override
    public Object call() throws Exception {
        while (true){
            if (count %2 ==0){
                num+=count;
            }
            if(count<100){
                count++;
                System.out.println(count);
            }else {
                break;
            }
        }
        return num;
    }
}
