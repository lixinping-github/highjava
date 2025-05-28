public class mouse1 extends  mouse {

    public mouse1(int mon){
        this.money =mon;
    }
    @Override
    public void run(){
        System.out.println("鼠标可以快速运行价格为"+this.money);
    }

}
