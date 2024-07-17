
public class PizzaBase implements Pizza {
    private float custo;

    public PizzaBase(float custo) {
        this.custo = custo;
    }

    public float getCusto() {
        return custo;
    }

    public String getDescricao() {
        return "Pizza Base";
    }
}
