/*Eduarda Vit�ria Cunha Matias e  Stefany Tam Pereira Mendes */

/*Entrar com uma matriz de ordem MxN, onde a ordem tamb�m ser� escolhida pelo usu�rio,
sendo que no m�ximo 10x10. A matriz n�o precisa ser quadr�tica. Ap�s a digita��o dos
elementos, calcular e exibir a matriz transposta.*/

package exercicios;
import java.util.Scanner;
public class TP02Ex09 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		int i, j, linhas, colunas, c = 0;
		
		System.out.print("Digite o n�mero de linhas: ");
		i = scan.nextInt();
		System.out.print("Digite o n�mero de colunas: ");
		j = scan.nextInt();
		
		System.out.println("==============================");
		
		int valores[][] = new int [i][j];
		
		for(linhas = 0; linhas < i; linhas++) {
			for(colunas = 0;  colunas < j; colunas++) {
				System.out.print("Digite o " + (c + 1) + "� valor: ");
				c++;
				valores[linhas][colunas] = scan.nextInt();
			}
		}
		
		System.out.println("========== Matriz ==========");
		for (linhas = 0; linhas < i; linhas++) {
			for (colunas = 0; colunas < j; colunas++) {
				System.out.print(valores[linhas][colunas] + " | ");
			}
			System.out.println(" ");
		}
		
		System.out.println("========== Matriz transposta ==========");
		for (colunas = 0; colunas < j; colunas++) {
			for (linhas= 0; linhas < i; linhas++) {
				System.out.print(valores[linhas][colunas] + " | ");
			}
			System.out.println(" ");
		}
		
		scan.close();
	}
}
