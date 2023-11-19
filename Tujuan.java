import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Tujuan {
    static Scanner input1 = new Scanner(System.in);  
    static BufferedReader input2 = new BufferedReader(new InputStreamReader(System.in));  
    public String kotaLayanan,
                  tipeLayanan,
                  estimasi;
    public int hargaPengiriman;
    public ArrayList<String> listKota = new ArrayList<String>();
    public ArrayList<String> listLayanan = new ArrayList<String>();
    
    public Tujuan(){
        listKota.add("Jakarta");
        listKota.add("Yogyakarta");
        listKota.add("Surabaya");
        
        listLayanan.add("Oke");
        listLayanan.add("Regular");
        listLayanan.add("Yes");   
        
        String listKota     = kotaLayanan; 
        String listLayanan  = tipeLayanan;
    }
    
    public void pilihLayanan(String kota, String tipe){        
        if(kota.equalsIgnoreCase("Jakarta")){
            if(tipe.equalsIgnoreCase("Yes")){
                hargaPengiriman = 25000;
                estimasi = "1 Hari";
            } else if(tipe.equalsIgnoreCase("Regular")){
                hargaPengiriman = 15000;
                estimasi = "2 - 5 Hari";
            } else if(tipe.equalsIgnoreCase("Oke")){
                hargaPengiriman = 10000;
                estimasi = "5 - 7 Hari";
            }
        }
        else if(kota.equalsIgnoreCase("Yogyakarta")){
            if(tipe.equalsIgnoreCase("Yes")){
                hargaPengiriman = 35000;
                estimasi = "1 Hari";
            } else if(tipe.equalsIgnoreCase("Regular")){
                hargaPengiriman = 25000;
                estimasi = "2 - 5 Hari";
            } else if(tipe.equalsIgnoreCase("Oke")){
                hargaPengiriman = 20000;
                estimasi = "5 - 7 Hari";
            }
        }
        else if(kota.equalsIgnoreCase("Surabaya")){
            if(tipe.equalsIgnoreCase("Yes")){
                hargaPengiriman = 45000;
                estimasi = "1 Hari";
            } else if(tipe.equalsIgnoreCase("Regular")){
                hargaPengiriman = 35000;
                estimasi = "2 - 5 Hari";
            } else if(tipe.equalsIgnoreCase("Oke")){
                hargaPengiriman = 30000;
                estimasi = "5 - 7 Hari";
            }
        }
    }
    
    public String getKotaLayanan() {  
        return kotaLayanan;  
    }
    public String getTipeLayanan() {  
        return tipeLayanan;  
    }
    public String getEstimasi() {  
        return estimasi;  
    }
    public int getHarga() {  
        return hargaPengiriman;  
    }
}
