package ch04.A2.idcard;

import ch04.A2.framework.Factory;
import ch04.A2.framework.Product;
import java.util.HashMap;
import java.util.Map;

public class IDCardFactory extends Factory {
    private int serial = 100;   // int : 기본 데이터 타입
    private Map<Integer, String> database=new HashMap<>();  // Integer : 정수 객체

    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, serial++); // 첫 생성 시 100 -> 이후 생성부터 101,102,...
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard card=(IDCard)product;
        database.put(card.getSerial(), card.getOwner());    // serial 키로, owner를 값으로 저장
        System.out.println(product + "을 등록했습니다.");
    }

    @Override
    public Map<Integer, String> getDatabase() {
        return database;
    }
}
