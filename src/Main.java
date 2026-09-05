//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//    public static void main(String[] args) {
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
////        Ctrl + ? (windows), Cmd + ? (Mac)
////        = -> phép gán
//        int number = 10;
//
////        xuất ra màn hình
////        println -> xuất giá trị ra màn hình và
////        xuống dòng
////        print -> xuất giá trị ra màn hình
//        System.out.println("Hello, World!");
//        System.out.println(number);
//
//        double diemTrungBinh = 8.5;
//        boolean daTotNghiep = true;
//        System.out.println(diemTrungBinh);
//        System.out.println(daTotNghiep);
//
////        họ tên: Nguyen Van A
////        => chia làm 2 chuỗi và được nối với nhau
////        bởi dấu +
//
//        String hoTen = "Nguyen Van A";
//        System.out.println("Họ tên: " + hoTen);
//
////        các phép toán
////        1. + - * /(chia lấy nguyên) % (chia lấy dư)
////        phép +
//        int so1 = 10;
//        int so2 = 20;
//        int ketQua = so1 + so2;
//        System.out.println("Tổng 2 số là: " + ketQua);
//        int so3 = 30;
//        int ketQua1 = so1 + so2 + so3;
//        System.out.println("Tổng 3 số là: " + ketQua1);
//
//        int so4 = so3++;
////        gán giá trị hiện tại so3 cho so4
////        tăng giá trị so3 lên 1 đơn vị
////        so4 = 30, so3 = 31
//        System.out.println("so4 = " + so4);
//        System.out.println("so3 = " + so3);
//
//        int so5 = ++so3;
////        tăng so3 lên 1 đơn vị
////        gán so3 cho so5
////        ++ => tăng giá trị lên 1 đơn vị
////        so3 tăng lên 1 đơn vị, đồng thời gán giá trị mới so4
//        so3 += 2;  // so3 = so3 + 2
//
////        Phép trừ -
//        int so6 = 10;
//        int so7 = 5;
//        int minors = so6 - so7;
//        System.out.println("so6 - so7 = " + minors);
////        --, -=2, -=10
//
////        phép nhân *
//        int so8 = 10;
//        int so9 = 20;
//        int multiply = so8 * so9;
//        System.out.println("so8 * so9 = " + multiply);
////        *=2, *=3,... KHÔNG CÓ ** (dấu mũ) so5**2 => so5 mũ 2
//
////        phép chia lấy nguyên
//        int so10 = 20;
//        int so11 = 6;
//        int divide = so10 / so11;
//        System.out.println("so10 / so11 = " + divide);
//
////        phép chia lấy dư
//        int chiaLayDu = so10 % so11;
//        System.out.println("so10 % so11 = " + chiaLayDu);
//
////        cách đặt tên biến
////        1. tên biến phải có nghĩa, hợp ngữ cảnh
////        2. không được chứa khoảng trắng và các ký tự đặc biệt
////        ~!@#$%^&*()-+=
////        3. nếu tên biến có từ 2 tiếng trở lên
////        => ký tự thứ 2 trở đi in hoa. VD: ketQua, chiaLayDu,..
////        4. ký tự đầu tiên không được là số
////        java -> camel case
//
////        các phép toán so sánh và logic
////        1. phép toán so sánh
////        >, >=, <, <=, != (khác), == (so sánh bằng), ! (phủ định)
////        => boolean
////        => condition if-else, loop
//        int tuoi = 20;
//        boolean duTuoiLaiXe = tuoi >= 18;
//        System.out.println("duTuoiLaiXe = " + duTuoiLaiXe);
//
//        boolean khongCoBangLai = !duTuoiLaiXe;
//        System.out.println("khongCoBangLai = " + khongCoBangLai);
//
////        2. phép toán logic: && (và), || (hoặc)
//        boolean coCCCD = false;
//        boolean duDieuKienLaiXe = duTuoiLaiXe && coCCCD;
//        System.out.println("duDieuKienLaiXe = " + duDieuKienLaiXe);
////        nguyên tắc &&: tất cả điều kiện true => true, ngược lại => false
////        nguyên tắc ||: chỉ cần 1 hoặc tất cả điều kiện true => true
//
////        cú pháp condition if-else
////        VD1: kiểm tra chẵn lẻ
////        số chẵn -> % 2
////        == 0 => số chẵn
////        != 0 => số lẻ
//        int number1 = 50;
//        if(number1 % 2 == 0) {
//            System.out.println(number1 + " là số chẵn");
//        } else {
//            System.out.println(number1 + " là số lẻ");
//        }
//
////        if(number1 % 2 == 0) {
////
////        }
////
////        if (number1 % 2 != 0) {
////
////        }
//
////        ví dụ 2: xếp loại học sinh dựa vào điểm trung bình
////        9 <= x <= 10 => xuất sắc
////        => (9 <= x) && (x <= 10)
////        8 <= x < 9 => giỏi
////        6.5 <= x < 8 => khá
////        5 <= x < 6.5 => trung bình
////        x < 5 => yếu
//
//        float diem = 7;
//        if (9 <= diem && diem <= 10) {
//            System.out.println("Xuất sắc");
//        } else if (8 <= diem && diem < 9) {
//            System.out.println("Giỏi");
//        } else if (6.5 <= diem && diem < 8){
//            System.out.println("Khá");
//        } else if (5 <= diem && diem < 6.5) {
//            System.out.println("Trung bình");
//        } else {
//            System.out.println("Yếu");
//        }
//
////        Ví dụ 3: tìm số lớn nhất trong 3 số
////        dùng phương pháp gắn cờ
////        chọn 1 số bất kỳ làm số lớn nhất
////        so sánh số này với các số còn lại
//        int soA = 8;
//        int soB = 5;
//        int soC = 10;
//        int max = soA;
//        if (soB > max) {
//            max = soB;
//        }
//
//        if (soC > max) {
//            max = soC;
//        }
//
//        System.out.println("Số lớn nhất là: " + max);
//
//    }
}