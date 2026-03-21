package hw.ch02;

public class Main {
    public static void main(String[] args){
        KoreanOutlet koreanOutlet=new KoreanOutlet();
        Charger adapter=new KoreanOutletAdapter(koreanOutlet);
        Smartphone smartphone=new Smartphone(adapter);
        smartphone.charge();
    }
}
