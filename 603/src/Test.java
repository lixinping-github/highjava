import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

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




    }

}
