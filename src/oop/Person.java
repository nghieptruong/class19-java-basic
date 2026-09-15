package oop;

public class Person {

    //Khai bao thuoc tinh (attributes)
    private String name;
    private int age;
    private String address;

    //Khai bao phuong thuc (method)
    String getName() {
        return name;
    }

    //Ham setter
    void setName(String name) {
        this.name = name;
    }

    //Ham getter
    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    String getAddress() {
        return address;
    }

    void setAddress(String address) {
        this.address = address;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}
/*
 Khi nao overloading vs override ?
 1. Overloading: xu ly cung 1 logic
 2. Override: lop con co hanh vi khac lop cha (ghi de phuong thuc cua cha)
 */