package Transpose_Matrix;
import java.util.Scanner;
public class TransposeMatrix {
    public static void main (String[] args) {
        int[][] matrix = new int[2][3];     // 2x3 matris tanımlanıyor
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;

        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;


        System.out.println("MATRIX= ");     // Matrisi ekrana yazdırma komutu
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print( matrix[i][j] + " ");     // Aynı satırda yazsın
            }
            System.out.println(); // Satır bitince alt satıra geç
        }


        System.out.println("Transpoze: ");    // Transpozunu ekrana yazdırma komutu
        for (int i = 0; i < matrix[0].length; i++) {        // sütun sayısı kadar döngü
            for (int j = 0; j < matrix.length; j++) {       // satır sayısı kadar döngü
                System.out.print(matrix[j][i] + "    ");    // Aynı satırda yazsın
            }
            System.out.println(); // Satır bitince alt satıra geç
        }
    }
}
