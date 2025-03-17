public class SingletonTest {
    private SingletonTest(){

    }//将构造器私有化

    private static SingletonTest single=null;

    public static  SingletonTest getSingletonTest(){
        if (single==null){

            synchronized(SingletonTest.class){
                if (single==null){
                    single=new SingletonTest();
                }
            }
        }

        return single;
    }

}
