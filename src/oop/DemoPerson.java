package oop;

public class DemoPerson {
    public static void main(String[] args) {
        //khoi tao 1 doi tuong co kieu Person
        Person p1 = new Person(); //instance cua Person
        System.out.println(p1.name); // null
        System.out.println(p1.age); // 0
        System.out.println(p1.address); // null

        //Gan gia tri cho thuoc tinh cua p1
        p1.name = "John";
        p1.age = 20;
        p1.address = "123 Street A";

        System.out.println("After set values:");
        System.out.println(p1.name); // John
        System.out.println(p1.age); // 20
        System.out.println(p1.address); // 123 Street A

        System.out.println("Call instance method p1");
        p1.getName();
        p1.displayInfo();

        System.out.println("------------");
        //Khai bao doi tuong p2 co kieu Person
        Person p2 = new Person(); //instance cua Person
        p2.name = "Alice";
        p2.age = 30;
        p2.address = "345 Street B";
        System.out.println(p2.name); // Alice
        System.out.println(p2.age); // 30
        System.out.println(p2.address); // 345 Street B
        System.out.println("Call instance method p2");
        p2.getName();
        p2.displayInfo();
    }
}
