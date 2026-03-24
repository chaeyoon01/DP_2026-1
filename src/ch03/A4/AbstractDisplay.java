package ch03.A4;

public interface AbstractDisplay { // 인터페이스로 변경
    public void open();
    public void print();
    public void close();

    public default void display() { // default 키워드로 변경
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
