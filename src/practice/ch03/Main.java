package practice.ch03;

public class Main {
    public static void main(String[] args){
        //CharDisplay d1=new CharDisplay('H');    // 'H':문자, "H":문자열
        AbstractDisplay d1=new CharDisplay('H');    // 부모 타입으로 선언 가능(LSP)
        d1.display();
        d1.open();

        //StringDisplay d2=new StringDisplay("Hello, world.");
        AbstractDisplay d2=new StringDisplay("Hello, world.");
        d2.display();

        //AbstractDisply d3=new AbstractDisplay; // 추상 클래스-> 인스턴스 생성 불가
    }
}
