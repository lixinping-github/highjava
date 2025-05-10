//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
//        window windows=new window();
//        Thread th1=new Thread(windows);
//        Thread th2=new Thread(windows);
//        Thread th3=new Thread(windows);
//        th1.setName("窗口1");
//        th2.setName("窗口2");
//        th3.setName("窗口3");
//
//        th1.start();
//        th2.start();
//        th3.start();

        homework work=new homework();
        Thread t1=new Thread(work);
        Thread t2=new Thread(work);
        t1.setName("张三");
        t2.setName("李四");

        t1.start();
        t2.start();
    }
}