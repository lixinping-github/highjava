import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private LocalDate birthday;

    public Person(String name, int age, LocalDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setBirthday(LocalDate birthday){
        this.birthday=birthday;
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, age, birthday);
    }

    public String getName(){
        return this.name;
    }
    public int getInt(){
        return this.age;
    }
    public LocalDate getBirthday(){
        return this.birthday;
    }



}
