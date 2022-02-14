import java.util.Scanner;

public class Main {
	
	//SCANNER UNICO 
  static Scanner lerDados = new Scanner(System.in);

    //MÉTODO PRINCIPAL
	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		//INSTANCIANDO AS CLASSES
		Sanduiche sanduiche = new Sanduiche();
		Massa massa1 = new Macarrao();
		Massa massa2 = new Pizza();
		Massa massa3 = new Lasanha();
		Bolo bolo = new Bolo();
		Salgados salgado = new Salgados();
		Cardapio cardapio = new Sanduiche();
		
		// MENU INICIAL (COMO SE FOSSE O CARDAPIO DO RESTAURANTE)
	    System.out.println("   ===========================================================================================   ");
		System.out.println("  |                          Bem vindos ao Delivery do Java Express                           |  ");
		System.out.println("   ===========================================================================================   ");
		System.out.println("                                                                                                 ");
		System.out.println("   ===========================================================================================   ");
		System.out.println("  |                                         Cardápio                                          |  ");
		System.out.println("   ===========================================================================================   ");
		System.out.println("  | 1 - Sanduíches      R$ 10,00 + 2,00 adicionais                                            |  ");
		System.out.println("  | 2 - Massas          R$ (depende do sabor escolhido)                                       |  ");
		System.out.println("  | 3 - Bolos           R$ 40,90                                                              |  ");
		System.out.println("  | 4 - Salgados        A partir de R$6,50                                                    |  ");
		System.out.println("  |                                                                                           |  ");
		System.out.println("  |                                Escolha a opção desejada:                                  |  ");
		System.out.println("   ===========================================================================================   ");

		int escolhaDoTipoLanche = lerDados.nextInt();

		switch (escolhaDoTipoLanche) {
		case 1:
			System.out.println("   ===========================================================================================   ");
			System.out.println("  |                          Adicionar ingredientes ao seu sanduíche                          |  ");
			System.out.println("  |                                                                                           |  ");

			// chama a função escolherIngrediente() criada abaixo;
			sanduiche.escolherIngrediente();

			break;
		case 2:
			System.out.println("   ===========================================================================================   ");
			System.out.println("  |               Você escolheu Massa. Dentre as massas, você pode escolher entre:            |  ");
			System.out.println("  |                                                                                           |  ");
			//CHAMA A FUNÇÃO ESCOLHERTIPODEMASSA() CRIADA LOGO ABAIXO;
			escolherTipoDeMassa();
			break;

		case 3:
			System.out.println("   ===========================================================================================   ");
			System.out.println("  |           Você escolheu Bolo. Digite as opções de Massa, Recheio e Cobertura              |  ");
			bolo.escolherBolo();

			break;
		case 4:
			salgado.menuSalgados();
			break;
		default:
			System.out.println("Número inválido");
		}
		cardapio.agradecimento();
	}

	// MÉTODO PARA ESCOLHA TIPO DE MASSA
	public static void escolherTipoDeMassa() {

		//DECLAÇÃO DAS VARIÁVEIS INT E DOUBLE
		int escolhaDoTipoMassa, escolhaTipoDeMacarrao, escolhaTipoPizza;
		double distancia;

    	System.out.println("  |                      1 - Macarrão     a partir de R$ 28,40                                |   ");
		System.out.println("  |                      2 - Pizza        a partir de R$ 45,90                                |   ");
		System.out.println("  |                      3 - Lasanha      R$ 45.90                                            |   ");
		System.out.println("  |                                                                                           |   ");
		System.out.println("  |                                Escolha a opção desejada:                                  |   ");
		System.out.println("   ===========================================================================================    ");

		//ARMAZENANDO NA VARIAVEL ESCOLHATIPODEMASSA O VALOR DIGITADO NO SCANNER
		escolhaDoTipoMassa = lerDados.nextInt();

		//SWITCH PARA CADA ESCOLHA
		switch (escolhaDoTipoMassa) {
		case 1:
			Massa massa1 = new Macarrao();
			
			System.out.println("   ===========================================================================================   ");
			System.out.println("  |                               Tipos de macarrão a escolher                                |  ");
			System.out.println("   ===========================================================================================   ");
			System.out.println("  |                               1 - Talaharim        R$ 28,40                               |  ");
			System.out.println("  |                               2 - Pene             R$ 36,70                               |  ");
			System.out.println("  |                               3 - Parafuso         R$ 39,00                               |  ");
			System.out.println("  |                                                                                           |  ");
			System.out.println("  |                                Escolha a opção desejada:                                  |  ");
			System.out.println("   ===========================================================================================   ");

			
			
			escolhaTipoDeMacarrao = lerDados.nextInt();
			switch (escolhaTipoDeMacarrao) {			
				case 1:
			
				massa1.setSabor("Talharim");
				massa1.setPreco(28.40);
				break;
			case 2:
				massa1.setSabor("Pene");
				massa1.setPreco(36.70);
				break;
			case 3:
				massa1.setSabor("Parafuso");
				massa1.setPreco(39.00);
				break;

			default:
				System.out.println("Número inválido");
			}
			// SETANDO O MOLHO PARA RECEBER O QUE FOI ESCOLHIDO NO MÉTODO
			massa1.setMolho(massa1.escolherMolho());
			System.out.println("   ======================================================================================================   ");
			System.out.println("  |  Você escolheu macarrão " + massa1.getSabor() + " e o molho escolhido foi: " + massa1.getMolho() + " |  ");
			System.out.println("   ======================================================================================================   ");
			massa1.mensagemTempoDeEntrega();// CHAMANDO O MÉTODO
			distancia = lerDados.nextInt();
			massa1.calcularTempo(distancia);
			massa1.fecharPedido();
			break;
		// SE A OPCAO DIGITADA FOR 2, O CLIENTE ESCOLHE A PIZZA
		case 2:
			Massa massa2 = new Pizza();
			System.out.println("                                                                                                 ");
			System.out.println("   ===========================================================================================   ");
			System.out.println("  |                              Sabores de pizzas disponíveis                                |  ");
			System.out.println("   ===========================================================================================   ");
			System.out.println("  |                              1  - Calabreza        R$ 36,40                               |  ");
			System.out.println("  |                              2  - Atum             R$ 40,60                               |  ");
			System.out.println("  |                              3  - 4 queijos        R$ 41,00                               |  ");
			System.out.println("  |                                                                                           |  ");
			System.out.println("  |                               Escolha a opção desejada:                                   |  ");
			escolhaTipoPizza = lerDados.nextInt();
			System.out.println("   ===========================================================================================   ");

			// VERIFICANDO A CONDIÇÃO
			switch (escolhaTipoPizza) {
			  case 1: // SE O VALOR DIGITADO FOR 1 ENTRA NESTE CASE 1
				massa2.setSabor("Calabreza");
				massa2.setPreco(36.40);
				break;
			case 2:// SE O VALOR DIGITADO FOR 2 ENTRA NESTE CASE
				massa2.setSabor("Atum");
				massa2.setPreco(40.60);
				break;
			case 3: // SE O VALOR DIGITADO FOR 3, ENTRA NESTE CASE
				massa2.setSabor("4 queijos");
				massa2.setPreco(41.00);
				break;
			default: // SE FOR DIGITADO OUTRO VALOR QUALQUER, ENTRA NESTE CASE DEFAULT
				System.out.println("Número inválido");
			}

			System.out.println("   ===========================================================================================   ");
			System.out.println("  |                      Você escolheu pizza de " + massa2.getSabor()+ "                      |  ");
			System.out.println("   ===========================================================================================   ");
			// CHAMANDO O MÉTODO DE MENSAGEM_TEMPO_DE_ENTREGA
			massa2.mensagemTempoDeEntrega();
			distancia = lerDados.nextInt();// DIGITA A DISTANCIA PARA ASSIM CALCULAR O TEMPO TOTAL DE ENTREGA
			massa2.calcularTempo(distancia);
			// CHAMA O MÉTODO
			massa2.fecharPedido();
			break;

		case 3:
			Massa massa3 = new Lasanha();
			massa3.setMolho(massa3.escolherMolho());
			System.out.println("   ===========================================================================================   ");
			System.out.println("  |          Você escolheu lasanha e o molho escolhido foi: " + massa3.getMolho() + "         |  ");
			System.out.println("   ===========================================================================================   ");
			massa3.setPreco(45.90);
			// CHAMA O MÉTODO
			massa3.mensagemTempoDeEntrega();
     		distancia = lerDados.nextInt();
			massa3.calcularTempo(distancia);
			massa3.fecharPedido();
			break;
		default:
			System.out.println("Número inválido");
		}

	}
	
}