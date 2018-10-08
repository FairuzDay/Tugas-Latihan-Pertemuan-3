/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116568.latihan.pkg34kalkulator;

import java.util.Scanner;

/*
 * @author
 * NAMA 	: Muh.Fairuz Hadi Day
 * KELAS	: PBO6
 * NIM		: 10116568
 * Description : Program KALKULATOR
 */
public class PBO610116568Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Aplikasi Kalkulator Bilangan =====");
        System.out.print("Masukan Angka ke-1\t: ");
        int value1 = scanner.nextInt();
        System.out.print("Masukan Angka ke-2\t: ");
        int value2 = scanner.nextInt();
        System.out.println();

        Kalkulator kal = new Kalkulator(value1, value2);
        kal.tambahBilangan();
        kal.kurangBilangan();
        kal.kaliBilangan();
        kal.bagiBilangan();
        kal.sisaBilangan();
    }
    
}
