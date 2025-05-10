//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    static final Object resourceA = new Object();
    static final Object resourceB = new Object();
    public static void main(String[] args) {
        //TIP 当文本光标位于高亮显示的文本处时按 <shortcut actionId="ShowIntentionActions"/>
        // 查看 IntelliJ IDEA 建议如何修正。
 Thread t1 = new Thread(() -> {
            synchronized (resourceA) {
                System.out.println("Thread 1: locked resource A");
                try { Thread.sleep(100); } catch (InterruptedException ignored) {}
                synchronized (resourceB) {
                    System.out.println("Thread 1: locked resource B");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (resourceB) {
                System.out.println("Thread 2: locked resource B");
                try { Thread.sleep(100); } catch (InterruptedException ignored) {}
                synchronized (resourceA) {
                    System.out.println("Thread 2: locked resource A");
                }
            }
        });

        t1.start();
        t2.start();

    }
}


class Lanhan{
    //设置懒汉类实例字段
    private static Lanhan lan=null;
    //私有化懒汉
    private Lanhan(){}
    //写一个方法，懒汉方法设置lanhan类
    public static synchronized Lanhan getlanhan(){
        //不安全问题 当多个线程同时调用此方法，会导致此方法有可能if被执行多次，导致私有字段lan被多次赋值

         //此时为线程安全
         if (lan == null){
            lan = new Lanhan();
         }
            return lan;




    }
}