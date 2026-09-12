package basic;

import java.util.Random;
import java.util.Scanner;

public class ExLoop {
    public static void main(String[] args) {
        /*
            He thong se sinh ra 1 con so ngau nhien (so nguyen duong)
            Nguoi dung nhap 1 so n (so nguyen) de doan con so ngau nhien tu he thong
            Neu doan dung --> In ra "You win !"
            Nguoc lai doan sai --> In ra "Try again ! System random number: <random>" va prompt "Enter your number: " de nhap lai
            Chu y: moi lan doan sai --> he thong random lai con so
            Ket qua:
                Enter your number: 5
                You win !

                Enter your number: 4
                Try again ! System random number: 5
                Enter your number: 3
                Try again ! System random number: 1

            Gợi ý: dùng vòng lặp để lặp lại khi người dùng đoán sai --> lặp đến khi người dùng đoán đúng
            - Kiem tra nhap sai (co nem exception): ung dung try...catch...
            - Su dung mang 2 chieu: luu hang dau tien: la tat ca so random boi he thong
                                        hang thu 2: la tat ca so ban doan
            - In ra ket qua: Ket qua game:
                  System:  2 | 4 | 6
                    User:  3 | 1 | 6

         */

        //Ham nhap tu ban phim

        boolean isContinue = false;
        int[][] storedResult = new int[2][100];
        int count = 0;
        do {
            Scanner sc = new Scanner(System.in);
            int input = 0;
            try {
                System.out.println("Enter your number [1 - 10]: ");
                String inputString = sc.nextLine(); // nhap chuoi
                input = Integer.parseInt(inputString); // chuyen doi chuoi sang so
                Random random = new Random();
                int systemRandom = random.nextInt(1, 11);
                storedResult[0][count] = systemRandom;
                storedResult[1][count] = input;
                count++;

                if(input == systemRandom) {
                    System.out.println("You win !");
                    isContinue = false;
                } else {
                    System.out.println("Try again ! System random number: " + systemRandom);
                    isContinue = true;
                }
            } catch (Exception e) {
                //Lap lai
                System.out.println("Invalid input. Please retry !");
                isContinue = true;
            }
        } while(isContinue);

        System.out.println("We recorded your effort: ");
        for (int i = 0; i < storedResult.length; i++) {
            if(i == 0) {
                System.out.println("System records: ");
            } else {
                System.out.println("User records: ");
            }

            for (int j = 0; j < count; j++) {
                System.out.print(storedResult[i][j] + " | ");
            }
            System.out.println();
        }

    }
}
