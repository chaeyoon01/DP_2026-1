package practice.ch10;

import java.util.Random;

public class WinningStrategy implements Strategy {
    private Random random;
    private boolean won = false;
    private Hand prevHand;  // 이전에 낸 손

    public WinningStrategy(int seed) {
        random = new Random(seed);  // seed에 의해 난수 생성 -> 같은 seed일 경우 같은 난수 생성
    }

    @Override
    public Hand nextHand() {
        if (!won) { // 이전에 진 경우
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
