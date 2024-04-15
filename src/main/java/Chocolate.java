class Chocolate extends IngredienteDecorator {
    public Chocolate(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double valor() {
        return bebida.valor() + 0.7;
    }

    @Override
    protected String getNomeDescricao() {
        return "Chocolate";
    }
}