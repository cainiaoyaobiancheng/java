package com.company.hycxfor;

public class TestContinue {
    public static void main(String[] args){
        int [] numbers = {1,12,23,34};
        for(int x : numbers){
            if( x == 23){
                continue;
            }
            System.out.println(x);
            System.out.println("\n");
        }
    }
}
