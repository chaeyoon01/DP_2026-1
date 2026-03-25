package hw.ch03;

public class Main {
    public static void main(String[] args) {
        System.out.println("20240936 신채윤");
        System.out.println();

        // 'H'를 가진 CharDisplay 인스턴스를 하나 만든다 
        AbstractDisplay d1 = new CharDisplay('H');

        // "Hello, world."를 가진 StringDisplay 인스턴스를 하나 만든다 
        AbstractDisplay d2 = new StringDisplay("Hello");

        // d1,d2 모두 같은 AbstractDisplay의 하위 클래스의 인스턴스이므로
        // 상속한 display 메소드를 호출할 수 있다
        // 실제 동작은 CharDisplay나 StringDisplay 클래스에서 정해진다
        System.out.println("***[3-1] 테스트 : 기존 코드 호환성 확인***");
        d1.display();
        d2.display();
        System.out.println();

        AbstractDisplay d3=new CharDisplay('X',3);
        AbstractDisplay d4=new StringDisplay("Test",7);

        System.out.println("***[3-2] 테스트 : 반복 횟수 제어***");
        d3.display();
        d4.display();
        System.out.println();

        AbstractDisplay num=new NumberDisplay(42,4);

        System.out.println("***[3-3] 테스트 : 새로운 Display***");
        num.display();
    }
}
