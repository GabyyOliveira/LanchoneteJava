//package Lanches;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Sanduiche extends Lanche implements SanduicheInterface{
	
	Scanner opcoes = new Scanner(System.in);
	
	//ATRIBUTOS
	private double preco;
		
	//UTILIZANDO O ARRAYLIST
	List<String> ingredientes = new ArrayList<>();
	
	//CONSTRUCTOR
	public Sanduiche() {
		
	}
	
	//GETTERS AND SETTERS
	public void setIngrediente(String ingrediente) {
		this.ingredientes.add(ingrediente);
		
	}
	
	public void getIngrediente() { 
		System.out.println("                   Você escolheu os ingredientes: " + this.ingredientes + "                     ");
		
	}
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	//MÉTODO ESCOLHER INGREDIENTES ADICIONAIS
	public void escolherIngrediente() {

		//DECLARANDO AS VARIAVEIS
		int escolhaDoIngrediente = 11, contador = 0;
		double distancia, quantIngrediente = -1;
		Sanduiche sanduiche = new Sanduiche();

		System.out.println("  |             1 - queijo        2 - presunto       3 - bacon          4 - alface            |  ");
		System.out.println("  |             5 - tomate        6 - catupiry       7 - maionese       8 - abacaxi           |  ");
		System.out.println("  |          9 - batata Palha         10 - mostarda      0 - para encerrar a escollha         |  ");
		System.out.println("  |                                                                                           |  ");
		System.out.println("  |                         Você pode escolher até 10 ingredientes:                           |  ");
		System.out.println("  |                                                                                           |  ");

		// LOOP
		while ((contador < 10) && escolhaDoIngrediente != 0) {

			System.out.println("  |             Digite o número do ingrediente ou [0] para encerrar a escolha                 |  ");
			System.out.println("   ===========================================================================================   ");

			escolhaDoIngrediente = opcoes.nextInt();

			switch (escolhaDoIngrediente) {
			case 1:
				sanduiche.setIngrediente("queijo");
				break;
			case 2:
				sanduiche.setIngrediente("presunto");
				break;
			case 3:
				sanduiche.setIngrediente("bacon");
				break;
			case 4:
				sanduiche.setIngrediente("alface");
				break;
			case 5:
				sanduiche.setIngrediente("tomate");
				break;
			case 6:
				sanduiche.setIngrediente("catupiry");
				break;
			case 7:
				sanduiche.setIngrediente("maionese");
				break;
			case 8:
				sanduiche.setIngrediente("abacaxi");
				break;
			case 9:
				sanduiche.setIngrediente("batata pallha");
				break;
			case 10:
				sanduiche.setIngrediente("mostarda");
				break;
			case 0:
				break;
			default:
				System.out.println("Número inválido");
			}
			contador++;
			quantIngrediente++;

			System.out.println("                                                                                                 ");
			System.out.println("   ===========================================================================================   ");
			sanduiche.getIngrediente();
			System.out.println("   ===========================================================================================   ");
			System.out.println(" ");

		}
		// Setando o preço do lanche para 10(valor inicial do lanche) + a quantidade de
		// ingrediente escolhida pelo cliente, multiplicado por 2 (valor dos adicionais)
		sanduiche.setPreco(10 + quantIngrediente * 2);
		mensagemTempoDeEntrega();
		distancia = opcoes.nextInt();
		System.out.println("   ===========================================================================================   ");
		sanduiche.calcularTempo(distancia);
		sanduiche.fecharPedido();
	}

}
