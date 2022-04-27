import java.util.Scanner;

public class TP02x02 {

    public static void main(String args[]){
 	/**
         * nomes: Eduarda Vitória Cunha Matias, Stefany Tam Pereira Mendes 4.
         * Armazenar seis valores em uma matriz de ordem 2x3. Apresentar os
         * valores na tela.
         */
        int cont = 0;
        int matriz[][] = new int[2][3];
        Scanner scan = new Scanner(System.in);
        
        for (int lin = 0; lin < 2; lin++) {
            for (int col = 0; col < 3; col++) {
                System.out.println("Digite um valor: ");
                matriz[lin][col] = scan.nextInt();
                cont++;
            }
        }

        //Exibindo Valores
        for (int lin = 0; lin < 2; lin++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(matriz[lin][col] + "\t");
            }
            System.out.println("");

	}
}