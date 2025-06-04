import org.junit.Test;

import java.util.*;

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
        Set set=new HashSet();
        set.add(1);
        set.add(2);
        set.add(-1);
        set.add("张三");
        set.add("<UNK>");
        set.add(123);

        for(Object o:set){
            System.out.println(o);
        }

    }


}