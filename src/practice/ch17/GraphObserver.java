package practice.ch17;

// 관찰자
public class GraphObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) { // 통지받을 때 호출되는 메소드
        System.out.print("GraphObserver:");

        int count = generator.getNumber();
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println("");

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}
