/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117091.latihan17.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 * Nama         : Dida Handian
 * Kelas        : IF-3 
 * Nim          : 10117091 
 * Deskripsi    : Program ini dapat menghitung tunjangan dari gaji pokok dan
 * dan menghasilkan total gaji
 */
public class PBO310117091Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                String status;
        double Tunjangan, GajiPokok, TotalGaji;

        Scanner scanner = new Scanner (System.in);

        System.out.println("===========Program Tunjangan============");
        System.out.print("Berapa gaji pokok anda perbulan?\t : Rp. " );
        GajiPokok = scanner.nextInt();
        System.out.print("Status Anda? (Menikah/Belum)\t\t : " );
        
        status = scanner.next();
        
        if ("Menikah".equals(status)) { Tunjangan = 0.35 * GajiPokok;
            TotalGaji = GajiPokok + Tunjangan;
        } else { Tunjangan = 0 * GajiPokok;
            TotalGaji = GajiPokok + Tunjangan;
            
        } 
        
        System.out.println("===========Hasil Perhitungan Gaji Anda==========");
        System.out.println("Gaji pokok\t : Rp." + GajiPokok );
        System.out.println("Tunjangan\t : Rp." + Tunjangan );
        System.out.println("Total Gaji\t : Rp." + TotalGaji );
    }
    
}
