
import java.util.Scanner;

public abstract class Massa extends Cardapio implements MassaInterface{
	
	Scanner opcoes = new Scanner(System.in);
	
	//ATRIBUTOS
	private double preco;
	private String molho;
	private String sabor;
	
	private int escolhaDoTipoMolho;
	private String molhoEscolhido;
	
	//CONSTRUCTOR
	public Massa() {}
	
	//GETTERS AND SETTERS
	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}
	public String getMolho() {
		return this.molho;
	}

	//MÉTODO ESCOLHER MOLHO
	public String escolherMolho() {
			System.out.println("   ===========================================================================================   "); 
			System.out.println("  |                                     Escolha seu molho                                     |  ");
			System.out.println("   ===========================================================================================   "); 
			System.out.println("  |                                                                                           |  ");
			System.out.println("  |                                     1 - Molho ao Sugo                                     |  ");
			System.out.println("  |                                     2 - Molho branco                                      |  ");
			System.out.println("  |                                     3 - Molho bolonhesa                                   |  ");
			System.out.println("  |                                                                                           |  ");
			System.out.println("  |                                  Escolha a opção desejada:                                |  ");
			System.out.println("   ===========================================================================================   "); 
	       
			escolhaDoTipoMolho = opcoes.nextInt();
	       
			switch (escolhaDoTipoMolho) {
				case 1:
	       			molhoEscolhido =  "Molho ao Sugo"; 
	       			break;
	       		case 2:
	       			molhoEscolhido = "Molho branco";
	       			break;
	       		case 3:
	       			molhoEscolhido = "Molho bolonhesa";
	       			break;
	       		default:
	       			System.out.println("Número inválido");
	       }
		return molhoEscolhido;
	}
	
	//CALCULANDO O TEMPO PARA ENTREGAR O PEDIDO
	//IMPORTANDO A FUNÇÃO DA SUPERCLASSE CARDAPIO, POIS TODOS OS PRODUTOS TEM ESTA FUNÇÃO DE CALCULAR TEMPO, LOGO PARA ECONOMIZAR LINHAS DE CÓDIGO, CRIEI ESTA FUNÇÃO NA SUPERCLASSE CARDAPIO E CHAMEI AQUI 
	//CODIGO REFATORADO COM SUCESSO!!
	public void calcularTempo(double distancia) {
		super.calcularTempo(distancia);
		
	}
	public void fecharPedido() {
		super.fecharPedido();
	}
	
}
