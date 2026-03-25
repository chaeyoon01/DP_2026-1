package hw.ch02;

public class Main {
    public static void main(String[] args){
        System.out.println("20240936 신채윤");
        System.out.println();
        
        KoreanOutlet KoreanOutlet=new KoreanOutlet();
        Charger KoreanOutletAdapter=new KoreanOutletAdapter(KoreanOutlet);
        Smartphone smartphone=new Smartphone(KoreanOutletAdapter);
        smartphone.charge();
    }
}
