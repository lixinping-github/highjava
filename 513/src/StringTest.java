import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import org.junit.Test;
import sun.nio.cs.ext.GBK;

import javax.xml.transform.Result;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Date;

public class StringTest {

//    String str="abc213嘻哈";//321cba  a21cb3


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
//        byte[] bytes= null;
//
//        try {
//            bytes = str.getBytes("GBK");
//        } catch (UnsupportedEncodingException e) {
//            throw new RuntimeException(e);
//        }

//        for (int i=0;i<bytes.length;i++){
//            System.out.println(bytes[i]);
//        }
//        String strs= null;
//        try {
//            strs = new String(bytes,"gbk");
//        } catch (UnsupportedEncodingException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(strs);

//模拟一个trim方法
//        String str="1111";
//
//        System.out.println(str);
//        System.out.println(getCount(str,""));
//
//        long start=0l;
//        long end =0l;
//        StringBuffer str1=new StringBuffer("");
//        start= System.currentTimeMillis();
//        for (int i=0;i<100000;i++){
//            str1.append(String.valueOf(i));
//        }
//        end=System.currentTimeMillis();
//        System.out.println("时间为"+(end-start));  //20
//````````````````````````````````````````````````````````````````````````````````````
//        String str2="";
//        start= System.currentTimeMillis();
//        for (int i=0;i<100000;i++){
//            str2=str2+i;
//        }
//        end=System.currentTimeMillis();
//        System.out.println("时间为"+(end-start));//8068
//````````````````````````````````````````````````````````````````````````````````````
//    StringBuilder str3=new StringBuilder("");
//            start= System.currentTimeMillis();
//            for (int i=0;i<100000;i++){
//                str3.append(String.valueOf(i));
//            }
//            end=System.currentTimeMillis();
//            System.out.println("时间为"+(end-start));//7
//


//        java.util.Date D1=new java.util.Date(1747369477784L);//1747369477784
//        java.sql.Date D2= new java.sql.Date(D1.getTime());
        String s1="哈哈";
        String s2="哈哈";
        System.out.println(s1 ==  s2);


























   }

    //*
    //模仿原生方法trim
    // /

//    public String trimTest(String str){
//            char[] chars= str.toCharArray();
//            String result=new String(chars);
//
//            if(chars[0]==' '){
//                result=new String(Arrays.copyOfRange(chars,1,chars.length));
//
//                    if(chars[chars.length-1] == ' '){
//                        result=new String(Arrays.copyOfRange(result.toCharArray(),0,result.length()-1));
//                    }
//                }else if(chars[chars.length-1] == ' '){
//                result=new String(Arrays.copyOfRange(result.toCharArray(),0,result.length()-1));
//            }
//
//
//            return result;
//        }
        //翻转一个字符串，将字符串中指定部分进行翻转，第一个参数为传入的字符串，
        //第二个参数为翻转起始位置
         //第三个参数为末尾位置，不包含
//        public String reserveTest(String str,int n1,int n2){
//            String result=str;
//            char[] splitArr=result.toCharArray();
//            char[] itemssp=Arrays.copyOfRange(splitArr,n1,n2);
//            for (int i=itemssp.length-1;i>=0;i--){
//                splitArr[n1]=itemssp[i];
//                n1++;
//            }
//            result=new String(splitArr);
//            return result;
//        }
//
//        public String getcount(String str,char a){
//
//        return str;
//    }

    //获取一个字符串在另一个字符串中出现的次数；
//    public int getCount(String str1,String str2){
//        int result=0;
//        char[] charitems1=str1.toCharArray();
//        char[] charitems2=str2.toCharArray();
//        for(int i=0;i<charitems1.length-charitems2.length+1;i++){  //至关重要的一步
//            boolean flag=false;
//            for(int j=0;j<charitems2.length;j++){
//                if(charitems2[j] == charitems1[i+j]){
//                }else{
//                    flag=false;
//                    break;
//                }
//            }
//            if(flag){
//                result++;
//            }
//        }
//            return result;
//    }
    //获取两个字符串中最大的相同子串












}