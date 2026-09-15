package oop;

public class DemoOverloading {
    public static void main(String[] args) {
        System.out.println("Add 2 number");
        int sum1 = add(1, 2);
        System.out.println(sum1);

        System.out.println("Add 3 number");
        int sum2 = add(1, 2, 3);
        System.out.println(sum2);

        System.out.println("Add int + double");
        double sum3 = add(1, 2.5);
        System.out.println(sum3);
    }
    //Tinh chat overloading:
    // 1. Cung ten ham (name giong nhau)
    // 2. Khac tham so (xet ve tham so):
    //      2.1. Khac so luong tham so
    //      2.2. Cung so luong tham so, phai khac kieu tham so
    //      2.3. Cung so luong tham so, phai khac thu tu kieu tham so

    //add 2 number
    public static int add(int x, int y) {
        return x + y;
    }

    //add 3 number
    public static int add(int x, int y, int z) {
        return x + y + z;
    }

    //add 1 so nguyen + 1 so thap phan
    public static double add(int x, double y) {
        return x + y;
    }

    //add 1 so thap phan + 1 so nguyen
    public static double add(double x, int y) {
        return x + y;
    }


}
