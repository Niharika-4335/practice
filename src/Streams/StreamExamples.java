package Streams;

import java.util.ArrayList;
import java.util.List;

public class StreamExamples {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
            list.spliterator().forEachRemaining(x -> {System.out.println("print" + x);});
        list.stream().forEach(i->System.out.println(i));//streams internally work using spliterator
    }
}
