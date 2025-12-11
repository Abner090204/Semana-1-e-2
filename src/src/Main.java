import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Veiculo> lista = new ArrayList<>();

        lista.add(new Carro("Civic", 2020, 120000, 4));
        lista.add(new Moto("CG", 2018, 9000, 160));
        lista.add(new Carro("Gol", 2015, 35000, 2));
        lista.add(new Moto("Hornet", 2012, 32000, 600));

        for (Veiculo v : lista) {
            v.exibirInfo();  
        }
    }
}
