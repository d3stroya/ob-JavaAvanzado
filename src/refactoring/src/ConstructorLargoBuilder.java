package refactoring.src;

public class ConstructorLargoBuilder {
    String model;
    String marca;
    String motor;

    private ConstructorLargoBuilder() {
    }

    public ConstructorLargoBuilder (String model) {
        this.model = model;
    }

    public ConstructorLargoBuilder marca(String marca) {
        this.marca = marca;
        return null;
    }
    public ConstructorLargoBuilder motor(String motor) {
        this.motor = motor;
        return null;
    }

}
