/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

/**
 *
 * @author Esti Restia N
 */
public class perkalianmatrix2x3dan3x2 {
    public static void main(String[] args){
        int[][] a = new int[][]{
            {4,2,6},
            {5,1,7}
        };
        
        int[][] b = new int[][]{
            {4,6},
            {8,2},
            {9,5}
        };
        
        System.out.println("Cetak Matrix A :");
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                System.out.print(a[i][j]+ " ");
            }
            System.out.println(" ");
        }
        System.out.println("Cetak Matrix B :");
        for(int i=0; i<b.length; i++){
            for(int j=0; j<b[0].length; j++){
                System.out.print(b[i][j]+ " ");
            }
            System.out.println(" ");
        }
    if(a[0].length == b.length){
        int[][] c = new int[a.length][b[0].length];
        System.out.println("Hasil Perkalian Matrix A * Matrix B");
        for(int i=0; i<a.length; i++){
        for(int j=0; j<b[0].length; j++){
        for(int k=0; k<a[0].length; k++){
            c[i][j] += a[i][k] * b[k][j];
        }
        }
        }
        for(int[] C : c){
            for(int i : C){
                System.out.print(i+ " ");
            }
            System.out.println(" ");
        }
    }
    else {
        System.out.println("Ukuran Kolom A Tidak Sama Dengan Baris B");
    }
        System.out.println("Esti Restia Ningrum");
    }
}