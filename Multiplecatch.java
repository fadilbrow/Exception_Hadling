/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author fadil
 */
public class Multiplecatch {
    public static void main(String[] args){
       System.out.println("\n********* MENGGUNAKAN MULTIPLE CATCH*********\n");
       try
       {
           int[] array = new int[9]; //deklarasi array berukuran9 buah elemen
           array[9] = 13; //penyebab exceptionSystem.out.println("Elemen array indeks ke 9 adalah"+array[9]);
           System.out.println("Pernyataan dalam blok try setelahbebas dari exception.");
       }
       catch(ArrayIndexOutOfBoundsException exc)
       {
           System.err.println("Anda mengakses array di luar indeks yang dideklarasikan.");
       }
       catch(NegativeArraySizeException exc)
       {
           System.err.println("Anda mendeklarasikan array dengan ukuran negatif.");
       }
       catch(Exception exc)
       {
           System.err.println("Anda melakukan pembagian bilangan oleh nol.");
       }
    }
} 

