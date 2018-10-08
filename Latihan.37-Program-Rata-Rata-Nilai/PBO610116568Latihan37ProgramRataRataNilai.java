/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116568.latihan.pkg37programrata.ratanilai;

import java.util.Scanner;

/*
 * @author
 * NAMA 	: Muh.Fairuz Hadi Day
 * KELAS	: PBO6
 * NIM		: 10116568
 * Description : Program RATA RATA NILAI
 */

public class PBO610116568Latihan37ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan banyak mahasiswa : ");    
        int jumlah = scanner.nextInt();

        Penilaian penilaian = new Penilaian(jumlah);

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Nilai Mahasiswa ke-"+ (i+1) + " : ");    
            penilaian.setNilai(i, scanner.nextInt());
        }

        penilaian.averagePenilaian();
    }
    
}
