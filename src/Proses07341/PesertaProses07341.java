package Proses07341;
import Entity07341.PesertaLombaEntity07341;
import Entity07341.PesertaTerdaftarEntity07341;
import Entity07341.LombaEntity07341;
import java.util.Scanner;

public class PesertaProses07341 implements Interface07341 {
    private static Scanner input = new Scanner(System.in);
    private static PesertaLombaEntity07341[] peserta07341 = new PesertaLombaEntity07341[100];
    private static PesertaTerdaftarEntity07341[] pesertaTerdaftar07341 = new PesertaTerdaftarEntity07341[100];
    public static int jumPeserta07341 = 0;
    /**
     * method getPeserta() dan getPesertaTerdaftar() fungsinya hampir sama seperti method Accessor 
     * pada umumnya . yang digunakan untuk mengakses variable yang tidak dapat diakses diluar kelas
     * @return panitia yang berbentuk Array.
     */
    public PesertaLombaEntity07341[] getPeserta(){
        return peserta07341;
    }
    public PesertaTerdaftarEntity07341[] getPesertaterdaftar(){
        return pesertaTerdaftar07341;
    }
    /**
     * method insert() berfungsi untuk memasukkan ata ke dalam class Entity07341
     * sesuai dengan parameter yang telah ditantukan 
     * @param nama07341 menampung data Nama Peserta Lomba
     * @param umur07341 menampung data Umur Peserta Lomba
     * @param Alamat07341 menampung data Alamat Peserta Lomba
     * @param noTelp07341 menampung data noTelp Peserta Lomba
     */
    public void insert(String nama07341 ,String umur07341 ,String Alamat07341 ,String noTelp07341){
        peserta07341[jumPeserta07341] = new PesertaLombaEntity07341 (umur07341 , nama07341 , noTelp07341 , Alamat07341);
    }
    /**
     * method insert() berfungsi untuk memasukkan ata ke dalam class Entity07341
     * sesuai dengan parameter yang telah ditantukan
     * juga merupakan bentuk overloading dari method insert() diatasnya
     * @param peserta07341 menampung satu baris data Array dari PesertaEntity07341
     * @param index07341 menampung data INT dari index
     * @param kodePeserta07341 menampung data dari Kode Peserta yang telah diberikan Panitia
     */
    public void insert(PesertaLombaEntity07341 peserta07341,int index07341, String kodePeserta07341){
        pesertaTerdaftar07341[jumPeserta07341] = new PesertaTerdaftarEntity07341(peserta07341,index07341,kodePeserta07341);
        jumPeserta07341 = jumPeserta07341 + 1;
    }
    /**
     * method view() berfungsi untuk menampilkan data Peserta sesuai dengan data yang telah
     * tersimpan di dalalm pesertaEntity07341
     */
    @Override
    public void view(){
        if (jumPeserta07341 == 0){
            System.out.println("Belum ada peserta Terdaftar");
        }else{
            for (int i = 0 ; i < jumPeserta07341; i++){
                System.out.println("=========================");
                System.out.println("Kode Peserta :" + pesertaTerdaftar07341[i].getKodePeserta());
                System.out.println("=========================");
                System.out.println("Nama :" + peserta07341[i].getNama() + "\n Umur" + peserta07341[i].getUmur() + "\n Alamat" + peserta07341[i].getAlamat() + "\n No.Telp" + peserta07341[i].getNoTelp() + "\n Lomba" + LombaEntity07341.lomba[pesertaTerdaftar07341[i].getIndex()]);
                System.out.println("=========================");
            }
        }
    }
    /**
     * method updata() berfungsi untuk memperbarui data peserta sesuai dengan kode Peserta yang dimasukkan
     */
    public void update(){
        System.out.println("Masukkan Kode Peserta yang mau di Edit :");
        String search07341 = input.next();
        int cari =0;
        do{
            if (cari == jumPeserta07341){
                System.err.println("Tidak ada data");
                break;
            }else if (pesertaTerdaftar07341[cari].getKodePeserta().equals(search07341)){
                int pilEdit;
                do{
                    System.out.println("Pilih data yang ingin diubah :");
                    System.out.println("1. Lihat Biodata");
                    System.out.println("2. Nama");
                    System.out.println("3. Alamat");
                    System.out.println("4. no.Telp");
                    System.out.println("5. Umur");
                    System.out.println("6. Lomba");
                    System.out.println("0. Exit");
                    pilEdit = input.nextInt();
                    input.nextLine();
                    if (pilEdit == 1){
                        System.out.println("======================");
                        System.out.println("Kode Peserta :" + pesertaTerdaftar07341[cari].getKodePeserta());
                        System.out.println("======================");
                        System.out.println("Nama :" + peserta07341[cari].getNama() + "\n Umur" + peserta07341[cari].getUmur() + "\n Alamat" + peserta07341[cari].getAlamat() + "\n No.Telp" + peserta07341[cari].getNoTelp() + "\n Lomba" + LombaEntity07341.lomba[pesertaTerdaftar07341[cari].getIndex()]);
                        System.out.println("======================");
                    }else if (pilEdit == 2){
                        System.out.println("Ubah Nama :");
                        String editNama = input.nextLine();
                        peserta07341[cari].setNama(editNama);
                    }else if (pilEdit == 3){
                        System.out.println("Ubah Alamat :");
                        String editAlamat = input.nextLine();
                        peserta07341[cari].setAlamat(editAlamat);
                    }else if (pilEdit == 4){
                        System.out.println("Ubah no.Telp :");
                        String editNoTelp = input.nextLine();
                        peserta07341[cari].setNoTelp(editNoTelp);                        
                    }else if (pilEdit == 5){
                        System.out.println("Ubah Umur :");
                        String editUmur = input.nextLine();
                        peserta07341[cari].setUmur(editUmur);
                    }else if (pilEdit == 6){
                        System.out.println("Pilih Lomba :");
                        for (int i = 0; i <LombaEntity07341.lomba.length; i++){
                            System.out.println(i + ". " + LombaEntity07341.lomba[i]);
                        }    
                            System.out.println("Pilih Lomba :");
                            int editLomba = input.nextInt();
                            pesertaTerdaftar07341[cari].setIndex(editLomba);
                        }
                    }while (pilEdit != 0);
                break;
            }else{
                cari = cari +1;
            }
        }while(true);
    }
    /**
     * method delete() berfungsi untuk menindah data data peserta sesuai dengan kode Peserta yang dimasukkan yang tersimpan di
     * dalam PesertaEntity07341 dan pesertaTerdaftarEntity07341
     * ke Array data selanjutnya sehingga tidak terbaca oleh program lalu mengurangi jumlah jumPeserta07341
     */
    public void delete(){
        System.out.print("Masukan Kode Peserta yang akan di Hapus :");
        String search07341 = input.next();
        input.nextLine();
        int cari = 0;
        do{
            if (cari == jumPeserta07341){
                System.err.println("Tidak ada Data !");
                break;
            }else if (pesertaTerdaftar07341[cari].getKodePeserta().equals(search07341)){
                if (cari == jumPeserta07341 - 1){
                    jumPeserta07341 = jumPeserta07341 - 1;
                }else {
                    for (int i = cari; i < jumPeserta07341; i++){
                        pesertaTerdaftar07341[i] = pesertaTerdaftar07341[i+1];
                        peserta07341[i] = peserta07341[i+1];
                    }
                    jumPeserta07341 = jumPeserta07341 - 1;
                    }
            break;
            }else {
                cari = cari + 1;
            }
        }while(true);
    }
}
