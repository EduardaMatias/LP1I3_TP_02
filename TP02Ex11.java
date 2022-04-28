import java.util.Scanner;

public class TP02Ex11 {

    public static void main(String args[]){

       /**
         * nomes: Eduarda Vitória Cunha Matias, Stefany Tam Pereira Mendes 11.
         * Entrar com uma matriz de ordem MxM, onde a ordem também será
         * escolhida pelo usuário, sendo que no máximo será de ordem 10 e
         * quadrática. Após a digitação dos elementos, calcular e exibir
         * determinante da matriz.
         */
        Scanner sc = new Scanner(System.in);
        int qtd;
        System.out.println("Digite a ordem: ");
        qtd = sc.nextInt();
        double det = 0;
        double diagPrin1, diagPrin2, diagPrin3, diagSec1, diagSec2, diagSec3;
        double mat[][] = new double[qtd][qtd];
        for (int i = 0; i < mat.length; i++) {
            for (int c = 0; c < mat[i].length; c++) {
                System.out.printf("Informe %do valor da %da linha : ", c + 1, i + 1);
                mat[i][c] = sc.nextDouble();
            }
        }
        // Diagonais principais
        diagPrin1 = mat[0][0] * mat[1][1] * mat[2][2];
        diagPrin2 = mat[0][1] * mat[1][2] * mat[2][0];
        diagPrin3 = mat[0][2] * mat[1][0] * mat[2][1];
        // Diagonais Secundárias
        diagSec1 = mat[2][0] * mat[1][1] * mat[0][2];
        diagSec2 = mat[2][1] * mat[1][2] * mat[0][0];
        diagSec3 = mat[2][2] * mat[1][0] * mat[0][1];
        // Determinante
        det = -(diagSec1 + diagSec2 + diagSec3) + (diagPrin1 + diagPrin2 + diagPrin3);
        System.out.println("O determinante da matriz e: " + det);
        sc.close();

	}
}