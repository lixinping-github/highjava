import java.util.Comparator;

public class mouse  implements Comparator<mouse> {

    int money=10;
    public mouse(){

    }

     public void run(){
        System.out.println("鼠标可以运行");
    }


    @Override
    public int compare(mouse o1, mouse o2) {
        if(o1.money>o2.money)
            return -1;
        else if(o1.money < o2.money)
            return 1;
        else
            return 0;
    }
}
