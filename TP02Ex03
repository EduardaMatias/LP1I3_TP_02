/*Eduarda Vitória Cunha Matias e  Stefany Tam Pereira Mendes */

/*Entrar via teclado com “N” valores quaisquer. O valor “N” (que representa a quantidade de
números) será digitado, deverá ser positivo, porém menor que vinte. Caso a quantidade não
satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. Após a
digitação dos “N” valores, exibir:
a. O maior valor;
b. O menor valor;
c. A soma dos valores;
d. A média aritmética dos valores;
e. A porcentagem de valores que são positivos;
f. A porcentagem de valores negativos;*/

package exercicios;

import java.util.Scanner;

public class TP02Ex03 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n, i, num, maiorNum = 0, menorNum = 99999999, soma = 0;
		double media = 0, positivos = 0, negativos = 0, pp = 0, pn = 0;

		do {
			System.out.print("Digite a quantidade de números: ");
			n = scan.nextInt();
		} while (n > 20 && n < 0);

		for (i = 0; i < n; i++) {
			System.out.print("Digite o " + (i + 1) + "° número: ");
			num = scan.nextInt();

			soma = soma + num;

			media = soma / n;

			if (num > maiorNum) {
				maiorNum = num;
			} else if(num < menorNum) {
				menorNum = num;
			}

			if (num > 0) {
				positivos++;
				pp = (positivos * 100) / n;
			} else {
				negativos++;
				pn = (negativos * 100) / n;
			}
		}

		System.out.println("Maior número: " + maiorNum + "\nMenor número: " + menorNum 
				+ "\nMedia aritmética dos valores: " + media + "\nPorcentagem dos valores positivos: " + pp 
				+ "% \nPorcentagem dos valores negativos: " + pn + "%");

		scan.close();
	}
}
