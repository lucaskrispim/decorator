public abstract class PizzaDecorator implements Pizza {
    private Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        if (pizza == null) {
            throw new IllegalArgumentException("Pizza não pode ser null");
        }
        this.setPizza(pizza);
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public abstract float getCustoAdicional();

    public float getCusto() {
        return this.getPizza().getCusto() + this.getCustoAdicional();
    }

    public abstract String getNomeIngrediente();

    public String getDescricao() {
        return this.getPizza().getDescricao() + ", " + this.getNomeIngrediente();
    }

}