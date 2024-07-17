public class MolhoTomate extends PizzaDecorator {

    public MolhoTomate(Pizza pizza) {
        super(pizza);
    }

    public float getCustoAdicional() {
        return 1.50f;
    }

    public String getNomeIngrediente() {
        return "Molho de Tomate";
    }
}
