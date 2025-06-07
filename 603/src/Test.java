import java.time.LocalDate;
import java.util.*;

public class Test {
    @org.junit.Test
    public void Test1(){
        String[] s1={"MM","MM","MM"};
       for(String s:s1){
           s="GG";
       }

        for(int i=0;i<s1.length;i++){
            System.out.println(s1[i]);
        }
        Collection coll=new LinkedList();
        coll.add(new Person("张三",12, LocalDate.of(2025,1,12)));

        coll.add(new Person("张三",12, LocalDate.of(2025,1,12)));

        coll.forEach(System.out::println);


    }

}
