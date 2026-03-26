package ch04.A2.framework;

import java.util.Map;

public abstract class Factory {
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
    public abstract Map<Integer, String> getDatabase();
}
