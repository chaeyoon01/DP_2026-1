package practice.ch02.deligation;

// 어댑터
// 자바에서는 다중 상속 불가능 -> 둘 이상의 부모 허용x
public class PrintBannerAdapter02 extends Print {
    private Banner banner;  // Banner 클래스의 인스턴스를 참조하는 필드

    public PrintBannerAdapter02(String string) {
        this.banner = new Banner(string);   // Banner 클래스의 인스턴스를 생성하여 필드에 할당
    }

    @Override
    public void printWeak() {
        banner.showWithParen(); // Banner 클래스의 메소드를 호출하여 기능 수행 -> 위임
    }

    @Override
    public void printStrong() {
        banner.showWithAster(); // Banner 클래스의 메소드를 호출하여 기능 수행 -> 위임
    }

    public String getYourName(){
        return "홍길동";
    }
}
