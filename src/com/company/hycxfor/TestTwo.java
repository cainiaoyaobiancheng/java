package com.company.hycxfor;

public class TestTwo {
   public static void main(String[] args){
       int [] numbers = {1,2,3,4};
       for (int x : numbers){
           System.out.println(x+",");
       }
       System.out.println("\n");
       String [] names = {"jame","larrt"};
       for(String name : names){
           System.out.println(name);
           System.out.println(",");
       }
   }
}
