import java.util.Scanner;

public class TP02Ex02 {

    public static void main(String args[]){
 /**
         * nomes: Eduarda Vitória Cunha Matias, Stefany Tam Pereira Mendes 2.
         * Entrar via teclado com dez valores positivos. Consistir a digitação e
         * enviar mensagem de erro, se necessário. Após a digitação, exibir: a.
         * O maior valor; b. A soma dos valores; c. A média aritmética dos
         * valores.
         */
        int maior, soma, num;
        double media;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o 1º valor: ");
        num = scan.nextInt();
        if (num < 0) {
            System.out.println("Apenas valores positivos!");
            do {
                System.out.println("Digite o 1º valor novamente: ");
                num = scan.nextInt();
            } while (num < 0);
        }
        maior = num;
        soma = num;
        for (int i = 1; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor: ");
            num = scan.nextInt();
            if (num < 0) {
                System.out.println("Apenas valores positivos!");
                do {
                    System.out.println("Digite o " + (i + 1) + "º valor novamente: ");
                    num = scan.nextInt();
                } while (num < 0);
            }
            if (num > maior) {
                maior = num;
            }
            soma = soma + num;

        }
        media = soma / 5;
        System.out.println("Média: " + media + "\nSoma: " + soma + "\nMaior: " + maior);    
    
	}
}