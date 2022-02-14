//IMPORTANDO DA BIBLIOTECA O SCANNER
import java.util.Scanner;

//SUBCLASSE MACARRAO EXTENDE CLASSE MASSA
public class Macarrao extends Massa{
	
	//ATRIBUTOS
	protected double preco;
	
	//SCANNER
	Scanner opcoes = new Scanner(System.in);
	
	//CONSTRUCTOR
	public Macarrao() {}

	//GETTERS AND SETTERS
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
}
