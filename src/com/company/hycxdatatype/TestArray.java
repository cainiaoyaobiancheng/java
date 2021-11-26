package com.company.hycxdatatype;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

public class TestArray {
    /*public static void main(String[] args){
        int size = 10;
        double[] mylist = new double[size];
        mylist[0] = 5.6;
        mylist[1] = 4.5;
        mylist[2] = 3.3;
        mylist[3] = 13.2;
        mylist[4] = 4.0;
        mylist[5] = 34.33;
        mylist[6] = 34.0;
        mylist[7] = 45.45;
        mylist[8] = 99.993;
        mylist[9] = 11123;

        double total = 0;
        for (int i = 0; i < size;i++){
            total +=mylist[i];
        }
        System.out.println("总和为：" + total);
    }*/


    public static void main(String[] args) {
        double[] myList = {1.9, 2.9, 3.4, 3.5};

        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + "");
        }

        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println("Total is" + total);

        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) max = myList[i];
        }
        System.out.println("Max is" + max);
    }


    /*public static void main(String[] args){
        double[] mylist = {1.9,2.9,3.9,4.9};
        for (double element: mylist){
            System.out.println(element);
        }
    }*/

/*
    public static void  printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i] + "");
        }
    }
    public static void main(String[] args){
        printArray(new int[]{3,2,1,4});
    }
*/

}
