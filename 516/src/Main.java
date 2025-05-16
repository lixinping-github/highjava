import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        GregorianCalendar g1=new GregorianCalendar();
        Calendar c1=Calendar.getInstance();
        System.out.println(c1.get(Calendar.DAY_OF_YEAR));
    }
}