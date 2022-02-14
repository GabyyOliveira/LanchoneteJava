import java.util.Scanner;

//SUBCLASSE BOLO EXTENDE A SUPERCLASSE CARDAPIO
public class Bolo extends Cardapio implements BoloInterface{
	Scanner opcoes = new Scanner(System.in);
	
	
	//ATRIBUTOS
	private double preco;
	private String massa;
	private String recheio;
	private String cobertura;
	
	//CONSTRUCTOR
	public Bolo() {
	}
	
	//CALCULANDO O TEMPO PARA ENTREGAR O PEDIDO
    //IMPORTANDO A FUN��O DA SUPERCLASSE CARDAPIO, POIS TODOS OS PRODUTOS TEM ESTA FUN��O DE CALCULAR TEMPO, LOGO PARA ECONOMIZAR LINHAS DE C�DIGO, CRIEI ESTA FUN��O NA SUPERCLASSE CARDAPIO E CHAMEI AQUI 
    //CODIGO REFATORADO COM SUCESSO!!
	public void calcularTempo(double distancia) {
		super.calcularTempo(distancia);
	}
	
	public void fecharPedido() {
		super.fecharPedido();
	}

	//GETTERS AND SETTERS
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}
	public String getRecheio() {
		return recheio;
	}
	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}
	public String getCobertura() {
		return cobertura;
	}
	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}
	//M�TODO ESCOLHERBOLO
	public void escolherBolo() {
		//INSTANCIANDO UM NOVO OBJETO DA CLASSE BOLO
		Bolo bolo1 = new Bolo();
		
		//DECLARA��O DAS VARIAVEIS
		String tipoMassa, recheio, cobertura;
		double distancia;

		
		//ENUNCIADOS E SCANNERS
		System.out.println("   ===========================================================================================   ");
		System.out.println("  |                             Qual o tipo de massa voc� quer?                               |  ");
		tipoMassa = opcoes.next();
	
		
		System.out.println("  |                            Qual o tipo de recheio voc� quer?                              |  ");
		recheio = opcoes.next();

		
		System.out.println("  |                            Qual o tipo de cobertura voc� quer?                            |  ");
		cobertura = opcoes.next();
		System.out.println("   ===========================================================================================   ");

		
		//SETANDO OS ATRIBUTOS, PRE�O, MASSA, RECHEIO, COBERTURA, QUE SER�O ATRIBUIDOS NOS VALORES DIGITADOS NO SCANNER
		bolo1.setPreco(40.50);
		bolo1.setMassa(tipoMassa);
		bolo1.setRecheio(recheio);
		bolo1.setCobertura(cobertura);

		System.out.println("");
		System.out.println("   ===========================================================================================   ");
		System.out.println("Voc� escolheu um bolo com massa de: " + bolo1.getMassa() + " com recheio de: " + bolo1.getRecheio() + " e cobertura de:" + bolo1.getCobertura());
		System.out.println("   ===========================================================================================   ");

		//M�TODOS FINAIS, FECHAMENTO PEDIDO E CALCULAR TEMPO DE ENTREGA;
		mensagemTempoDeEntrega();
		distancia = opcoes.nextInt();
		bolo1.fecharPedido();
		bolo1.calcularTempo(distancia);
	}
	
	
	
	

}
