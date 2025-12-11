public class Moto extends Veiculo {
    int cilindradas;

    public Moto(String modelo, int ano, double valor, int cilindradas) {
        super(modelo, ano, valor);
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirInfo() {
        System.out.println(modelo + " | Ano: " + ano + " | " + cilindradas + "cc | R$" + valor);
    }
}
