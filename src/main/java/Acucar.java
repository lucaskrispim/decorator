class Acucar extends IngredienteDecorator {
    public Acucar(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double valor() {
        return bebida.valor() + 0.3;
    }

    @Override
    protected String getNomeDescricao() {
        return "Açúcar";
    }
}