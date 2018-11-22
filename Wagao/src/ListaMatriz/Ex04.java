package ListaMatriz;
import java.util.Scanner;
public class Ex04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int[][]matriz= new int[10][20];
		int []soma= new int[10];
		for(int i = 0 ;i<10;i++) {
			for(int j = 0; j<20;j++) {
				System.out.println("digite o numero da linha "+i );
				matriz[i][j]=leia.nextInt();
				soma[i]+=matriz[i][j];
				
			}
		}
		for(int i = 0 ;i<10;i++) {
			for(int j = 0; j<20;j++) {
				
				matriz[i][j]=soma[i]*matriz[i][j];
				
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println("");
	}
	}
}
