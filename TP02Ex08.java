import java.util.Scanner;

public class TP02Ex08 {

    public static void main(String args[]){
 	/**
         * nomes: Eduarda Vitória Cunha Matias, Stefany Tam Pereira Mendes
         * Entrar via teclado com doze valores e armazená-los em uma matriz de
         * ordem 3x4. Após a digitação dos valores solicitar uma constante
         * multiplicativa, que deverá multiplicar cada valor matriz e armazenar
         * o resultado em outra matriz de mesma ordem, nas posições
         * correspondentes. Exibir as matrizes na tela, sob a forma matricial,
         * ou seja, linhas por colunas.
         */
        int cont = 0, mult;
        int matriz[][] = new int[3][4];
        int matriz2[][] = new int[3][4];
        Scanner scan = new Scanner(System.in);

        for (int lin = 0; lin < 3; lin++) {
            for (int col = 0; col < 4; col++) {
                System.out.println("Digite um valor: ");
                matriz[lin][col] = scan.nextInt();
                cont++;
            }
        }
        System.out.println("Constante multiplicativa: ");
        mult = scan.nextInt();
        //Exibindo Valores
        for (int lin = 0; lin < 3; lin++) {
            for (int col = 0; col < 4; col++) {
                matriz2[lin][col] = matriz[lin][col] * mult;
                System.out.print(matriz2[lin][col] + "\t");
            }
            System.out.println("");
        }

	}
}