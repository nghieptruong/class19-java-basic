public class DemoArray {
    public static void main(String[] args) {
        //khai bao 1 mang so nguyen
        int[] arrNumbers = new int[5];
        System.out.println(arrNumbers[0]); // 0
        System.out.println(arrNumbers[1]); // 0
        System.out.println(arrNumbers[2]); // 0
        System.out.println(arrNumbers[3]); // 0
        System.out.println(arrNumbers[4]); // 0
//        System.out.println(arrNumbers[5]); // Index 5 out of bounds for length 5

        //gan gia tri cho tung phan tu trong mang
        arrNumbers[0] = 10;
        arrNumbers[1] = 3;
        arrNumbers[2] = 5;
        arrNumbers[3] = 3;
        arrNumbers[4] = 9;
        for (int i = 0; i < arrNumbers.length; i++) {
            System.out.println(arrNumbers[i]);
        }

        System.out.println("------------");
        int[] arrNumber2 = {3, 5, 8, 9};
        System.out.println(arrNumber2.length); // 4

        System.out.println("------------");
        String[][] arrStrings = new String[2][3];
        arrStrings[0][0] = "Hello";
        arrStrings[0][1] = "Java";
        arrStrings[0][2] = "Language";

        arrStrings[1][0] = "Welcome";
        arrStrings[1][1] = "Testing";
        arrStrings[1][2] = "Class";

        //Hello Java Language
        //Welcome Testing Class
        for (int row = 0; row < arrStrings.length; row++) {
            for (int col = 0; col < arrStrings[0].length; col++) {
                System.out.print(arrStrings[row][col] + " ");
            }
            System.out.println();
        }
    }
}
