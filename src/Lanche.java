//SUPERCLASSE LANCHE EXTENDE A SUPERCLASSE CARDAPIO E IMPLEMENTA A INTERFACE
public abstract class Lanche extends Cardapio implements CardapioInterface{
	
	//CONSTRUCTOR
	public Lanche() {}
	
	//M�TODOS IMPORTADOS DA CLASSE CARDAPIO
	public void calcularTempo(double distancia) {
		super.calcularTempo(distancia);
		
	}
	public void fecharPedido() {
		super.fecharPedido();
	}
	
	
}
	


