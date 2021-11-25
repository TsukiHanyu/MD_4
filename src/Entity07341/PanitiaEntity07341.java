package Entity07341;

public class PanitiaEntity07341 extends BiodataLombaEntity07341 {
    private String password07341;
    
    public PanitiaEntity07341(String password07341, String nama07341, String noTelp07341, String alamat07341){
        super(nama07341, noTelp07341, alamat07341);
        this.password07341 = password07341;
    }
    /**
     * Fuction dibawah ini merupakan getter dan setter (Accessor)
     * yang digunakan untuk mengakses variable yang terenkapsulasi 
     * (dalam kasus ini private)
     * @return 
     */
    
    public String getPassword(){
        return password07341;
    }
    public void setPassword (String password07341){
        this.password07341 = password07341;
    }
}
