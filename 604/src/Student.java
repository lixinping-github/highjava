public class Student {
    private String name;
    private int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode(){
        int result= name!=null ? name.hashCode() : 0;
        result = result+age;
        System.out.println(result);
        System.out.println("调用了");
        return result;

    }

    @Override
    public boolean equals(Object stu) {
        if(stu instanceof Student){
            Student stu2 = (Student) stu;
            return stu2.getName().equals(this.getName()) && stu2.getAge() == this.getAge();
        }
        else{
            return false;
        }
    }
}
