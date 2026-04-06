package hw.ch04.framework;

public abstract class Factory {
    // 템플릿 메소드 : 제품 생산 방식 정의
    public final Product create(String owner) {
        Product p = createProduct(owner);   // 실제 제품 생산
        registerProduct(p); // 생산된 제품 등록
        return p;
    }

    // 팩토리 메소드
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
