public class DemoSwitchCase {
    public static void main(String[] args) {
        /*
            Vi du: Chay nhieu browser khac nhau, co 1 bien browser
                Chrome --> In ra "Run on chrome"
                Firefox --> In ra "Run on firefox"
                Edge --> In ra "Run on Edge"
                Safari --> In ra "Run on Safari"
                Nguoc lai --> In ra "Not support !"
         */

        //equals(): phương thức so sánh chuỗi có phan biet hoa thuong
        //equalsIgnoreCase() : phương thức so sánh chuỗi ko phan biet hoa thuong
        String browser = "FIREFOX";
        if(browser.equalsIgnoreCase("Chrome")) {
            System.out.println("Run on chrome");
        } else if(browser.equalsIgnoreCase("Firefox")) {
            System.out.println("Run on firefox");
        } else if(browser.equalsIgnoreCase("Edge")) {
            System.out.println("Run on Edge");
        } else if(browser.equalsIgnoreCase("Safari")) {
            System.out.println("Run on Safari");
        } else {
            System.out.println("Not support !");
        }

        System.out.println("--------------------");
        //Viet lai voi switch...case
        //toLowerCase(): chuyen doi chuoi sang ky tu thuong
        switch (browser.toLowerCase()) {
            case "chrome":
                System.out.println("Run on chrome");
                break;
            case "firefox":
                System.out.println("Run on firefox");
                break;
            case "edge":
                System.out.println("Run on Edge");
                break;
            case "safari":
                System.out.println("Run on Safari");
                break;
            default:
                System.out.println("Not support !");
        }

        System.out.println("--------------------");
        //gán lại gía trị cho browser
        browser = "firefox";

        //bai toan ap dung ko dung break: khi gom nhom logic giong nhau thanh 1 nhom
        //Vi du: browser la chrome, firefox, edge --> in ra "Run on windows platform", browser la safari in ra "Run on mac platform"
        // Nguoc lai in ra "Not support !"
        switch (browser.toLowerCase()) {
            case "chrome":
            case "firefox":
            case "edge":
                System.out.println("Run on windows platform");
                break;
            case "safari":
                System.out.println("Run on mac platform");
                break;
            default:
                System.out.println("Not support !");
        }


    }
}
