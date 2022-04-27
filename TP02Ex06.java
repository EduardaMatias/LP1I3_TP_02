import java.util.Scanner;

public class TP02Ex06 {

    public static void main(String args[]){
 	 /**
         * nomes: Eduarda Vitória Cunha Matias, Stefany Tam Pereira Mendes 4.
         * Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os
         * nomes na tela.
         */
        int cont = 0;
        String matriz[][] = new String[2][3];
        Scanner scan = new Scanner(System.in);
        
        for (int lin = 0; lin < 2; lin++) {
            for (int col = 0; col < 3; col++) {
                System.out.println("Digite um nome: ");
                matriz[lin][col] = scan.nextLine();
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
}