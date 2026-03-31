package practice.ch05.ex;

// 다른 방법의 싱글턴 패턴
public class Singleton {
    private static Singleton singleton = null;  // null : 아직 객체 생성x

    private Singleton() {
        System.out.println("인스턴스가 생성되었습니다.");
        slowdown(); // 인스턴스 생성 시 시간 지연
    }

    public static Singleton getInstance() {
        if (singleton == null) {    // 처음 호출되는지 검사
            singleton = new Singleton();
        }
        return singleton;
    }

    private void slowdown() {
        try {
            Thread.sleep(1000); // CPU를 내놓고 쉼 (1000=1초)
        } catch (InterruptedException e) {
        }
    }
}
