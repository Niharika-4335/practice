package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class ShouldDelete {
    public static void main(String[] args) {
//        List<String> list= Arrays.asList("niahrika","jyo","siva");
//       list.stream().sorted(Comparator.comparing(String::length).reversed()).limit(1).forEach(i-> System.out.println(i));
////     Optional<String> a=  list.stream().max(Comparator.comparing(i->i.length()));
////        System.out.println(a);
//        List<Integer> list1=Arrays.asList(1,3,4,5,6,2,9);
//        Scanner sc=new Scanner(System.in);
//        int k=sc.nextInt();
//        list1.stream().sorted().limit(k).skip(k-1).forEach(i-> System.out.println(i));
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry",
                "banana", "apple");
        Map<String,Integer> hashMap=new HashMap<>();
                words.stream().forEach(i->hashMap.put(i, hashMap.getOrDefault(i,0)+1));
        System.out.println(hashMap);
    }
}
