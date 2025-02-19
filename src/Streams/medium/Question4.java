package Streams.medium;
import java.util.Arrays;
import java.util.List;
public class Question4 {
    public static boolean DuplicateCharacter(String s){
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    return true;
                }
            }


        }
        return false;
    }

    public static void main(String[] args) {
        List<String> list=Arrays.asList("niharika","xyz","aab","abc");
//        list.stream().filter(Question4::DuplicateCharacter).forEach(i-> System.out.println(i));
        list.stream().filter(s->s.length() !=s.chars().distinct().count()).forEach(i-> System.out.println(i));

    }
}
