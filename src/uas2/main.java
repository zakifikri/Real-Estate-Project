package uas2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String[] menu ={"No ", "Type ", "Beli ", "Sewa "};
        String[] jenisRumah={"A1", "A2", "A3"};
        int[] hargaRumah= {300000000, 400000000, 500000000};
        int[] hargaSewaR= {15000000, 30000000, 45000000};
        String[] jenisAprtmn={"B1", "B2", "B3"};
        int[] hargaAprtmn={600000000, 700000000, 800000000};
        int[] hargaSewaA= {50000000, 60000000, 70000000};
        
        
        
        System.out.println("===[REAL ESTATE PROGRAM]===");
        System.out.print(menu[0]);
        System.out.print(menu[1]);
        System.out.print(menu[2]);
        System.out.println("        "+menu[3]);
        for (int i = 0; i < 3; i++) {
            System.out.println(i+1+"   "+jenisRumah[i]+"  Rp"+hargaRumah[i]+"  Rp"+hargaSewaR[i]);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(i+4+"   "+jenisAprtmn[i]+"  Rp"+hargaAprtmn[i]+"  Rp"+hargaSewaA[i]);
        }
        
        ///////////[SATU]/////////////
        System.out.println("-------------------------");
        System.out.print("Lanjut pembelian? y/t = ");
        String lanjut = input.next();
        System.out.println("-------------------------");
        switch(lanjut){
            case "y":
                
                System.out.print("Nama          : ");
                String nama = input.next();
                System.out.print("no.tlp        : ");
                String nomer = input.next();
                System.out.print("Email         : ");
                String email = input.next();
                System.out.print("Umur          : ");
                int umur = input.nextInt();
                System.out.print("Pilih Properti: ");
                int properti = input.nextInt();
                System.out.println("Pemasaran     :\n"
                        + "\t\t1.Beli\n"
                        + "\t\t2.Sewa");
                System.out.print("Pilih         : ");
                int pemasaran = input.nextInt();
                System.out.println("Pembayaran    :\n"
                        + "\t\t1.Tunai\n"
                        + "\t\t2.Kredit");
                System.out.print("Pilih         : ");
                int pembayaran = input.nextInt();
                /////////[AKHIR CASE "Y"]///////////
                System.out.println("-------------------------");
                
                if (properti == 1 && pemasaran == 1 && pembayaran == 1) {
                    System.out.println("Type    : "+jenisRumah[0]);
                    System.out.println("Harga   : Rp"+hargaRumah[0]);
                    System.out.print("Uang    : Rp");
                    int uang = input.nextInt();
                    int kembali = uang-hargaRumah[0];
                    System.out.println("Kembali : Rp"+kembali);
                }
                
                
                
                
                
                
                
                
                
                
                
                break;
            case "t":
                System.out.println("Ok Good bye!");
                break;
            default:
                System.out.println("No Request!");
        }
        
        
        
        
        
        
        
    }
}
