package Proses07341;
import Entity07341.PanitiaEntity07341;

public class PanitiaProses07341 implements Interface07341 {
    private static PanitiaEntity07341[] panitia = new PanitiaEntity07341[100];
    private static int jumPanitia07341 = 0;
    /**
     * method getPanitia() fungsinya hampir sama seperti method accessor
     * pada umumnya . yang digunakan untuk mengakses variabel yang tidak dapat diakses di luar kelas
     * @return panitia yang berbentuk Array
     */
    public PanitiaEntity07341[] getPanitia(){
        return panitia;
    }
    /**
     * method insert() berfungsi untuk memasukkan ata ke dalam class Entity07341
     * sesuai dengan parameter yang telah ditantukan 
     * @param passPanitia menampung data Password Panitia
     * @param namaPanitia menampung data Nama Panitia
     * @param noTelpPanitia menampung data noTelp Panitia
     * @param AlamatPanitia menampung data Alamat Panitia
     * keempat parameter tersebut nantinya akan dimasukkan ke dalam PanitiaEntity07341
     */
    public void insert(String[] passPanitia, String[] namaPanitia, String[] noTelpPanitia,String[] AlamatPanitia){
        for (int i = 0; i <namaPanitia.length;i++){
            panitia[i] = new PanitiaEntity07341(passPanitia[i],namaPanitia[i],noTelpPanitia[i],AlamatPanitia[i]);
            jumPanitia07341++;
        }
    }
    /**
     * method view() berfungsi untuk menampilkan data peserta sesuai dengan data yang telah tersimpan di dalam
     * PanitiaEntity07341
     */
    @Override
    public void view(){
        for (int i =0; i<jumPanitia07341; i++){
            System.out.println("==========================");
            System.out.println("Nama :" + panitia[i].getNama() + "\n no.Telp :" + panitia[i].getNoTelp() + "\n Alamat :" + panitia[i].getAlamat());
            System.out.println("==========================");
        }
    }
    /**
     * method cekData() berfungsi untuk melakukan pencocokan data dari inputan dan dari yang sudah tersimpan dalam sistem
     * @param user menampung data nama user / username
     * @param password menampung data password user
     * @return loop yang bernilai INT yang nantinya digunakan untuk menentukan kondisi
     */
    public int cekData(String user, String password){
        int loop =0;
        for (PanitiaEntity07341 prosesPanitia : panitia){
            if (prosesPanitia.getNama().equals(user) && prosesPanitia.getPassword().equals(password)){
                break;
            }else {
                loop++;
            }
        }
    return loop;
    }
}
