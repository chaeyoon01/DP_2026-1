package practice.ch06.framework;

public interface Product extends Cloneable {    //Clonable 인터페이스 사용 시 clone 메소드를 이용하여 복제 가능
    public abstract void use(String s);
    public abstract Product createCopy();   // 복제 메소드
}
