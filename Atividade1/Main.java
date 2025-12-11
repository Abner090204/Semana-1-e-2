package src;

public class Main {
    public static void main(String[] args) {

        Produto p1 = new Produto("Mouse", 50.0, 10);
        Produto p2 = new Produto("Teclado", 120.0, 5);
        Produto p3 = new Produto("Monitor", 950.0, 2);

        p1.exibirDados();
        p2.exibirDados();
        p3.exibirDados();

        double total = 
            p1.valorTotalEmEstoque() +
            p2.valorTotalEmEstoque() +
            p3.valorTotalEmEstoque();

        System.out.println("Valor total em estoque: R$ " + total);
    }
}
