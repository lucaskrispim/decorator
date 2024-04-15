import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CursoTest {

    @Test
    public void testCustoCafe() {
        Bebida cafe = new Cafe(2.0);
        assertEquals(2.0, cafe.valor(), 0.01);
    }

    @Test
    public void testCustoCafeComLeite() {
        Bebida cafe = new Cafe(2.0);
        Bebida cafeComLeite = new Leite(cafe);
        assertEquals(2.5, cafeComLeite.valor(), 0.01);
    }

    @Test
    public void testCustoCafeComLeiteEAcucar() {
        Bebida cafe = new Cafe(2.0);
        Bebida cafeComLeite = new Leite(cafe);
        Bebida cafeComLeiteEAcucar = new Acucar(cafeComLeite);
        assertEquals(2.8, cafeComLeiteEAcucar.valor(), 0.01);
    }

    @Test
    public void testCustoCafeComLeiteAcucarEChocolate() {
        Bebida cafe = new Cafe(2.0);
        Bebida cafeComLeite = new Leite(cafe);
        Bebida cafeComLeiteEAcucar = new Acucar(cafeComLeite);
        Bebida cafeComLeiteAcucarEChocolate = new Chocolate(cafeComLeiteEAcucar);
        assertEquals(3.5, cafeComLeiteAcucarEChocolate.valor(), 0.01);
    }

    @Test
    public void testDescricaoCafe() {
        Bebida cafe = new Cafe(2.0);
        assertEquals("Café", cafe.getDescricao());
    }

    @Test
    public void testDescricaoCafeComLeite() {
        Bebida cafe = new Cafe(2.0);
        Bebida cafeComLeite = new Leite(cafe);
        assertEquals("Café/Leite", cafeComLeite.getDescricao());
    }

    @Test
    public void testDescricaoCafeComLeiteEAcucar() {
        Bebida cafe = new Cafe(2.0);
        Bebida cafeComLeite = new Leite(cafe);
        Bebida cafeComLeiteEAcucar = new Acucar(cafeComLeite);
        assertEquals("Café/Leite/Açúcar", cafeComLeiteEAcucar.getDescricao());
    }

    @Test
    public void testDescricaoCafeComLeiteAcucarEChocolate() {
        Bebida cafe = new Cafe(2.0);
        Bebida cafeComLeite = new Leite(cafe);
        Bebida cafeComLeiteEAcucar = new Acucar(cafeComLeite);
        Bebida cafeComLeiteAcucarEChocolate = new Chocolate(cafeComLeiteEAcucar);
        assertEquals("Café/Leite/Açúcar/Chocolate", cafeComLeiteAcucarEChocolate.getDescricao());
    }

}