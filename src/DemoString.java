

public class DemoString {
    public static void main(String[] args) {
        //Interview: So sanh 2 String (chuoi), tai sao khong dung dau == ?
        //Tra loi:
        // ==: so sanh 2 dia chi
        // equals(): so sanh noi dung

        String x = "Hello";
        System.out.println(System.identityHashCode(x)); // 1791741888
        String y = "Hello";
        System.out.println(System.identityHashCode(y)); // 1791741888
        String z = new String("Hello"); // ko khuyen khich
        System.out.println(System.identityHashCode(z)); // 1595428806
        String t = z.intern();
        System.out.println(System.identityHashCode(t)); // 1791741888

        System.out.println(x == z);

//        if(x.equals(y)) {
//            System.out.println("Bang nhau");
//        } else {
//            System.out.println("Khong Bang Nhau");
//        }

//        if(x.equals(z)) {
//            System.out.println("Bang nhau");
//        } else {
//            System.out.println("Khong Bang Nhau");
//        }

//        if(x == z) {
//            System.out.println("Bang nhau");
//        } else {
//            System.out.println("Khong Bang Nhau");
//        }

        System.out.println("=================");
        //String is immutable (ko dc phep chinh sua)
        //chuyen doi sang lowercase
        String name = "jOHn";
        String newName = name.toLowerCase(); // chuyen sang chuoi ky tu thuong
        System.out.println(newName);
        System.out.println(name); // jOHn

        System.out.println("=================");
        String values = "Welcome To Java Programming";
        String[] arr = values.split(" "); // tach chuoi
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);

        System.out.println("=================");
        char[] charArrs = name.toCharArray(); // chuyen doi String sang char[] (chuyen doi chuoi --> mang cac ky tu)
        System.out.println(charArrs[0]);
        System.out.println(charArrs[1]);
        System.out.println(charArrs[2]);
        System.out.println(charArrs[3]);

        System.out.println("=================");
        String m = "100";
        System.out.println(m + 1); // noi chuoi --> 1001
        int n = Integer.parseInt(m); //chuyen doi chuoi -> so
        System.out.println(n + 1); // 101

    }
}
