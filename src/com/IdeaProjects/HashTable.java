package com.IdeaProjects;

public class HashTable {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,2};
        int[] Hasharray=new int[arr.length];
        int i=0;
        for(int a:arr ){
            Hasharray[a]=i++;
        }
        for(int j=0;i<Hasharray.length;i++){
            System.out.println(Hasharray[j]);
        }
    }
}
