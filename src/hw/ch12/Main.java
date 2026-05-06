package hw.ch12;

public class Main {
    public static void main(String[] args) {
        System.out.println("20240936 신채윤");
        System.out.println();

        MultiStringDisplay md = new MultiStringDisplay();

        md.add("Hello, Java!");
        md.add("Decorator Pattern");
        md.add("is powerful");

        System.out.println("[2-1] 원본 출력");
        md.show();

        Display d1 = new NumberedBorder(md);
        System.out.println("\n[2-2] NumberedBorder 단독 적용");
        d1.show();

        Display d2 = new FullBorder(new NumberedBorder(md));
        System.out.println("\n[2-3] FullBorder + NumberedBorder 조합");
        d2.show();

        Display d3=new SideBorder(new NumberedBorder(new FullBorder(md)), '*');
        System.out.println("\n[2-4] SideBorder + FullBorder + NumberedBorder 3단 중첩");
        d3.show();
    }
}
