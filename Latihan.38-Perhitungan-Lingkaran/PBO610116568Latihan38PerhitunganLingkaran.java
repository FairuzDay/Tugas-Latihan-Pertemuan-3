/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116568.latihan.pkg38perhitunganlingkaran;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * @author
 * NAMA 	: Muh.Fairuz Hadi Day
 * KELAS	: PBO6
 * NIM		: 10116568
 * Description : Program Lingkaran
 */
public class PBO610116568Latihan38PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        int diameter = 0;

        System.out.println("\n=============== Perhitungan Lingkaran ===============");

        do {
            try {                
                System.out.print("\nMasukan Nilai diameter Lingkaran : ");
                diameter = scanner.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Nilai Diameter tidak sesuai\n");                                          
                scanner = new Scanner(System.in);
            }      
        } while (!valid);


        Circle cirlce = new Circle(diameter);
        cirlce.printResult();
    }
    
}
