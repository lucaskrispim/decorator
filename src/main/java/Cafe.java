public class Cafe implements Bebida {

    private final double valor;

    Cafe(double valor) {
        this.valor = valor;
    }

    @Override
    public double valor() {
        return this.valor;
    }

    @Override
    public String getDescricao() {
        return "Café";
    }
}
