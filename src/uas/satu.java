package uas;
import java.util.Scanner;
public class satu {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String[] jenisRumah={"A1", "A2", "A3"};
        int[] hargaRumah= {300000000, 400000000, 500000000};
        int[] hargaSewaR= {15000000, 30000000, 45000000};
        String[] menu ={"No ", "Type ", "Harga "};
        
        
        
        System.out.println("Jenis Properti:\n"
                        + "\t1.Rumah\n"
                        + "\t2.Apartemen");
                System.out.print("Pilih: ");
                int properti = input.nextInt();
                
                //////[RUMAH]///////
                if(properti == 1){
                     System.out.println("Jenis Pemasaran:\n"
                        + "\t1.Beli\n"
                        + "\t2.Sewa");
                     System.out.print("Pilih: ");
                     int pemasaran = input.nextInt();
                     ////[BELI]/////
                     System.out.println("Jenis Pembayaran:\n"
                             + "\t1.Tunai\n"
                             + "\t2.Kredit");
                     int bayar=input.nextInt();
                     if (bayar == 1) {
                         System.out.println("");
                    }
                     
                     
                     
                     
                     
                }else{
                    
                System.out.println("=========APARTEMEN=========");
                }
    }
}
