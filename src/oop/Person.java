package oop;

public class Person {

    //Khai bao thuoc tinh (attributes)
    String name;
    int age;
    String address;

    //Khai bao phuong thuc (method)
    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    String getAddress() {
        return address;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}
