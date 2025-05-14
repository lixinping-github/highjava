import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import org.junit.Test;
import sun.nio.cs.ext.GBK;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class StringTest {

    String str="abc213嘻哈";//321cba  a21cb3


    @Test
    public void test1(){

//       char[] c1=str.toCharArray();
//       char[] c2=new char[6];
//       for (int i=0;i<c1.length;i++){
//                c2[c2.length-i-1]=c1[i];
//       }
//       char item;
//       item= c2[0];
//       c2[0]=c2[c2.length-1];
//       c2[c2.length-1]=item;
//       System.out.println(c2);
        byte[] bytes= null;

            bytes = str.getBytes(StandardCharsets.UTF_8);

        for (int i=0;i<bytes.length;i++){
            System.out.println(bytes[i]);
        }
    }
}