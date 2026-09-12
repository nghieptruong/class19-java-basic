package basic;

public class DemoWhileLoop {
    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Hello");
//        }

        int i = 6;
        while(i <= 5) {
            System.out.println("Hello");
            i++;
        }

        System.out.println("-------------");
        int j = 6;
        do {
            System.out.println("Hello");
            j++;
        } while(j <= 5);

        System.out.println("-------------");
        int k = 1;
        while(k <= 5) {
            System.out.println("Hello " + k);
            if(k == 3)
                break; //thoat vong lap
            k++;
        }

        System.out.println("-------------");

        for(int m = 1; m <= 5; m++) {
            if(m == 3)
                continue; //bo qua khi m == 3
            System.out.println("Hello " + m);
        }


    }
}
