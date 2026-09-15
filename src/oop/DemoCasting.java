package oop;

public class DemoCasting {
    public static void main(String[] args) {
        Person p = new Person();
        Student s = new Student();
        s.setName("John");
        s.setAge(30);
        s.setAddress("123 Street A");

        p = s; // upcasting

        //truy cap (goi) phuong thuc viewGrade --> downcasting
        ((Student) p).viewGrade();

        Teacher t = new Teacher();
        t.setName("Mr Tom");
        t.setAge(55);
        t.setAddress("456 Street B");

        p = t;
        ((Teacher) p).research();

        System.out.println("-----------");

        //display student info
        display(s);
        System.out.println("-----------");
        //display teacher info
        display(t);
    }
    //Upcasting: cho phep truyen doi tuong con
    public static void display(Person p) {
//        System.out.println(p.getName());
//        System.out.println(p.getAge());
//        System.out.println(p.getAddress());

        p.displayInfo();
    }

}
