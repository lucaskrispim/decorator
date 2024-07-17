import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {

    @Test
    void deveRetornarCustoPizzaBase() {
        Pizza pizza = new PizzaBase(5.00f);

        assertEquals(5.00f, pizza.getCusto(), 0.01f);
    }

    @Test
    void deveRetornarCustoPizzaComQueijoExtra() {
        Pizza pizza = new QueijoExtra(new PizzaBase(5.00f));

        assertEquals(7.00f, pizza.getCusto(), 0.01f);
    }

    @Test
    void deveRetornarCustoPizzaComMolhoTomate() {
        Pizza pizza = new MolhoTomate(new PizzaBase(5.00f));

        assertEquals(6.50f, pizza.getCusto(), 0.01f);
    }

    @Test
    void deveRetornarCustoPizzaComCalabresa() {
        Pizza pizza = new Calabresa(new PizzaBase(5.00f));

        assertEquals(8.00f, pizza.getCusto(), 0.01f);
    }

    @Test
    void deveRetornarCustoPizzaComQueijoExtraMaisMolhoTomate() {
        Pizza pizza = new QueijoExtra(new MolhoTomate(new PizzaBase(5.00f)));

        assertEquals(8.50f, pizza.getCusto(), 0.01f);
    }

    @Test
    void deveRetornarCustoPizzaComQueijoExtraMaisCalabresa() {
        Pizza pizza = new QueijoExtra(new Calabresa(new PizzaBase(5.00f)));

        assertEquals(10.00f, pizza.getCusto(), 0.01f);
    }

    @Test
    void deveRetornarCustoPizzaComMolhoTomateMaisCalabresa() {
        Pizza pizza = new MolhoTomate(new Calabresa(new PizzaBase(5.00f)));

        assertEquals(9.50f, pizza.getCusto(), 0.01f);
    }

    @Test
    void deveRetornarCustoPizzaComQueijoExtraMaisMolhoTomateMaisCalabresa() {
        Pizza pizza = new QueijoExtra(new MolhoTomate(new Calabresa(new PizzaBase(5.00f))));

        assertEquals(11.50f, pizza.getCusto(), 0.01f);
    }

    @Test
    void deveRetornarDescricaoPizzaBase() {
        Pizza pizza = new PizzaBase(5.00f);

        assertEquals("Pizza Base", pizza.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPizzaComQueijoExtra() {
        Pizza pizza = new QueijoExtra(new PizzaBase(5.00f));

        assertEquals("Pizza Base, Queijo Extra", pizza.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPizzaComMolhoTomate() {
        Pizza pizza = new MolhoTomate(new PizzaBase(5.00f));

        assertEquals("Pizza Base, Molho de Tomate", pizza.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPizzaComCalabresa() {
        Pizza pizza = new Calabresa(new PizzaBase(5.00f));

        assertEquals("Pizza Base, Calabresa", pizza.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPizzaComQueijoExtraMaisMolhoTomate() {
        Pizza pizza = new QueijoExtra(new MolhoTomate(new PizzaBase(5.00f)));

        assertEquals("Pizza Base, Molho de Tomate, Queijo Extra", pizza.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPizzaComQueijoExtraMaisCalabresa() {
        Pizza pizza = new QueijoExtra(new Calabresa(new PizzaBase(5.00f)));

        assertEquals("Pizza Base, Calabresa, Queijo Extra", pizza.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPizzaComMolhoTomateMaisCalabresa() {
        Pizza pizza = new MolhoTomate(new Calabresa(new PizzaBase(5.00f)));

        assertEquals("Pizza Base, Calabresa, Molho de Tomate", pizza.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPizzaComQueijoExtraMaisMolhoTomateMaisCalabresa() {
        Pizza pizza = new QueijoExtra(new MolhoTomate(new Calabresa(new PizzaBase(5.00f))));

        assertEquals("Pizza Base, Calabresa, Molho de Tomate, Queijo Extra", pizza.getDescricao());
    }

    @Test
    void deveLancarExcecaoQuandoPizzaForNull() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new QueijoExtra(null);
        });

        String expectedMessage = "Pizza não pode ser null";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}