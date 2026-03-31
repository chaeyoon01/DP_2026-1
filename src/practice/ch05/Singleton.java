package practice.ch05;

// 싱글톤 패턴 적용
public class Singleton {

    // (3) Singleton 객체를 미리 하나 생성
    private static Singleton singleton=new Singleton(); // static 키워드 사용 = 클래스
    
    // (1) 생성자를 private으로 지정
    private Singleton(){
        System.out.println("Singleton 객체가 생성됩니다.");
    }

    // (2) Singleton 객체를 얻어갈 수 있는 메소드 정의
    public static Singleton getInstance(){
        return singleton;   //(3)에서 생성된 객체 반환
    }
}
