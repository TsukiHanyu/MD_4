package PendaftaranLombaLanjutan07341;
import Proses07341.*;
import Entity07341.LombaEntity07341;
import java.util.Scanner;

public class PendaftaranLombaLanjutan07341 {
    private static Scanner input = new Scanner(System.in);
    private static PanitiaProses07341 prosesPanitia = new PanitiaProses07341();
    private static PesertaProses07341 prosesPeserta = new PesertaProses07341();    
    private static int pilLomba07341;
    private static int cekPanitia07341;
    
    public static void main (String[] args){
        dataPanitia07341();
        int pil07341;
        
        do {
            System.out.println("Jumlah Peserta :" + PesertaProses07341.jumPeserta07341);
            System.out.println("1.Login Panitia");
            System.out.println("2.Lihat Peserta Terdaftar");
            System.out.println("3.Biodata Panitia");
            pil07341 = input.nextInt();
            input.nextLine();
            switch (pil07341){
                case 1 :
                    loginPanitia();
                    break;
                case 2 :
                    prosesPeserta.view();
                    break;
                case 3 :
                    prosesPanitia.view();
                    break;
            }
        }while (pil07341 != 0);
    }
    /**
     * method dataPanitia berfungsi untuk memasukkan data data Panitia ke PenitiaEntity07341
     * @return mengembalikan nilai dari total jumlah data yang telah dimasukkan dalam panitiaEntity07341
     */
    static void dataPanitia07341() {
        String namaPanitia[] = {"Agam","Adit","Dian","Aji","Rakha"};
        String passPanitia[] = {"01","02","03","04","05"};
        String noTelpPanitia[] = {"081","082","083","084","085","086","087"};
        String AlamatPanitia[] = {"jl.","jl.","jl.","jl.","jl."};
        prosesPanitia.insert(passPanitia, namaPanitia, noTelpPanitia, AlamatPanitia);
    }
    /**
     * method loginPanitia ini berfungsi menyimpan input untuk nama dan password yang nantinya akan di cek
     * setelah itu menampilkan pilihan yang dapat dilakukan oleh panitia
     */
    static void loginPanitia(){
        System.out.println("Nama :");
        String nama07341 = input.next();
        System.out.println("Password :");
        String password07341 = input.next();
        cekPanitia07341 = prosesPanitia.cekData(nama07341,password07341);
        System.out.println("Selamat Datang" + prosesPanitia.getPanitia()[cekPanitia07341].getNama());
        int pil07341;
        do{
            System.out.println("Jumlah Peserta :" + PesertaProses07341.jumPeserta07341);
            System.out.println("1. Daftarkan Peserta");
            System.out.println("2. Ubah Data Peserta");
            System.out.println("3. Liat Peserta Terdaftar");
            System.out.println("4. Hapus Peserta");
            System.out.println("0. Log out");
            pil07341 = input.nextInt();
            input.nextLine();
            switch (pil07341){
                case 1 :
                    insertPeserta();
                    break;
                case 2 :
                    prosesPeserta.update();
                    break;
                case 3 :
                    prosesPeserta.view();
                    break;
                case 4 :
                    prosesPeserta.delete();
                    break;
            }
        }while (pil07341 != 0 );
    }
    /**
     * method insertPeserta berfungsi untuk memasukkan data ke dalam pesertaEntity07341 sesuai dengan inputan 
     * yang dimasukkan oleh user
     */
    static void insertPeserta(){
        System.out.println("Input Nama :");
        String nama07341 = input.nextLine();
        System.out.println("Input Umur :");
        String umur07341 = input.nextLine();
        System.out.println("Input Alamat :");
        String alamat07341 = input.nextLine();
        System.out.println("Input No.Telp :");
        String noTelp07341 = input.nextLine();
        
        prosesPeserta.insert(nama07341,umur07341,alamat07341,noTelp07341);
        insertLomba();
    }
    /**
     * method insertLomba berfungsi untuk memasukkan data ke dalam pesertaTerdaftarEntity07341 
     * dan menambah indikator jumPeserta07341 setelah mendapatkan inputan dari user berupan pilihan Lomba
     */
    static void insertLomba(){
        System.out.println("Lomba :");
        for (int i =0 ; i < LombaEntity07341.lomba.length ; i++){
                System.out.println(i + ". " + LombaEntity07341.lomba[i]);
        }
            System.out.println("Pilih Lomba :");
            pilLomba07341 = input.nextInt();
            System.out.println("Input Kode Peserta");
            String kodePeserta07341 = input.next();
            prosesPeserta.insert(prosesPeserta.getPeserta()[prosesPeserta.jumPeserta07341],pilLomba07341,kodePeserta07341);
    }
}