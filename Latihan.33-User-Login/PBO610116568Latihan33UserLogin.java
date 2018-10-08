/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116568.latihan.pkg33userlogin;

import java.util.Scanner;

/*
 * @author
 * NAMA 	: Muh.Fairuz Hadi Day
 * KELAS	: PBO6
 * NIM		: 10116568
 * Description : Program USER LOGIN
 */
public class PBO610116568Latihan33UserLogin {

    private static String usName;
    private static String passWord;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Username\t: ");
        usName = scanner.nextLine();

        System.out.print("Masukan Password\t: ");
        passWord = scanner.nextLine();

        User user = new User();
        user.pengecekanLogin(usName, passWord);
    }
    
}
