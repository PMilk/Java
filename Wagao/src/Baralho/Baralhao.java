package Baralho;
import java.util.Random;
public class Baralhao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Baralho b = new Baralho();
		b.iniciaCartas();
		System.out.println("Cartas Iniciadas");
		b.imprimeCartas();
		System.out.println("---------------------------------");
		System.out.println("Cartas Embaralhadas");
		b.embaralhaCartas();
		
	}
	
}
