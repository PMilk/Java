package ListaMatriz;
import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int maior=0;
		int[][]matriz = new int [2][2];
		for (int i= 0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.println("Digite o numero da linha "+i+" e coluna "+j);
				matriz[i][j]=leia.nextInt();
				if(maior<matriz[i][j]) {
					maior=matriz[i][j];
				}
			}
		}
		
		for (int i= 0;i<2;i++) {
			for(int j=0;j<2;j++) {
				matriz[i][j]=matriz[i][j]*maior;
				System.out.print(matriz[i][j]+" ");
				
			}
			System.out.println("");
		}

	}

}
