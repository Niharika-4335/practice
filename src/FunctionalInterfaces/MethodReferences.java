package FunctionalInterfaces;

import java.util.stream.Stream;

public class MethodReferences {
    public static void print(String s){
        System.out.print(s);
    }
    public static void main(String[] args) {
        String[]a ={"abc","xyz","def","tuv"};
        Stream<String> stream=Stream.of(a);
        stream.forEach(MethodReferences::print);//Method reference -className:static method;


    }
}
