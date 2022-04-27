/*Eduarda Vitória Cunha Matias e  Stefany Tam Pereira Mendes */

/*Armazenar seis valores em uma matriz de ordem 3x2. Apresentar os valores na tela.*/

package exercicios;
import java.util.Scanner;
public class TP02Ex05 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int valores[][] = new int[3][2];
		int i = 0, j = 0, c =0;
		
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 2; j++) {
				System.out.print("Digite o " + (c + 1) + "° valor: ");
				c++;
				valores[i][j] = scan.nextInt();
			}
		}
		
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 2; j++) {
				System.out.print(valores[i][j] + " | ");
			}
		}

		scan.close();
	}

}
