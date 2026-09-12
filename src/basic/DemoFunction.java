package basic;

public class DemoFunction {
    public static void main(String[] args) {
        String result = runBrowser("chrome");
        System.out.println(result);
    }

    public static String runBrowser(String browser) {
        switch (browser.toLowerCase()) {
            case "chrome":
            case "firefox":
            case "edge":
                return "Run on windows platform";
            case "safari":
                return "Run on mac platform";
            default:
                return "Not support !";
        }
    }
}
