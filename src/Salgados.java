import java.util.Scanner;
public class Salgados extends Lanche implements SalgadosInterface{
	
	//ATRIBUTOS
	private double preco;
	
	//GETTERS AND SETTERS
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	Scanner opcoes = new Scanner(System.in);
	
	//MENU SALGADOS
	public void menuSalgados() {
		
		System.out.println("   ===========================================================================================   "); 
		System.out.println("  |                              Escolha o tipo do seu Salgado                                |  ");
		System.out.println("   ===========================================================================================   "); 
		System.out.println("  |                                       1 - Assados                                         |  ");
		System.out.println("  |                                       2 - Fritos                                          |  ");
		System.out.println("  |                                                                                           |  ");
		System.out.println("  |                                 Escolha a opção desejada:                                 |  ");
		System.out.println("   ===========================================================================================   "); 
		
		int escolherTipoSalgado = opcoes.nextInt();
		
		//SWITCH PARA CADA ESCOLHA
		switch(escolherTipoSalgado) {
			case 1:
				menuAssado();
				break;
			case 2:
				menuFrito();
				break;
			default:
				System.out.println("Opção inválida");
				break;
		}
		
	}
	//MENU SALGADO ASSADO
	public void menuAssado() {
		//INSTANCIANDO UM NOVO OBJETO
		Salgados salgado1 = new Salgados();
		double distancia;
		
		System.out.println("   ===========================================================================================   "); 
		System.out.println("  |                                 Opções Salgados Assados                                   |  ");
		System.out.println("   ===========================================================================================   "); 
		System.out.println("  |                          1 - Empada Frango              R$6,50                            |  ");
		System.out.println("  |                          2 - Croissant italiano         R$9,90                            |  ");
		System.out.println("  |                          3 - Esfiha de Carne            R$7,00                            |  ");
		System.out.println("  |                          4 - Enroladinho de Salsicha    R$7,00                            |  ");
		System.out.println("  |                                                                                           |  ");
		System.out.println("  |                                Escolha a opção desejada:                                  |  ");
		System.out.println("   ===========================================================================================   ");
		
		int escolherAssado = opcoes.nextInt();
		
		switch(escolherAssado) {
			case 1:
				salgado1.setPreco(6.50);
				break;
			case 2:
				salgado1.setPreco(9.90);
				break;
			case 3:
				salgado1.setPreco(7.00);
				break;
			case 4:
				salgado1.setPreco(7.00);
				break;
			default:
				System.out.println("Opção inválida");
				break;
		}
		mensagemTempoDeEntrega();
		distancia = opcoes.nextInt();
		salgado1.calcularTempo(distancia);
		salgado1.fecharPedido();
	}
	//MENU SALGADO FRITO
	public void menuFrito() {
		//INSTANCIANDO UM NOVO OBJETO
		Salgados salgado2 = new Salgados();
		double distancia;
		
		System.out.println("   ===========================================================================================   "); 
		System.out.println("  |                                  Opções Salgados Fritos                                   |  ");
		System.out.println("   ===========================================================================================   "); 
		System.out.println("  |                             1 - Quibe                  R$5,50                             |  ");
		System.out.println("  |                             2 - Coxinha                R$9,90                             |  ");
		System.out.println("  |                             3 - Croquete               R$4,00                             |  ");
		System.out.println("  |                             4 - Bolinha de Queijo      R$3,00                             |  ");
		System.out.println("  |                                                                                           |  ");
		System.out.println("  |                                 Escolha a opção desejada:                                 |  ");
		System.out.println("   ===========================================================================================   ");
		
		int escolherFrito = opcoes.nextInt();
		
		switch(escolherFrito) {
		case 1:
			salgado2.setPreco(5.50);
			break;
		case 2:
			salgado2.setPreco(9.90);
			break;
		case 3:
			salgado2.setPreco(4.00);
			break;
		case 4:
			salgado2.setPreco(3.00);
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
		mensagemTempoDeEntrega();
		distancia = opcoes.nextInt();
		salgado2.calcularTempo(distancia);
		salgado2.fecharPedido();
	}
	
	
}
