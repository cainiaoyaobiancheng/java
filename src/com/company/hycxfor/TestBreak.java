package com.company.hycxfor;

public class TestBreak {
    public static void main(String[] args){
        int [] numbers = {10,23,24,56};
        for (int x : numbers){

            if(x > 24){
                break;
            }

            System.out.println(x);
        }
    }

}
