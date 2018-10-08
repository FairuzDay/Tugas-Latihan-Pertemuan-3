/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116568.latihan.pkg31perkelananmahasiswa;

/*
 * @author
 * NAMA 	: Muh.Fairuz Hadi Day
 * KELAS	: PBO6
 * NIM		: 10116568
 * Description : Program PERKENALAN MAHASISWA
 */
public class PBO610116568Latihan31PerkelananMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Mahasiswa mhs1 = new Mahasiswa("10116568", "Muh.Fairuz Hadi Day");
        mhs1.perkenalkanDiri();

        Mahasiswa mhs2 = new Mahasiswa("10110270", "Indra Tiola");
        mhs2.perkenalkanDiri();
        
        Mahasiswa mhs3 = new Mahasiswa("10110271", "Robi Tanzil Ganefi");
        mhs3.perkenalkanDiri();

        Mahasiswa mhs4 = new Mahasiswa("10110269", "Muhammad Nur Awaludin");
        mhs4.perkenalkanDiri(); 
    }
    
}
