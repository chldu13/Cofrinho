package empresa;

import java.util.ArrayList;
import java.util.List;

public class Cofrinho {private List<Moeda> moedas;

public Cofrinho() {
    moedas = new ArrayList<>();
}

public void adicionarMoeda(Moeda moeda) {
    moedas.add(moeda);
}

public void removerMoeda(int indiceMoeda) {
    if (indiceMoeda >= 0 && indiceMoeda < moedas.size()) {
        Moeda moedaRemovida = moedas.remove(indiceMoeda);
        double valorTotal = moedaRemovida.getValor();
    }
}
//public void removerMoeda(Moeda moeda) {
 //   moedas.remove(moeda);
//}

public void listarMoedas() {
    for (Moeda moeda : moedas) {
        System.out.println(moeda.getNome() + " - Valor: " + moeda.getValor());
    }
}

public double calcularValorTotalEmReais() {
    double valorTotal = 0.0;
    for (Moeda moeda : moedas) {
        if (moeda instanceof Real) {
            valorTotal += moeda.getValor();
        } else if (moeda instanceof Dolar) {
            valorTotal += moeda.getValor() * 4.81;
        } else if (moeda instanceof Euro) {
            valorTotal += moeda.getValor() * 5.41;
        }
    }
    return valorTotal;
}


}
