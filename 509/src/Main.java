//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        //TIP 当文本光标位于高亮显示的文本处时按 <shortcut actionId="ShowIntentionActions"/>
        // 查看 IntelliJ IDEA 建议如何修正。


    }
}


class Lanhan{
    //设置懒汉类实例字段
    private Lanhan lan=null;
    //私有化懒汉
    private Lanhan(){}
    //写一个方法，懒汉方法设置lanhan类
    public Lanhan getlanhan(){
        //不安全问题 当多个线程同时调用此方法，会导致此方法有可能if被执行多次，导致私有字段lan被多次赋值

        synchronized (Lanhan.class){ //此时为线程安全
         if (lan == null){
            lan = new Lanhan();}
            return lan;
        }



    }
}