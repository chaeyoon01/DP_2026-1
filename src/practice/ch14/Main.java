package practice.ch14;

public class Main {
    public static void main(String[] args){
        // 해결자들 생성
        Support alice = new NoSupport("Alice");
        Support bob = new LimitSupport("Bob", 100);
        Support charlie = new SpecialSupport("Charlie", 429);
        Support diana = new OddSupport("Diana");

        // 사슬 형성
        alice.setNext(bob).setNext(charlie).setNext(diana);

        // 문제를 첫번째 객체에게 던져줌
        alice.support(new Trouble(429));

        for(int i=0; i<500; i+=33) {                                                                                             
            alice.support(new Trouble(i));
        }
    }
}
