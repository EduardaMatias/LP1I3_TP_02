import java.util.Scanner;

public class TP02Ex10 {

    public static void main(String args[]){
   /**
         * nomes: Eduarda Vitória Cunha Matias, Stefany Tam Pereira Mendes 10.
         * Entrar com uma matriz de ordem MxM, onde a ordem também será
         * escolhida pelo usuário, sendo que no máximo será de ordem 10 e
         * quadrática. Após a digitação dos elementos, calcular e exibir a
         * matriz inversa. Exibir as matrizes na tela, sob a forma matricial
         * (linhas x colunas).
         */
        Scanner sc = new Scanner(System.in);
        int i, j, l = 0, c = 0, k = 0;

        System.out.println("Digite a ordem: ");
        l = sc.nextInt();
        c = l;

        float mat[][] = new float[l][c];
        float ident[][] = new float[l][c];
        float pivo = 0, m = 0;

        for (int lin = 0; lin < l; lin++) {
            for (int col = 0; col < c; col++) {
                System.out.println("Digite um valor: ");
                mat[lin][col] = sc.nextInt();

            }
        }
        System.out.print("Matriz: \n");
        for (int lin = 0; lin < l; lin++) {
            for (int col = 0; col < c; col++) {
                System.out.print(mat[lin][col] + "\t");
            }
            System.out.println("");
        }

        int linha, coluna;

        for (linha = 0; linha < l; linha++) {
            for (coluna = 0; coluna < c; coluna++) {
                if (linha == coluna) {
                    ident[linha][coluna] = 1;
                } else {
                    ident[linha][coluna] = 0;
                }
            }
        }

        for (coluna = 0; coluna < l; coluna++) {
            pivo = mat[coluna][coluna];
            for (k = 0; k < c; k++) {
                mat[coluna][k] = (mat[coluna][k]) / (pivo); 
                ident[coluna][k] = (ident[coluna][k]) / (pivo); 
            }

            for (linha = 0; linha < l; linha++) {
                if (linha != coluna) {
                    m = mat[linha][coluna];
                    for (k = 0; k < c; k++) {
                        mat[linha][k] = (mat[linha][k]) - (m * mat[coluna][k]); 
                        ident[linha][k] = (ident[linha][k]) - (m * ident[coluna][k]);
                    }
                }
            }
        }

        System.out.print("Matriz inversa: \n");
        for (int lin = 0; lin < l; lin++) {
            for (int col = 0; col < c; col++) {
                System.out.print(ident[lin][col] + "\t");
            }
            System.out.println("");
        }
    
	}
}