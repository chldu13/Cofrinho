package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Cofrinho cofrinho = new Cofrinho();
		Scanner teclado = new Scanner(System.in);
		int opcao;
		
		do {
            exibirMenu();
            System.out.print("Digite a opção desejada: ");
            opcao = teclado.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor da moeda: ");
                    double valor = teclado.nextDouble();
                    teclado.nextLine();

                    System.out.print("Digite o nome da moeda (Dólar/Euro/Real): ");
                    String nome = teclado.nextLine();

                    Moeda moeda;
                    if (nome.equalsIgnoreCase("Dólar")) {
                        moeda = new Dolar(valor);
                    } else if (nome.equalsIgnoreCase("Euro")) {
                        moeda = new Euro(valor);
                    } else if (nome.equalsIgnoreCase("Real")) {
                        moeda = new Real(valor);
                    } else {
                        System.out.println("Moeda inválida.");
                        continue;
                    }

                    cofrinho.adicionarMoeda(moeda);
                    System.out.println("Moeda adicionada ao cofrinho.");
                    break;
                case 2:
                	cofrinho.listarMoedas();
                    System.out.print("Digite o número da moeda que deseja remover: ");
                    int numeroMoeda = teclado.nextInt();

                    cofrinho.removerMoeda(numeroMoeda - 1); 
                    System.out.println("Moeda removida do cofrinho.");
                    break;
                case 3:
                    cofrinho.listarMoedas();
                    break;
                case 4:
                    double valorTotalEmReais = cofrinho.calcularValorTotalEmReais();
                    System.out.println("Valor total em reais no cofrinho: R$ " + valorTotalEmReais);
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente.");
                    break;
            }

            System.out.println();
        } while (opcao != 0);

        teclado.close();
    }

    public static void exibirMenu() {
        System.out.println("==== Menu ====");
        System.out.println("1 - Adicionar moeda");
        System.out.println("2 - Remover moeda");
        System.out.println("3 - Listar moedas");
        System.out.println("4 - Calcular valor total em reais");
        System.out.println("0 - Sair");
    }
}
			
