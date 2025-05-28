public class mouse2 extends  mouse{
     public mouse2(int mon){
            this.money =mon;
        }
     @Override
        public void run(){
            System.out.println("鼠标可以慢速运行价格为"+this.money);
        }
}
