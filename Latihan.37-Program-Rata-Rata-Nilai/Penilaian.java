/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116568.latihan.pkg37programrata.ratanilai;

/*
 * @author
 * NAMA 	: Muh.Fairuz Hadi Day
 * KELAS	: PBO6
 * NIM		: 10116568
 * Description : Program RATA RATA NILAI
 */
class Penilaian {
     private final int[] nilai;


    public Penilaian(int banyakMahasiswa){
        nilai = new int[banyakMahasiswa];
    }

    public void setNilai(int index, int nilai){
        this.nilai[index] = nilai;
    }

    public void averagePenilaian(){
        System.out.println();
        System.out.println("Maka, Rata-rata Nilainya adalah " +averageValue());
    }


    private double averageValue(){
        int total = 0;
        for (int i : nilai) {
            total+=i;
        }

        return total/nilai.length;
    }
    
}
