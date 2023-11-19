import java.io.*; 
import java.util.*;
import javax.swing.JFileChooser;

public class Main {  
    static Scanner input1 = new Scanner(System.in);  
    static BufferedReader input2 = new BufferedReader(new InputStreamReader(System.in));  
    static Tarif trf = new Tarif(0,0,0,0,0);  
    static Pengiriman kirim;  
    static Tujuan tujuan = new Tujuan();
    static ArrayList<Pengiriman> data = new ArrayList<Pengiriman>();  
    public static void main(String[] args) throws IOException {  
        try {
            do {  
                menu();  
            } while (true);  
            
        } catch (java.lang.Exception e) {
            System.out.println("===============================================");  
            System.out.println("Error !!! Terjadi kesalahan ...");
            System.exit(0);  
        }
    }       
    private static void menu() throws IOException {  
        System.out.println("================================================");  
        System.out.println("               W E L C O M E   T O              ");  
        System.out.println("    F A S T   E X P R E S S   L O G I S T I C   ");  
        System.out.println("================================================");  
        System.out.println("Pilihan Menu :");  
        System.out.println(" 1. Cek Harga Paket");  
        System.out.println(" 2. Input Data Paket");  
        System.out.println(" 3. Status Paket");  
        System.out.println(" 4. Hapus Data Paket");  
        System.out.println(" 5. Cetak Resi");  
        System.out.println(" 6. Exit");  
        System.out.println("================================================");  
        System.out.print("Pilih : ");      
        int pilih = input1.nextInt();  
        System.out.println("================================================");
        switch (pilih) {  
            case 1:  
                System.out.println();
                System.out.println("================================================");
                System.out.println("                Cek  Harga  Paket                ");
                System.out.println("================================================");
                System.out.println(tujuan.listKota);
                System.out.print("Pilih kota tujuan       = ");
                String kota = input2.readLine();
                System.out.println(tujuan.listLayanan);
                System.out.print("Pilih tipe layanan      = ");
                String tipe = input2.readLine();
                tujuan.pilihLayanan(kota,tipe);
                Barang brg = new Barang (kota, tipe);
                System.out.println("================================================");  
                System.out.println("Kota Tujuan         = " + brg.getKota());
                System.out.println("Tipe Layanan        = " + brg.getTipe());
                System.out.println("Harga Pengiriman    = " + tujuan.getHarga());
                System.out.println("Estimasi Paket      = " + tujuan.getEstimasi());
                System.out.println("================================================");  
                System.out.print("BERAT (KG)    = ");
                int berat = input1.nextInt();
                System.out.println("DIMENSI PAKET (CM)");
                System.out.print("Panjang   = ");
                int panjang = input1.nextInt();
                System.out.print("Lebar     = ");
                int lebar = input1.nextInt();
                System.out.print("Tinggi    = ");
                int tinggi = input1.nextInt();
                int hargaTarif = tujuan.getHarga();
                trf = new Tarif(berat, panjang, lebar, tinggi, hargaTarif);
                trf.rumus();
                System.out.println("================================================");
                System.out.println("Harga Paket          = Rp. " + trf.tarif);
                System.out.println("Total Harga Paket    = Rp. " + trf.total);
                System.out.println("================================================");
                System.out.println();                
            break;
            case 2:
                System.out.println();
                System.out.println("================================================");
                System.out.println("               Input  Data  Paket               ");
                System.out.println("================================================");
                System.out.println(tujuan.listKota);
                System.out.print("Pilih kota tujuan       = ");
                String kotaPenerima = input2.readLine();
                System.out.println(tujuan.listLayanan);
                System.out.print("Pilih tipe layanan      = ");
                String layanan = input2.readLine();
                tujuan.pilihLayanan(kotaPenerima,layanan);
                System.out.println("================================================");
                System.out.print("Nama Pengirim      = ");
                String namaPengirim = input2.readLine();
                System.out.print("Alamat Pengirim    = ");
                String alamatPengirim = input2.readLine();
                System.out.print("Telepon Pengirim   = ");
                String tlpPengirim = input2.readLine();
                System.out.print("\nNama Penerima      = ");
                String namaPenerima = input2.readLine();
                System.out.print("Alamat Penerima    = ");
                String alamatPenerima = input2.readLine();
                System.out.print("Telepon Penerima   = ");
                String tlpPenerima = input2.readLine();
                System.out.println("================================================");
                System.out.print("Isi Paket          = ");
                String isiPaket = input2.readLine();
                System.out.print("BERAT (KG)         = ");
                berat = input1.nextInt();
                System.out.println("DIMENSI PAKET (CM)");
                System.out.print("Panjang    = ");
                panjang = input1.nextInt();
                System.out.print("Lebar      = ");
                lebar = input1.nextInt();
                System.out.print("Tinggi     = ");
                tinggi = input1.nextInt();
                int harga = tujuan.getHarga();
                data.add(kirim = new Pengiriman(kotaPenerima, layanan, namaPengirim, alamatPengirim, tlpPengirim, namaPenerima, alamatPenerima, tlpPenerima, isiPaket, berat, panjang, lebar, tinggi, harga));
                kirim.rumus();
                System.out.println("================================================");
                System.out.println("Harga Paket          = Rp. " + kirim.tarif);
                System.out.println("Biaya Pengiriman     = Rp. " + kirim.getHarga());
                System.out.println("                       -------------------------");
                System.out.println("Total Harga Paket    = Rp. " + kirim.total);
                System.out.println("================================================");
                System.out.println("Data Berhasil Tersimpan ...");
                System.out.println("================================================");
                System.out.println();
            break;  
            case 3:  
                System.out.println();  
                System.out.println("================================================");  
                System.out.println("                 Status   Paket                 ");  
                System.out.println("================================================");  
                int i = 0;
                for (Pengiriman o:data) {  
                    System.out.println("Data ke - "+(i+1));  
                    System.out.println("Tujuan Kota      = " + o.getKota());  
                    System.out.println("Tipe Layanan     = " + o.getTipe());  
                    System.out.println("Estimasi         = " + o.getEstimasi());  
                    System.out.println("\nNama Pengirim    = " + o.getNama_pengirim());  
                    System.out.println("Alamat Pengirim  = " + o.getAlamat_pengirim());  
                    System.out.println("Telepon Pengirim = " + o.getTelepon_pengirim());  
                    System.out.println("Nama Penerima    = " + o.getNama_penerima());  
                    System.out.println("Alamat Penerima  = " + o.getAlamat_penerima());  
                    System.out.println("Telepon Penerima = " + o.getTelepon_penerima());  
                    System.out.println("Isi Paket        = " + o.getIsi_paket());  
                    System.out.println("Status           = " + o.getStatus());  
                    System.out.println("\nHarga            = Rp. " + o.total);  
                    System.out.println("================================================");  
                    i++;  
                }  
                System.out.println();  
            break; 
            case 4:  
                System.out.println();  
                System.out.println("================================================");  
                System.out.println("               Hapus  Data  Paket               ");  
                System.out.println("================================================");  
                System.out.print("Hapus data paket ke : ");
                int hapus = input1.nextInt();
                
                data.remove(hapus-1);
                System.out.println("\nData Paket Berhasil dihapus ...");
                System.out.println("================================================");
                System.out.println();
            break; 
            case 5:  
                File dir = null;
                JFileChooser fc = new JFileChooser();
                fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int resp = fc.showSaveDialog(null);
                if (resp == JFileChooser.APPROVE_OPTION) {
                    dir = fc.getSelectedFile();
                }
                
                File file = new File(dir, "RESI.txt");

                if (!file.exists()) {
                    file.createNewFile();
                }

                FileWriter fw = new FileWriter(file.getAbsoluteFile());
                BufferedWriter bw = new BufferedWriter(fw);
                
                System.out.println();  
                System.out.println("================================================");  
                System.out.println("                  Cetak   Resi                  ");  
                System.out.println("================================================");  
                
                for (Pengiriman o:data) {  
                    System.out.println("================================================");  
                    System.out.println("Tanggal Pengiriman  = " + o.tanggalPengiriman);  
                    System.out.println("Nomor Resi          = " + o.nomorResi);  
                    System.out.println("Tujuan Kota         = " + o.getKota());  
                    System.out.println("Tipe Layanan        = " + o.getTipe());  
                    System.out.println("Estimasi            = " + o.getEstimasi());  
                    System.out.println("\nNama Pengirim       = " + o.getNama_pengirim());  
                    System.out.println("Alamat Pengirim     = " + o.getAlamat_pengirim());  
                    System.out.println("Telepon Pengirim    = " + o.getTelepon_pengirim());  
                    System.out.println("Nama Penerima       = " + o.getNama_penerima());  
                    System.out.println("Alamat Penerima     = " + o.getAlamat_penerima());  
                    System.out.println("Telepon Penerima    = " + o.getTelepon_penerima());  
                    System.out.println("Isi Paket           = " + o.getIsi_paket());  
                    System.out.println("Status              = " + o.getStatus());  
                    System.out.println("\nHarga               = Rp. " + o.total);  
                    System.out.println("================================================");  
                     
                    bw.append("================================================");  bw.newLine();
                    bw.append("                  RESI   PAKET                  ");  bw.newLine(); 
                    bw.append("================================================");  bw.newLine();
                    bw.append("Tanggal Pengiriman   = " + o.tanggalPengiriman);     bw.newLine();
                    bw.append("Nomor Resi           = " + o.nomorResi);             bw.newLine();
                    bw.append("Kota Tujuan          = " + o.getKota());             bw.newLine();
                    bw.append("Tipe Layanan         = " + o.getTipe());             bw.newLine();
                    bw.append("Estimasi             = " + o.getEstimasi());         bw.newLine();
                                                                                    bw.newLine();
                    bw.append("Nama Pengirim        = " + o.getNama_pengirim());    bw.newLine();
                    bw.append("Alamat Pengirim      = " + o.getAlamat_pengirim());  bw.newLine();
                    bw.append("Telepon Pengirim     = " + o.getTelepon_pengirim()); bw.newLine();
                    bw.append("Nama Penerima        = " + o.getNama_penerima());    bw.newLine();
                    bw.append("Alamat Penerima      = " + o.getAlamat_penerima());  bw.newLine();
                    bw.append("Telepon Penerima     = " + o.getTelepon_penerima()); bw.newLine();
                    bw.append("Isi Paket            = " + o.getIsi_paket());        bw.newLine();
                    bw.append("Status               = " + o.getStatus());           bw.newLine();
                                                                                    bw.newLine();
                    bw.append("Harga                = Rp. " + o.total);             bw.newLine();
                    bw.append("================================================");  bw.newLine();
                    
                }  
                
                bw.close();
                System.out.println("Resi Berhasil Dicetak ... ");
                System.out.println("================================================");  
                System.out.println();  
            break; 
            case 6:  
                System.out.println("Terima Kasih Sudah Menggunakan Jasa Kami...");  
                System.out.println("================================================");  
                System.exit(0);  
            break; 
            default:  
                System.out.println("Pilihan Yang Anda Masukkan Salah !!!");  
                System.out.println("================================================");  
                System.out.println();
            break;  
        }
    }  
} 