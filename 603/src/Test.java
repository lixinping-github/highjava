import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Test {
    @org.junit.Test
    public void Test1(){
        Collection coll3 = new ArrayList();
        coll3.add(123);
        coll3.add(456);
        coll3.add(false);

       for(Object o : coll3){
           System.out.println(o);
       }




    }

}
