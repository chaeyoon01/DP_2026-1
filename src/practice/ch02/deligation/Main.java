package practice.ch02.deligation;

public class Main {
    public static void main(String[] args) {
        Print print = new PrintBannerAdapter02("Hello World!");
        print.printWeak();
        print.printStrong();
        ((PrintBannerAdapter02) print).getYourName(); // 형변환(타입캐스팅)
    }
}
