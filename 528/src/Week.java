public enum Week implements info{
    MONDAY("星期一"){

        @Override
        public void show(){
            System.out.println("1");
        }
    },
    TUESDAY("星期二"){
        @Override
        public void show(){
            System.out.println("2");
        }
    },
    WEDNESDAY("星期三"){
        @Override
        public void show(){
            System.out.println("3");
        }
    },
    THURSDAY("星期四"){
        @Override
        public void show(){
            System.out.println("4");
        }
    },
    FRIDAY("星期五"){
        @Override
        public void show(){
            System.out.println("5");
        }
    },
    SATURDAY("星期六"){
        @Override
        public void show(){
            System.out.println("6");
        }
    },
    SUNDAY("星期天"){
        @Override
        public void show(){
            System.out.println("7");
        }
    };

    String name;
    private Week(String str){
        this.name =str;
    }

}
