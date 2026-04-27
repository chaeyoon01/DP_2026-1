package hw.ch10;

public class CyclicStrategy implements Strategy {
    private int num=0;
    
    @Override
    public Hand nextHand(){
        Hand hand=Hand.getHand(num);
        num=(num+1)%3;
        return hand;
    }

    @Override
    public void study(boolean win){

    }
}
