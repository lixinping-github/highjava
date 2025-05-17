import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.time.*;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {

//        GregorianCalendar g1=new GregorianCalendar();
//        Calendar c1=Calendar.getInstance();
//        System.out.println(c1.get(Calendar.DAY_OF_YEAR));
//        Date d1=new Date(2025-1900,5-1,17);
//        SimpleDateFormat f1=new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
//           System.out.println(f1.format(d1));
//
//        LocalDateTime d1=LocalDateTime.of(2025,5,17,16,15);
//
//        System.out.println(d1);
//
//        System.out.println(d1.plusDays(10));
//        Instant s1=Instant.now();
//        System.out.println(s1);


        LocalDateTime d1=LocalDateTime.now();
        System.out.println(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss").format(LocalDateTime.now()));

    }
}