public  class Season {
    //声明Season对象的属性
    private final String seasonName;
    private final String seasonDesc;
    //声明私有化构造器
    private  Season(String seasonName,String seasonDesc){
        this.seasonName =seasonName;
        this.seasonDesc=seasonDesc;
    }

    public static final Season SPRING=new Season("春天","春暖花开");
    public static final Season SUMMER=new Season("夏天","夏日炎炎");
    public static final Season AUTUMN=new Season("秋天","秋有蚊子");
    public static final Season Winter=new Season("冬天","冬日炎炎");
    public String getSeasonName(){
        return this.seasonName;
    }
    public String getSeasonDesc(){
        return this.seasonDesc;
    }
    public enum heart{
        HAPPY("高兴"),
        SAD("悲伤"),
        POLITE("礼貌"),
        ANGRY("生气");
        String heartName;
        private heart(String heartName){
            this.heartName=heartName;
        }
    }
}
