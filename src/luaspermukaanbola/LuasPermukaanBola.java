/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luaspermukaanbola;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class LuasPermukaanBola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        double r, b;
        System.out.print("Masukkan nilai jari jari= ");
        r = scan.nextDouble();
        b = 4 * 3.14 * (r * r);
        System.out.println("Luas lingkaran = " + b);

    }

}
