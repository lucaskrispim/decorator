class Leite extends IngredienteDecorator {
    public Leite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double valor() {
        return bebida.valor() + 0.5;
    }

    @Override
    protected String getNomeDescricao() {
        return "Leite";
    }
}