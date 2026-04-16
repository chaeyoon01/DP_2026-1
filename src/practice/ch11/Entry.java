package practice.ch11;

public abstract class Entry {
    // 이름을 얻는다
    public abstract String getName();   // 추상 메소드

    // 크기를 얻는다 
    public abstract int getSize();  // 추상 메소드

    // prinntList() : 메소드 오버로딩
    // 목록을 표시한다
    public void printList() {
        printList("");
    }

    // prefix를 앞에 붙여서 목록을 표시한다 
    protected abstract void printList(String prefix);

    // 문자열 표시 
    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
