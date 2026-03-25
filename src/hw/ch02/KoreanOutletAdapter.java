package hw.ch02;

public class KoreanOutletAdapter implements Charger {
    private KoreanOutlet koreanOutlet;  // KoreanOutlet의 인스턴스 참조

    public KoreanOutletAdapter(KoreanOutlet koreanOutlet){
        this.koreanOutlet=koreanOutlet;
    }

    @Override
    public int charge(){
        return koreanOutlet.provide();  // KoreanOutlet 클래스의 메소드 호출 -> 위임
    }
}
