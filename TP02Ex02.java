import java.util.Scanner;

public class TP02Ex02 {

    public static void main(String args[]){
 /**
         * nomes: Eduarda Vit�ria Cunha Matias, Stefany Tam Pereira Mendes 2.
         * Entrar via teclado com dez valores positivos. Consistir a digita��o e
         * enviar mensagem de erro, se necess�rio. Ap�s a digita��o, exibir: a.
         * O maior valor; b. A soma dos valores; c. A m�dia aritm�tica dos
         * valores.
         */
        int maior, soma, num;
        double media;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o 1� valor: ");
        num = scan.nextInt();
        if (num < 0) {
            System.out.println("Apenas valores positivos!");
            do {
                System.out.println("Digite o 1� valor novamente: ");
                num = scan.nextInt();
            } while (num < 0);
        }
        maior = num;
        soma = num;
        for (int i = 1; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "� valor: ");
            num = scan.nextInt();
            if (num < 0) {
                System.out.println("Apenas valores positivos!");
                do {
                    System.out.println("Digite o " + (i + 1) + "� valor novamente: ");
                    num = scan.nextInt();
                } while (num < 0);
            }
            if (num > maior) {
                maior = num;
            }
            soma = soma + num;

        }
        media = soma / 5;
        System.out.println("M�dia: " + media + "\nSoma: " + soma + "\nMaior: " + maior);    
    
	}
}