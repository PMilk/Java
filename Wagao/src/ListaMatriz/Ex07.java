package ListaMatriz;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int[][]vendas=new int[5][4];
		
		int[]vendaMes=new int[5];
		int[]SemVenda=new int[4];
		int total=0;
		
		for(int i=0;i<5;i++) {
			for(int j = 0; j<4;j++) {
				System.out.println("Digite as vendas do vendedor "+(i+1)+" na semana "+(j+1));
				vendas[i][j]=leia.nextInt();
				total+=vendas[i][j];
			}	
			
		}
		for(int i=0;i<5;i++) {
			for(int j = 0; j<4;j++) {
				
				vendaMes[i]+=vendas[i][j];
			}	
			
		}
		for(int j = 0; j<4;j++)
		 {
			for(int i=0;i<5;i++)
			{
				
				SemVenda[j]+=vendas[i][j];
			}	
			
		}
		for(int i=0;i<5;i++) {
			System.out.println("total de vendas do vendedor "+(i+1)+": "+vendaMes[i]);
		}
		System.out.println("_______________________");
	
		for(int i=0;i<4;i++) {
			System.out.println("total de vendas na semana "+(i+1)+": "+SemVenda[i]);
		}
		System.out.println("_______________________");
		System.out.println("Total de Vendas no Mes = "+total);
		
		leia.close();
	}

}