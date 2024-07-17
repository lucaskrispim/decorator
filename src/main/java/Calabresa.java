public class Calabresa extends PizzaDecorator {

    public Calabresa(Pizza pizza) {
        super(pizza);
    }

    public float getCustoAdicional() {
        return 3.00f;
    }

    public String getNomeIngrediente() {
        return "Calabresa";
    }
}