/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116568.latihan.pkg32daftarfilm;

/*
 * @author
 * NAMA 	: Muh.Fairuz Hadi Day
 * KELAS	: PBO6
 * NIM		: 10116568
 * Description : Program DAFTAR FILM
 */
public class PBO610116568Latihan32DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Film film1 = new Film("Venom", "Action, Horor, scifi", 8.5, 120);
        film1.nowPlaying();

        Film film2 = new Film("Small Foot", "Animation", 9, 96);
        film2.nowPlaying();
        
        Film film3 = new Film("Crazy Poor Asia", "Comedy", 7.8, 119);
        film3.nowPlaying();

        Film film4 = new Film("Asih", "Horor", 6.0, 100);
        film4.nowPlaying();
        
    }
    
}
