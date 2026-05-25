package practice.ch20;
import java.util.HashMap;
import java.util.Map;

public class BigCharFactory {
    // 이미 만든 BigChar 인스턴스를 관리 
    private Map<String, BigChar> pool = new HashMap<>();

    // Singleton 패턴 
    private static BigCharFactory singleton = new BigCharFactory();

    // 생성자 
    private BigCharFactory() {
    }

    // 유일한 인스턴스를 얻는다
    public static BigCharFactory getInstance() {
        return singleton;
    }

    // BigChar 인스턴스 생성(공유)
    public synchronized BigChar getBigChar(char charname) { // ex) '3'
        // 이미 만들어진 BigChar 인스턴스 검색
        BigChar bc = pool.get(String.valueOf(charname));    // ex) "3"

        if (bc == null) {   // 이미 만들어진 BigChar 인스턴스가 없는 경우
            // 여기서 BigChar 인스턴스를 생성 
            bc = new BigChar(charname);
            pool.put(String.valueOf(charname), bc);
        }

        return bc;
    }
}
