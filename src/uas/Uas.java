package uas;
import java.util.Scanner;

public class Uas {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        //Array data
//        String[]Properti = {"Rumah ", "Apartemen "};
//        String[] jenis = {"Beli", "Sewa"};
        
        String[] menu ={"No ", "Type ", "Harga "};
        String[] jenisRumah={"A1", "A2", "A3"};
        int[] hargaRumah= {300000000, 400000000, 500000000};
        int[] hargaSewaR= {15000000, 30000000, 45000000};
        String[] jenisAprtmn={"B1", "B2", "B3"};
        int[] hargaAprtmn={600000000, 700000000, 800000000};
        int[] hargaSewaA= {50000000, 60000000, 70000000};
        
        
        String cek;
        do{
        
        //logic 1
        System.out.println("======|Real Estate Program|======");
        System.out.println("[RUMAH-BELI]");
        System.out.print(menu[0]);
        System.out.print(menu[1]);
        System.out.println(menu[2]);
        for (int i = 0; i < jenisRumah.length; i++) {
            System.out.println(i+1+"   "+jenisRumah[i]+"  Rp"+hargaRumah[i]);
            
        }
        
        System.out.println("[RUMAH-SEWA]");
        System.out.print(menu[0]);
        System.out.print(menu[1]);
        System.out.println(menu[2]);
        for (int i = 0; i < jenisRumah.length; i++) {
            System.out.println(i+1+"   "+jenisRumah[i]+"  Rp"+hargaSewaR[i]);
            
        }
        
        System.out.println("[APARTEMEN-BELI]");
        System.out.print(menu[0]);
        System.out.print(menu[1]);
        System.out.println(menu[2]);
        for (int i = 0; i < jenisAprtmn.length; i++) {
            System.out.println(i+1+"   "+jenisAprtmn[i]+"  Rp"+hargaAprtmn[i]);
            
        }
        
        System.out.println("[APARTEMEN-SEWA]");
        System.out.print(menu[0]);
        System.out.print(menu[1]);
        System.out.println(menu[2]);
        for (int i = 0; i < jenisAprtmn.length; i++) {
            System.out.println(i+1+"   "+jenisAprtmn[i]+"  Rp"+hargaSewaA[i]);
            
        }
            System.out.println("Tampilkan lagi? y/t");
            cek = input.next();
        }while(cek.equalsIgnoreCase("y"));
        
        
        ////////////////////////////////////////////////////////////////////////
        
        //Part 2
        System.out.println("==================");
        System.out.println("Lanjut Pembelian? y/t");
        String lanjut = input.next();
        switch(lanjut){
            case "y":
                System.out.print("Masukan nama: ");
                String nama = input.next();
                System.out.print("Masukan No. Tlp: ");
                String id = input.next();
                System.out.print("Masukan Email: ");
                String email = input.next();
                System.out.print("Masukan Umur: ");
                int umur = input.nextInt();
                
                //////////////////[SATU]///////////////////
                System.out.println("Jenis Properti yang ingin di ambil:\n"
                        + "\t1.Rumah\n"
                        + "\t2.Apartemen");
                System.out.print("Pilih: ");
                int properti = input.nextInt();
                
                if(properti == 1){
                     System.out.println("Jenis Pemasaran:\n"
                        + "\t1.Beli\n"
                        + "\t2.Sewa");
                     System.out.print("Pilih: ");
                     int pemasaran = input.nextInt();
                     if(pemasaran == 1){
                         for (int i = 0; i < jenisRumah.length; i++) {
                            System.out.println(i+1+". "+jenisRumah[i]+" Rp"+hargaRumah[i]);
                         }
                         System.out.println("Input tipe Rumah: ");
                         String tipe = input.nextLine();
                         System.out.println(tipe);
                     }else if(pemasaran == 2){
                     System.out.println("Jenis Pembayaran:\n"
                        + "\t1.Tunai\n"
                        + "\t2.Kredit");
                     System.out.println("Pilih: ");
//                     String bayar = input.next();
                    }
                }else{
                    System.out.println("==================");
                }
                
                
                ////////////////////////////////////////////////////////////////
//                part 3
                
                
                         
                
                
                
                
                
                
                
                
                
                
                
                 
                break;
            default:
                System.out.println("Good bye!");
        }
        
        
        
        
        
        
        
    }
}