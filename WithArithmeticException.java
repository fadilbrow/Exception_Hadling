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
public class WithArithmeticException{
    public static void main(String[] args)
    {
    System.out.println("\n********* PROGRAM DENGAN EXCEPTIONHANDLING *********\n");
    int hasil = 9/0; //penyebab exception
    System.out.println("Hasil pembagian = "+hasil);
    System.out.println("Pernyataan dalam blok try setelahbebas dari exception.");
    }
}


