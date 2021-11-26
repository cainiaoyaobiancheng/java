package com.company.hycxdog;

public class Dog {
    int dogAge;

    public Dog(String name) {
        System.out.println("小狗的名字：" + name);
    }

    public void setDogAge(int age) {
        dogAge = age;
    }

    public int getDogAge() {
        System.out.println("小狗的年龄为：" + dogAge);
        return dogAge;
    }

    public static void main(String[] args) {
        Dog myDog = new Dog("tomy");
        myDog.setDogAge(2);
        myDog.getDogAge();
        System.out.println("变量值：" + myDog.dogAge);
    }
}
