package hw.ch03;

public class NumberDisplay extends AbstractDisplay {
    private int num;

    public NumberDisplay(int num, int repeatCount){
        this.num=num;
        this.repeatCount=repeatCount;
    }

    @Override
    public void open() {
        // 시작 문자열 "<<Number>>"를 표시한다
        System.out.println("<<Number>>");
    }

    @Override
    public void print() {
        // 필드에 기억해 둔 숫자를 1회 표시한다
        System.out.println(num);
    }

    @Override
    public void close() {
        // 종료 문자열 "<<Number>>"를 표시한다 
        System.out.println("<<Number>>");
    }
}
