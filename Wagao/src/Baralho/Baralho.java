package Baralho;

public class Baralho {
	// Array representando os naipes
	private String[] naipe = { "Paus", "Ouros", "Copas", "Espadas" };
	// Array representando os valores
	private String[] valor = { "2", "3", "4", "5", "6", "7", "8", "9",
	"10", "Valete", "Dama", "Rei", "Az" };

	// constantes representando quantidades em cada array
	private final int quantNaipes = naipe.length;
	private final int quantValores = valor.length;
	private final int quantCartas = quantNaipes * quantValores;

	// Array representando o baralho de cartas
	private String[] baralho = new String[quantCartas];
	public void iniciaCartas() {
	//TODO criar loop(s) para criar todas as cartas do baralho;
	// as cartas são criadas em ordem de número/naipe;
	// cada carta é representada por String resultante da
	// concatenação: número + " de " + naipe.
		
	}
	
	public void imprimeCartas() {
	//TODO criar loop para imprimir todas as cartas do baralho
	}

	public void embaralhaCartas() {
	//TODO criar loop para embaralhar as cartas do baralho
	}
	
}
