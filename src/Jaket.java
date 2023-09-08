public class Jaket{
    private String Merk;
    private char Ukuran;
    private String Ketebalan;

    public void setMerk(String Merk){
        this.Merk = Merk;
    }

    public void setUkuran(char Ukuran){
        this.Ukuran = Ukuran;
    }

    public void setKetebalan(String Ketebalan){
        this.Ketebalan = Ketebalan;
    }

    public void cetakBarang(){
        System.out.println("Merk Jaket: "+Merk);
        System.out.println("Ukuran: "+Ukuran);
        System.out.println("Ketebalan Jaket: "+Ketebalan);
    }
}