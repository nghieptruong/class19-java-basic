
import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<String> listNames = new ArrayList<>();
        System.out.println(listNames.size()); // 0
        listNames.add("John");
        listNames.add("Alice");
        listNames.add("Thomas");
        System.out.println(listNames.size()); // 3
        System.out.println(listNames);

        for (int i = 0; i < listNames.size(); i++) {
            System.out.println(listNames.get(i));
        }

        //cho phep gia tri trung lap
        listNames.add("Alice");
        System.out.println(listNames); // [John, Alice, Thomas, Alice]

        //cho phep xoa phan tu
        listNames.remove("John");
        System.out.println(listNames.size()); // 3
        System.out.println(listNames);

        //kiem tra danh sach co chua phan tu
        boolean isExistItem = listNames.contains("Thomas");
        System.out.println(isExistItem);
    }
}
