public class Pengiriman extends Resi {  
    static Tujuan tujuan = new Tujuan();
    public String nama_pengirim, 
                  alamat_pengirim, 
                  nama_penerima, 
                  alamat_penerima,
                  tlp_pengirim,
                  tlp_penerima,
                  isi_paket,
                  status,
                  kotaPenerima,
                  layanan,
                  estimasi;
    public int berat_barang, 
               panjang_barang, 
               lebar_barang, 
               tinggi_barang,  
               tarif,  
               harga,
               total;
    
    public Pengiriman (String kotaPenerima, String layanan, String namaPengirim, String alamatPengirim, String tlpPengirim, String namaPenerima, String alamatPenerima, String tlpPenerima, String isiPaket,
                       int berat, int panjang, int lebar, int tinggi, int harga) {  
        tujuan.kotaLayanan      = kotaPenerima;
        tujuan.tipeLayanan      = layanan;
        tujuan.pilihLayanan(kotaPenerima, layanan);
        nama_pengirim           = namaPengirim;  
        alamat_pengirim         = alamatPengirim;
        tlp_pengirim            = tlpPengirim;
        nama_penerima           = namaPenerima;  
        alamat_penerima         = alamatPenerima;
        tlp_penerima            = tlpPenerima;
        isi_paket               = isiPaket;
        berat_barang            = berat;  
        panjang_barang          = panjang;  
        lebar_barang            = lebar;  
        tinggi_barang           = tinggi;  
        tujuan.hargaPengiriman  = harga;
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
    public String getNama_pengirim() {  
        return nama_pengirim;  
    }
    public String getAlamat_pengirim() {  
        return alamat_pengirim;  
    }
    public String getTelepon_pengirim() {  
        return tlp_pengirim;  
    }
    public String getNama_penerima() {  
        return nama_penerima;  
    }
    public String getAlamat_penerima() {  
        return alamat_penerima;  
    }
    public String getTelepon_penerima() {  
        return tlp_penerima;  
    }
    public String getIsi_paket() {  
        return isi_paket;  
    }  
    public String getStatus() {  
        status = "Dikirim";  
        return status;  
    }  
    public int getHarga() {  
        return tujuan.hargaPengiriman;  
    }
    
    public void rumus(){  
        tarif = (berat_barang * 10000) + (panjang_barang * lebar_barang * tinggi_barang * 1000);
        total = tarif + getHarga();
    }  
}