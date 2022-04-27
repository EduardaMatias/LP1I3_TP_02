import java.util.Scanner;

public class TP02Ex10 {

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
        int cont = 0, qtdl, qtdc;
        int matriz[][] = new int[10][10];
        int matriz2[][] = new int[10][10];
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantas linhas: ");
        qtdl = scan.nextInt();
        System.out.println("Quantas colunas: ");
        qtdc = scan.nextInt();
        for (int lin = 0; lin < qtdl; lin++) {
            for (int col = 0; col < qtdc; col++) {
                System.out.println("Digite um valor: ");
                matriz[lin][col] = scan.nextInt();
                cont++;
            }
        }
      
        //Exibindo Valores
        for (int lin = 0; lin < qtdl; lin++) {
            for (int col = 0; col < qtdc; col++) {
                System.out.print(matriz[lin][col] + "\t");
            }
            System.out.println("");
        }
        System.out.print("Matriz inversa: \n");
        for (int lin = 0; lin < qtdl; lin++) {
            for (int col = 0; col < qtdc; col++) {
                matriz2[lin][col] = matriz[col][lin];
                System.out.print(matriz2[lin][col] + "\t");
            }
            System.out.println("");
        }

	}
}