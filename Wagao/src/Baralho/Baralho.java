package Baralho;
import java.util.Random;

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
	// as cartas s�o criadas em ordem de n�mero/naipe;
	// cada carta � representada por String resultante da
	// concatena��o: n�mero + " de " + naipe.
		int c = 0;
		for(int i = 0; i < quantNaipes;i++) {
			for(int j = 0; j < quantValores;j++) {
				baralho[c] = valor[j]+" de "+naipe[i];
				c++;
			}
		}
	}
	
	public void imprimeCartas() {
	//TODO criar loop para imprimir todas as cartas do baralho
		for(int c = 0; c < quantCartas;c++) {
			System.out.println(baralho[c]);
		}
	}

	public void embaralhaCartas() {
	//TODO criar loop para embaralhar as cartas do baralho
		Random rand = new Random();
		int con = 0;
		int c;
		int[] num = new int[52];
		for(int i = 0; i <num.length; i++) {
			con = rand.nextInt((num.length + 1));
			// se foi o primeiro insere
			if( i == 0) {
				num[i] = con;
			}else {
				c = 0;
				// enquanto c for menor que o i faca isso
				while( c < i) {
					//comparar se os numeros s�o iguais
					if(num[c] == con) {
						con = rand.nextInt((num.length + 1));
						//recome�a
						c = 0;
					}else {
						c++;
					}
				}
				//apos todo o teste vc insere no array
				num[i] = con;
			}
		}
		
		for(c = 0; c < quantCartas;c++) {
			int numero = num[c];
			System.out.print("numero:"+numero);
			System.out.println("num:"+c+" "+baralho[numero]);
		}
	}
	
	
	
	
}
