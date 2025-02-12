package com.IdeaProjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class Student2{
    private String name;
    private Integer age;

    public Student2(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
    public String toString(){
        return name+" "+age+" ";
    }
}
public class StreamExample1 {
    public static int sortName(Student2 s1,Student2 s2){
       return s1.getName().compareTo(s2.getName());
    }
    public static int  sortAge(Student2 s1,Student2 s2){
        return s1.getAge().compareTo(s2.getAge());

    }

    public static void main(String[] args) {
        List<Student2> list=new ArrayList<>();
        list.add(new Student2("Vicky", 24));
        list.add(new Student2("niharika", 21));
        list.add(new Student2("anil", 20));
        Collections.sort(list,StreamExample1::sortName);
        Stream<Student2> stream=list.stream();
        System.out.println("sorting by name");
        stream.forEach(System.out::println);
        Collections.sort(list,StreamExample1::sortAge);
        Stream<Student2> stream1=list.stream();
        System.out.println("sorting by age");
        stream1.forEach(System.out::println);


    }
}
