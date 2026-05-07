package practice.ch17;

import java.util.Random;

// 관찰 대상
public class RandomNumberGenerator extends NumberGenerator {
    private Random random = new Random(); 	// 난수 생성기 
    private int number;                   		// 현재 수 

    // 수를 취득한다 
    @Override
    public int getNumber() {
        return number;
    }

    // 수를 생성한다 
    @Override
    public void execute() {
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(50);    // 0~49 사이의 난수 생성
            notifyObservers();  // 관찰자에게 통지(number 값이 바뀔 때 통지)
        }
    }
}
