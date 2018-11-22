import java.util.Scanner;

public class Ex03{
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String []loja=new String[8];
		String []produto = new String[4];
		for (int i= 0;i<8;i++) {
			System.out.println("Digite o nome da "+(i+1)+"º loja ");
			loja[i]=leia.nextLine();
		}
		for (int i= 0;i<4;i++) {
			System.out.println("Digite o nome do "+(i+1)+"º produto ");
			produto[i]=leia.nextLine();
		}
		
		int[][]matriz = new int [8][4];
		
		for (int i= 0;i<8;i++) {
			for(int j=0;j<4;j++) {
				System.out.print("Digite o preço do produto "+
						produto[j] +" na loja  "+loja[i]);
				matriz[i][j]=leia.nextInt();
					
				}
			}
		System.out.println("produtos que nao utrapassaram 120,00 e suas lojas");
		
		
		for (int i= 0;i<8;i++) {
			for(int j=0;j<4;j++) {
				if(matriz[i][j]<120) {
				
				System.out.println(produto[j]+" na loja " + loja[i]);
				
				}	
			}
		}
	}

	}


