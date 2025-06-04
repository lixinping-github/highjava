import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {


    }

    /**
     *
     * ArrayList
     * LinkedList
     * Vector 三者异同
     *
     *
     */
    @Test
    public void test1(){

       ArrayList list =new ArrayList();
       list.add(1);
       list.add("张三");
       list.add(false);
       list.add(1);
       list.add(1,true);
       list.set(0,"李四");

       System.out.println(list.subList(0,2));
    }
}