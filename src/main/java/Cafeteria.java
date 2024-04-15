public class Cafeteria {
    public static void main(String[] args) {
        Bebida cafe = new Cafe(2.0);
        Bebida cafeComLeite = new Leite(cafe);
        Bebida cafeComLeiteEAcucar = new Acucar(cafeComLeite);
        Bebida cafeComLeiteAcucarEChocolate = new Chocolate(cafeComLeiteEAcucar);

        System.out.println("Estrutura of plain coffee: " + cafe.getDescricao());
        System.out.println("Estrutura of coffee with milk: " + cafeComLeite.getDescricao());
        System.out.println("Estrutura of coffee with milk and sugar: " + cafeComLeiteEAcucar.getDescricao());
        System.out.println("Estrutura of coffee with milk, sugar, and chocolate: " + cafeComLeiteAcucarEChocolate.getDescricao());

        System.out.println(" ");

        System.out.println("Valor of plain coffee: " + cafe.valor());
        System.out.println("Valor of coffee with milk: " + cafeComLeite.valor());
        System.out.println("Valor of coffee with milk and sugar: " + cafeComLeiteEAcucar.valor());
        System.out.println("Valor of coffee with milk, sugar, and chocolate: " + cafeComLeiteAcucarEChocolate.valor());
    }
}
