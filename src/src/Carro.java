public class Carro extends Veiculo {
    int numeroDePortas;

    public Carro(String modelo, int ano, double valor, int numeroDePortas) {
        super(modelo, ano, valor);
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public void exibirInfo() {
        System.out.println(modelo + " | Ano: " + ano + " | Portas: " + numeroDePortas + " | R$" + valor);
    }
}
