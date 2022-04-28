/*Eduarda Vitória Cunha Matias e  Stefany Tam Pereira Mendes */

/*Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
valor matriz e armazenar o resultado na própria matriz, nas posições correspondentes.*/

package exercicios;
import java.util.Scanner;
public class TP02Ex07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int valores[][] = new int [3][4];
		int i = 0, j = 0, c = 0;
		
		for(i = 0; i < 3; i++) {
			for(j = 0; j < 4; j++) {
				System.out.print("Digite o " + (c + 1) + "° valor: ");
				c++;
				valores[i][j] = scan.nextInt();
			}
		}
		
		for(i = 0; i < 3; i++) {
			for(j = 0; j < 4; j++) {
				valores[i][j] = valores[i][j]  * 2; /*multiplica todos os valores da matriz por 2*/
			}
		}
		
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 4; j++) {
				System.out.print(valores[i][j] + " | ");
			}
			System.out.println(" ");
		}
		
		scan.close();
	}
}
