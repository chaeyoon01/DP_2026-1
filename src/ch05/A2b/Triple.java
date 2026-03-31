package ch05.A2b;

public enum Triple {
    ALPHA, BETA, GAMMA; // Triple 객체 3개 생성

    private Triple() {
        System.out.println("The instance " + this + " is created.");
    }

    public static Triple getInstance(String name) {
        return valueOf(name);
    }
}
