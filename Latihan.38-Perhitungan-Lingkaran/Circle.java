/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116568.latihan.pkg38perhitunganlingkaran;

/*
 * @author
 * NAMA 	: Muh.Fairuz Hadi Day
 * KELAS	: PBO6
 * NIM		: 10116568
 * Description : Program Lingkaran
 */
class Circle {
    public static final double PHI = 3.14159;

    private final int diameter;

    public Circle(int diameter){
        this.diameter = diameter;
    }

    public double getJariJari(){
        return diameter/2;
    }

    public double getKelilingLingkaran(){
        return PHI * diameter;
    }

    public double getLuasLingkaran(){
        return PHI * (getJariJari() * getJariJari());
    }


    public void printResult(){
        System.out.println("\n=========== Hasil Perhitungan Lingkaran =============");
        System.out.println("Jari jari Lingkaran\t: ".concat(String.valueOf(getJariJari())));
        System.out.printf("Luas Lingkaran\t\t: %.2f\n", getLuasLingkaran());        
        System.out.printf("Keliling Lingkaran\t: %.2f\n", getKelilingLingkaran());
    }
}
