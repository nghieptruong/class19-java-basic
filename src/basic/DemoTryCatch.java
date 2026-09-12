package basic;

public class DemoTryCatch {
    public static void main(String[] args) {
        try {
            int result = 1 / 1;
        } catch (Exception e) {
            System.out.println("Loi chia cho 0!");
        } finally {
            System.out.println("End program !");
        }
    }
}
