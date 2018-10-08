/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116568.latihan.pkg35programtunjangan;

import java.util.Scanner;

/*
 * @author
 * NAMA 	: Muh.Fairuz Hadi Day
 * KELAS	: PBO6
 * NIM		: 10116568
 * Description : Program Tunjangan
 */
public class PBO610116568Latihan35ProgramTunjangan {

    public static String DEFAULT_POSITIF_ANSWER = "Menikah";
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Scanner scannerText = new Scanner(System.in);

        System.out.println("===== Program Tunjangan =====");
        System.out.print("Berapa Gaji Pokok anda perbulan?\t: ");
        double gaji = scanner.nextDouble();
        
        System.out.print("Status Anda? (Menikah/Belum)\t\t: ");
        String status = scannerText.nextLine();        

        Payslip payslip = new Payslip(gaji, status.equalsIgnoreCase(DEFAULT_POSITIF_ANSWER));
        payslip.calculateSalary();
    }
    
}
