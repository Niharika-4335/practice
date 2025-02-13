package Collections;
import java.util.*;
import java.util.stream.Stream;
class Student4{
    Integer id;
    Integer rollno;
    Integer age;

    public Student4(Integer id, Integer rollno, Integer age) {
        this.id = id;
        this.rollno = rollno;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRollno() {
        return rollno;
    }

    public void setRollno(Integer rollno) {
        this.rollno = rollno;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public String toString(){
        return id+" "+rollno+" "+age+"\n";
    }

}
public class practise{
    public static void main(String args[]) {
        List<Student4> list=new ArrayList<>();
        list.add(new Student4(1,1,25));
        list.add(new Student4(2,2,40));
        list.add(new Student4(3,3,35));
        list.add(new Student4(4,4,30));
        Stream<Student4> stream=list.stream();
        stream.filter(emp->emp.getAge()>25).map(i->i.getId()).limit(2).forEach(System.out::print);

    }
}
