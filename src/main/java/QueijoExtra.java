public class QueijoExtra extends PizzaDecorator {

    public QueijoExtra(Pizza pizza) {
        super(pizza);
    }

    public float getCustoAdicional() {
        return 2.00f;
    }

    public String getNomeIngrediente() {
        return "Queijo Extra";
    }
}
