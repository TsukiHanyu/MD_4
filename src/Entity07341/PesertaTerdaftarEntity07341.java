package Entity07341;

public class PesertaTerdaftarEntity07341 {
    private PesertaLombaEntity07341 peserta07341;
    private int index07341;
    private String kodePeserta07341;
    
    public PesertaTerdaftarEntity07341(PesertaLombaEntity07341 peserta07341, int index07341,String kodePeserta07341){
        this.peserta07341 = peserta07341;
        this.index07341 = index07341;
        this.kodePeserta07341 = kodePeserta07341;
    }
    /*
     * Fuction dibawah ini merupakan getter dan setter (Accessor)
     * yang digunakan untuk mengakses variable yang terenkapsulasi 
     * (dalam kasus ini private)
    */
    public PesertaLombaEntity07341 getPeserta(){
        return peserta07341;
    }
    public void setPeserta(PesertaLombaEntity07341 peserta07341){
        this.peserta07341 = peserta07341;
    }
    public int getIndex(){
        return index07341;
    }
    public void setIndex(int index07341){
        this.index07341 = index07341;
    }
    public String getKodePeserta(){
        return kodePeserta07341;
    }
    public void setKodePeserta(String kodePeserta07341){
        this.kodePeserta07341 = kodePeserta07341;
    }
}
