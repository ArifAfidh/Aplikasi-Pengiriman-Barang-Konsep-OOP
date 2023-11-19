public class Tarif extends Barang {  
    public Tarif(int berat, int panjang, int lebar, int tinggi, int hargaTarif) {  
        super(berat, panjang, lebar, tinggi, hargaTarif);      
    }  
    
    public void rumus(){  
        tarif = (super.berat_barang * 10000) + (super.panjang_barang * super.lebar_barang * super.tinggi_barang * 1000);  
        total = tarif + getHarga();
    }  
}