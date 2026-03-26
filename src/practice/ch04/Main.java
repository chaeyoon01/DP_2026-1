package practice.ch04;

import practice.ch04.framework.Product;
import practice.ch04.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args){
        // (1) ID Card 직접 생성
        //IDCard c1=new IDCard("신채윤");
        //c1.use();

        // (2) 공장을 통해 ID Card 생성
        IDCardFactory factory=new IDCardFactory();
        Product c2=factory.create("신채윤");
        c2.use();
    }
}
