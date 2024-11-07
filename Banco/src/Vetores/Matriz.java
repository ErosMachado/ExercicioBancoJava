package Vetores;

public class Matriz {

    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        lerMatriz(matriz);
        imprimirMatriz(matriz);
    }

    public static void lerMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 2 * (i + j);
            }
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
