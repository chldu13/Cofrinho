package empresa;

public class Dolar extends Moeda {
    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public String getNome() {
        return "Dólar";
    }
}