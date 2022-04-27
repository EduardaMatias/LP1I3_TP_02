/*Eduarda Vitória Cunha Matias e  Stefany Tam Pereira Mendes */

/*Entrar com uma matriz de ordem MxN, onde a ordem também será escolhida pelo usuário,
sendo que no máximo 10x10. A matriz não precisa ser quadrática. Após a digitação dos
elementos, calcular e exibir a matriz transposta.*/

package exercicios;
import java.util.Scanner;
public class TP02Ex09 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		int i, j, linhas, colunas, c = 0;
		
		System.out.println("Digite o número de linhas: ");
		i = scan.nextInt();
		System.out.println("Digite o número de colunas: ");
		j = scan.nextInt();
		
		System.out.println(i);
		int valores[][] = new int [i][j];
		
		for(linhas = 0; linhas < i; linhas++) {
			for(colunas = 0;  colunas < j; colunas++) {
				System.out.print("Digite o " + (c + 1) + "° valor: ");
				c++;
				valores[linhas][colunas] = scan.nextInt();
			}
		}
		
		for (linhas = 0; linhas < i; linhas++) {
			for (colunas = 0; colunas < j; colunas++) {
				System.out.print(valores[linhas][colunas] + " | ");
			}
		}
		
		scan.close();
	}
}
