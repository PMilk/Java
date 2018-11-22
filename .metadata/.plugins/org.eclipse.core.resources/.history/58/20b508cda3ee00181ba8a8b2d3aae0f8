import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int p1=0;
		int p2=0;
		int p3=0;
		int []maior=new int[3];
		int []indice = new int[3];
		for (int i= 0;i<3;i++) {maior[i]=1000; }
		
		int[][]matriz = new int [3][3];
		for (int i= 0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println("Digite a "+(j+1)+"º nota do aluno "+(i+1));
				matriz[i][j]=leia.nextInt();
				if(maior[i]>matriz[i][j]) {
					maior[i]=matriz[i][j];
					indice[i]=(j+1);
					
				}
			}
		}

		for (int i= 0;i<3;i++) {
			
				
			if(indice[i]==1) {
				p1++;
			}
			
			if(indice[i]==2) {
				p2++;
			}
			
			if(indice[i]==3) {
				p3++;
			}
		
		}
		
		for (int i= 0;i<3;i++) {
			
				
				System.out.println("Aluno:"+i+" Nota:"+maior[i]);
		
		}
		
		System.out.println("Alunos que tiraram nota baixa na P1 "+p1);
		System.out.println("Alunos que tiraram nota baixa na P2 "+p2);
		System.out.println("Alunos que tiraram nota baixa na P3 "+p3);

	}

}
