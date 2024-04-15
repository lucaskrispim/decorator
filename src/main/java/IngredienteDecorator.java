abstract class IngredienteDecorator implements Bebida {
    protected Bebida bebida;

    public IngredienteDecorator(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + "/" + getNomeDescricao();
    }

    abstract protected String getNomeDescricao();
}