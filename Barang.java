public class Barang {  
    Tujuan tujuan = new Tujuan();
    public String kotaLayanan,
                  tipeLayanan,
                  estimasi;
    public int berat_barang, 
               panjang_barang, 
               lebar_barang, 
               tinggi_barang, 
               hargaTarif,
               tarif,
               harga,
               total;
      
    public Barang (int berat, int panjang, int lebar, int tinggi, int hargaTarif){  
        berat_barang = berat;  
        panjang_barang = panjang;  
        lebar_barang = lebar;  
        tinggi_barang = tinggi;  
        tujuan.hargaPengiriman  = hargaTarif;
    }
    public Barang (String kota, String tipe){
        tujuan.kotaLayanan      = kota;
        tujuan.tipeLayanan      = tipe;
        tujuan.pilihLayanan(kota,tipe);
    }
        
    public String getKota() {  
        return tujuan.kotaLayanan;  
    }
    public String getTipe() {  
        return tujuan.tipeLayanan;  
    }
    public String getEstimasi() {  
        return tujuan.estimasi;  
    }
    public int getHarga() { 
        return tujuan.hargaPengiriman;  
    }
}