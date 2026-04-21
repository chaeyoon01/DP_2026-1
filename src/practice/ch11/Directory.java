package practice.ch11;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {
    private String name;
    private List<Entry> directory = new ArrayList<>();  // 자식들을 보관하는 리스트, Entry : 부모 타입 -> 디렉토리, 파일 보관 가능

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {  // 모든 자식의 크기를 더함
        int size = 0;
        for (Entry entry : directory) {  // 확장된 for문 -> (원소 변수 : 컬렉션) 형식
            size += entry.getSize();    // 재귀적 호출
        }
        return size;
    }

    @Override
    protected void printList(String prefix) {   // 이 디렉토리의 이전까지의 경로
        System.out.println(prefix + "/" + this);
        for (Entry entry: directory) {
            entry.printList(prefix + "/" + name);   // 현재 폴더까지 포함한 경로를 자식에게 전달
        }
    }

    // 디렉터리 엔트리를 디렉터리에 추가한다
    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }
}
