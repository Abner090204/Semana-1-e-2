public class Veiculo {
    String modelo;
    int ano;
    double valor;

    public Veiculo(String modelo, int ano, double valor) {
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
    }

    public void exibirInfo() {
        System.out.println(modelo + " | Ano: " + ano + " | R$" + valor);
    }
}
