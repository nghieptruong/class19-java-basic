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
         */

        //Ham nhap tu ban phim
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int input = sc.nextInt();
        System.out.println(input);

    }
}
