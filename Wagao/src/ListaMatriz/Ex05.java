package ListaMatriz;

import java.util.Scanner;

public class Ex05 {
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
			
			int array42[][] = new int[4][2];
			array42[0][0] = (array45[0][0]*array52[0][0])+(array45[0][1]*array52[1][0])+(array45[0][2]*array52[2][0])+(array45[0][3]*array52[3][0])+(array45[0][4]*array52[4][0]);
			
			array42[0][1] = (array45[0][0]*array52[0][1])+(array45[0][1]*array52[1][1])+(array45[0][2]*array52[2][1])+(array45[0][3]*array52[3][1])+(array45[0][4]*array52[4][1]);
			
			array42[1][0] = (array45[1][0]*array52[0][0])+(array45[1][1]*array52[1][0])+(array45[1][2]*array52[2][0])+(array45[1][3]*array52[3][0])+(array45[1][4]*array52[4][0]);
			
			array42[1][1] =	(array45[1][0]*array52[0][1])+(array45[1][1]*array52[1][1])+(array45[1][2]*array52[2][1])+(array45[1][3]*array52[3][1])+(array45[1][4]*array52[4][1]);
			
			array42[2][0] = (array45[2][0]*array52[0][0])+(array45[2][1]*array52[1][0])+(array45[2][2]*array52[2][0])+(array45[2][3]*array52[3][0])+(array45[2][4]*array52[4][0]);
			
			array42[2][1] =	(array45[2][0]*array52[0][1])+(array45[2][1]*array52[1][1])+(array45[2][2]*array52[2][1])+(array45[2][3]*array52[3][1])+(array45[2][4]*array52[4][1]);
			
			array42[3][0] = (array45[3][0]*array52[0][0])+(array45[3][1]*array52[1][0])+(array45[3][2]*array52[2][0])+(array45[3][3]*array52[3][0])+(array45[3][4]*array52[4][0]);
			
			array42[3][1] = (array45[3][0]*array52[0][1])+(array45[3][1]*array52[1][1])+(array45[3][2]*array52[2][1])+(array45[3][3]*array52[3][1])+(array45[3][4]*array52[4][1]);
			System.out.println("-----------------------MATRIZ RESULTANTE-------------------------");
			for (int i= 0;i<4;i++) {
				for(int j=0;j<2;j++) {
					System.out.print(array42[i][j]+" ");
				}
				System.out.println("");
			}
		
		}

}
