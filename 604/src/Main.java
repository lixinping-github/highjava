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

        Comparator comparator = new Comparator() {
            @Override
           public int compare(Object o1, Object o2) {
                if(o1 instanceof Student && o2 instanceof Student){
                    Student s1=(Student)o1;
                    Student s2=(Student)o2;
                    return Integer.compare(s1.getAge(), s2.getAge());

                }else{
                    throw new RuntimeException();
                }

            }
        };
      TreeSet set=new TreeSet(comparator);
        set.add(new Student("lisa",20));
        set.add(new Student("dade",30));
        set.add(new Student("jack",40));
        set.add(new Student("jack",18));
        set.add(new Student("aim",10));
        set.add(new Student("bob",9));



      for (Object o : set) {
          System.out.println(((Student)o).getName()+"~~~"+((Student)o).getAge());
      }
    }
}