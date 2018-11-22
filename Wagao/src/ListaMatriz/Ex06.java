package ListaMatriz;
import java.util.Scanner;
public class Ex06 {
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		//CRIAR ARRAY 4X5
		int array45[][] = new int[4][5];
		int numero;
		for(int i = 0; i<4;i++) {
			for(int j = 0; j<5;j++) {
				System.out.println("Digite um numero para a linha:"+(i+1)+" coluna:"+(j+1));
				numero = leia.nextInt();
				array45[i][j] = numero;
			}
		}
		
		for (int i= 0;i<4;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(array45[i][j]+" ");
			}
			System.out.println("");
		}
		
		//cria o array 5x2
		int array52[][] = new int[5][2];
		for(int i = 0; i<5;i++) {
			for(int j = 0; j<2;j++) {
				System.out.println("Digite um numero para a linha:"+(i+1)+" coluna:"+(j+1));
				numero = leia.nextInt();
				array52[i][j] = numero;
			}
		}
		
		for (int i= 0;i<5;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(array52[i][j]+" ");
			}
			System.out.println("");
		}

	}

}
