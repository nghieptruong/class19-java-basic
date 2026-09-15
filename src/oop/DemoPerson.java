package oop;

public class DemoPerson {
    public static void main(String[] args) {
        //khoi tao 1 doi tuong co kieu Person
        Person p1 = new Person(); //instance cua Person
        System.out.println(p1.getName()); // null
        System.out.println(p1.getAge()); // 0
        System.out.println(p1.getAddress()); // null

        //Gan gia tri cho thuoc tinh cua p1
        p1.setName("John");
        p1.setAge(20);
        p1.setAddress("123 Street A");

        System.out.println("After set values:");
        System.out.println(p1.getName()); // John
        System.out.println(p1.getAge()); // 20
        System.out.println(p1.getAddress()); // 123 Street A

        System.out.println("Call instance method p1");
        p1.getName();
        p1.displayInfo();

        System.out.println("------------");
        //Khai bao doi tuong p2 co kieu Person
        Person p2 = new Person(); //instance cua Person
        p2.setName("Alice");
        p2.setAge(30);
        p2.setAddress("345 Street B");
        System.out.println(p2.getName()); // Alice
        System.out.println(p2.getAge()); // 30
        System.out.println(p2.getAddress()); // 345 Street B
        System.out.println("Call instance method p2");
        p2.getName();
        p2.displayInfo();
    }
}
