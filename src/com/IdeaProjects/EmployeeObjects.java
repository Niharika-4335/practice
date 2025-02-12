package com.IdeaProjects;

import java.util.*;
import java.util.stream.Stream;

class Employee8{
    String name;
    Integer id;
    Integer salary;
    String dept;

    public Employee8(String name, Integer id, Integer salary, String dept) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getDept() {
        return dept;
    }
    public String toString(){
        return name+" "+id+" "+salary+" "+dept;
    }
}

public class EmployeeObjects {
    public static void main(String[] args) {
        List<Employee8> list=new ArrayList<>();
        list.add(new Employee8("niharika",1,3000,"QA"));
        list.add(new Employee8("abc",2,2000,"dev"));
        list.add(new Employee8("xyz",3,5000,"dev"));
        list.add(new Employee8("def",4,4000,"QA"));
        System.out.print(list);

//        HashMap<List<Employee>,Integer> hashMap=new HashMap();
//        for(Map.Entry<List<Employee>,Integer> entry:hashMap.entrySet()){
//
//        }
//        Stream<Employee8> stream=list.stream();
//     Comparator<Employee8> comparator=(emp1,emp2)->{return emp2.getSalary().compareTo(emp1.getSalary());};
//        stream.map(Employee8::getSalary).sorted().forEach(i-> System.out.println(i));

    }
}
