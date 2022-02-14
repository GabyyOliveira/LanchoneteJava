//SUPERCLASSE CARDAPIO IMPLEMENTA A INTERFACE CARDAPIO
abstract class Cardapio implements CardapioInterface{
	
	//ATRIBUTOS
	protected double preco;
	private double tempoTotal;
	protected final double TAXA_DE_ENTREGA = 3.50;
	
	//CONSTRUCTOR
	public Cardapio() {}
	
	
	/***************************GETTERS AND SETTERS*********************/
	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	/*********************************M�TODOS*****************************/
	public void calcularTempo(double distancia) {
		//DECLARA��O DAS VARIAVEIS
		double inteira,resto;
		//O ATRIBUTO TEMPOTOTAL RECEBE O VALOR DA DISTANCIA (ARMAZENADO LA DO MAIN) MULTIPLICADO POR 10 (TEMPO A CADA 1KM) E SOMA 30 (TEMPODE PREPARO DO PRATO);
		this.tempoTotal = (distancia * 10) + 30;
		
		inteira = tempoTotal / 60;
		
		resto = tempoTotal % 60;
		
		System.out.println("   ===========================================================================================   "); 
		System.out.println("  |       Tempo total para entrega: " + (int)inteira + " hora e " + resto + " minutos                    |   ");
		System.out.println("   ===========================================================================================   "); 
		
	}
	//M�TODO FECHAR PEDIDO
	public void fecharPedido() {
		System.out.println("                                                                                                 "); 
		System.out.println("   ===========================================================================================   "); 
		System.out.println("  |                           Seu pedido foi realizado com sucesso                            |  ");
		System.out.println("  |                              Seu pedido ficou em: R$ " + (getPreco() + this.TAXA_DE_ENTREGA) + "         |  ");
		System.out.println("   ===========================================================================================   "); 
		
		
	}
	//M�TODO TEMPO ENTREGA
	public void mensagemTempoDeEntrega() {
		System.out.println("   ===========================================================================================   ");
		System.out.println("  |       Para c�lculo do tempo de entrega, precisamos saber a dist�ncia at� sua casa!        |  ");
		System.out.println("  |                                                                                           |  ");
		System.out.println("  |                        Qual a dist�ncia da sua casa? (em km)                              |  ");
	}
	//M�TODO AGRADECIMENTO
	public static void agradecimento() {
		System.out.println("   ===========================================================================================   ");
		System.out.println("  |                                                                                           |  ");
		System.out.println("  |                  Agradecemos a sua prefer�ncia e desejamos bom apetite!!!                 |  ");
		System.out.println("   ===========================================================================================   ");
		System.out.println(" ");

	}
	
	
}
