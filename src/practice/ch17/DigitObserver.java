package practice.ch17;

// 관찰자
public class DigitObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {

        System.out.println("DigitObserver:" + generator.getNumber());   // 통지받을 때 호출되는 메소드

        try {
            Thread.sleep(1000);  // 1초 대기
        } catch (InterruptedException e) {
        }
    }
}
