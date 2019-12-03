package uas;

public class menu {
    public static void main(String[] args) {
        //Deklarasi Array// 
        String[] menu ={"No ", "Type ", "Harga "};
        String[] jenisRumah={"A1", "A2", "A3"};
        int[] hargaRumah= {300000000, 400000000, 500000000};
        int[] hargaSewaR= {15000000, 30000000, 45000000};
        String[] jenisAprtmn={"B1", "B2", "B3"};
        int[] hargaAprtmn={600000000, 700000000, 800000000};
        int[] hargaSewaA= {50000000, 60000000, 70000000};
        
        
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
        
        
        
        
        
        
        
    }
}
