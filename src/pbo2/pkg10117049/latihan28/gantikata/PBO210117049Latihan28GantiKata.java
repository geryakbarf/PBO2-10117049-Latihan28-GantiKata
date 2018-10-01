/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117049.latihan28.gantikata;

import java.util.Scanner;

/**
 *
 * @author Gery Akbar Fauzi
 * Nama : Gery Akbar Fauzi 
 * Kelas : PBO2 
 * Nim : 10117049
 * Deskripsi Program : Program ini berisi program untuk mengubah kata
 * tertentu disuatu kalimat
 */
public class PBO210117049Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kata1;
        String kata2;
        String kata3;

        Scanner scan = new Scanner(System.in);

        System.out.println("===Program Mengganti Kalimat===");
        System.out.println("");
        System.out.print("Masukkan Kalimat : ");
        kata1 = scan.nextLine();
        System.out.print("Ganti Kata : ");
        kata2 = scan.next();
        System.out.print("Menjadi Kata : ");
        kata3 = scan.next();

        //Proses Penggantian kata
        System.out.println("");
        System.out.println("===HAsil Formatting===");
        System.out.println("Kalimat awal : " + kata1);
        String kataBaru = kata1.replace(kata2, kata3);
        System.out.println("Kalimat Baru : " + kataBaru);
    }

}
