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
class Film {
    public String filmName;
    public String filmGenre;
    public double filmRating;
    public int filmDuration;


    public Film(String filmName, String filmGenre, double filmRating, int filmDuration){
        this.filmName = filmName;
        this.filmGenre = filmGenre;
        this.filmRating = filmRating;
        this.filmDuration = filmDuration;
    }

    public void nowPlaying(){
        System.out.println("Judul Film : ".concat(filmName));
        System.out.println("Genre Film : ".concat(filmGenre));
        System.out.println("Rating Film : ".concat(String.valueOf(filmRating)));
        System.out.println("Duration Film : ".concat(String.valueOf(filmDuration).concat(" Menit")));
        System.out.println();
    }

    
}
