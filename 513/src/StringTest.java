import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import org.junit.Test;

public class StringTest {

    String str="18671964791";


    @Test
    public void test1(){

       char[] c1=str.toCharArray();
       for (int i=0;i<c1.length;i++){
           System.out.println(c1[i]);
       }

    }
}