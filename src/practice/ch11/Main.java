package practice.ch11;

public class Main {
    public static void main(String[] args){
        // 디렉토리 트리 생성
        //Directory root=new Directory("root");
        Entry root=new Directory("root");   // 업 캐스팅(자동)
        Directory bin=new Directory("bin");
        Directory tmp=new Directory("tmp");
        Directory usr=new Directory("usr");
        
        ((Directory)root).add(bin);    // 다운 캐스팅(형변환)
        ((Directory)root).add(tmp);    // 우선순위 : .연산자 > 타입 캐스팅 연산자
        ((Directory)root).add(usr);    // 타입 캐스팅 후 괄호로 묶어줘야함
        
        // 파일 생성 및 추가
        bin.add(new File("vi,",10000));
        bin.add(new File("latex", 20000));

        // 디렉토리 리스트 출력
        root.printList();
    }
}
