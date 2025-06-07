import com.sun.xml.internal.ws.developer.Serialization;

import java.util.Comparator;


public class Student implements Comparable<Student> {
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
        result = 31*result+age;
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
//    @Override
//    public int compare(Student stu1,Student stu2){
//        return stu1.getName().compareTo(stu2.getName())+stu1.getAge()-stu2.getAge();
//    }

    @Override
    public int compareTo(Student stu){
        return  this.getName().compareTo(stu.getName());

    }
}
