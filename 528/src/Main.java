import java.util.Arrays;
import java.util.Scanner;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
//        mouse m1=new mouse1(21);
//        mouse m2=new mouse2(23);
//        mouse m3=new mouse2(65);
//        mouse m4=new mouse2(10);
//        mouse m5=new mouse2(30);
//        mouse[] marr=new mouse[5];
//        marr[0]=m1;
//        marr[1]=m2;
//        marr[2]=m3;
//        marr[3]=m4;
//        marr[4]=m5;
//        Arrays.sort(marr,marr[0]);
//        for (int i=0;i<marr.length;i++){
//            System.out.println(marr[i].money);
//        }
//        Scanner scan=new Scanner(System.in);
//        int i=scan.nextInt();
//        if(i==1){
//            System.exit(i-4);
//        }
//
//        System.out.println(System.getProperty("java.version"));
//        System.out.println(System.getProperty("java.home"));
//        System.out.println(System.getProperty("os.name"));
//        System.out.println(System.getProperty("os.version"));
//        System.out.println(System.getProperty("user.name"));
//        System.out.println(System.getProperty("user.home"));
//        System.out.println(System.getProperty("user.dir"));


//    Season s1=Season.SUMMER;
//    System.out.println(s1);
//        Week[] weeks = Week.values();
//        Thread.State[] states = Thread.State.values();
//        for (int i = 0; i < states.length; i++) {
//            System.out.println(states[i]);
//        }
//        System.out.println(Season.heart.SAD.heartName);
//

        try {
            Week es= Week.valueOf("MONDAY");
            System.out.println(es);
        }catch (Exception e) {
            System.out.println("没找到");
        }


    }
}