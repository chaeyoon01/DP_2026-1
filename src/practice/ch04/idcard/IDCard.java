package practice.ch04.idcard;

import practice.ch04.framework.Product;   // Product : 다른 패키지에 내장 -> 호출 필요

public class IDCard extends Product {
    private String owner;

    IDCard(String owner) {
        // 부모의 인자 없는 생성자 호출
        // super(); -> 생략 가능
        // super("x","y");
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(this + "을 사용합니다."); 
        // 객체(this) + 문자열 : 컴파일러가 자동으로 toString() 호출 -> 객체를 문자열로 변환
    }

    @Override
    // Object 클래스의 toString 메소드 오버라이드
    public String toString() {
        return "[IDCard:" + owner + "]";
    }

    public String getOwner() {
        return owner;
    }
}
