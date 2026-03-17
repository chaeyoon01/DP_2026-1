package practice.ch02.inheritance;

// 이미 존재하는 클래스 : Vendor 클래스 -> 수정 불가
public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() { 
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
