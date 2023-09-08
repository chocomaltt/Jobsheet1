public class JaketGunung extends Jaket{
    private String bahan;
    private String ketahanan;

    public void setBahan(String bahan){
        this.bahan = bahan;
    }

    public void setKetahanan(String ketahanan){
        this.ketahanan = ketahanan;
    }

    public void cetakBarang(){
        super.cetakBarang();
        System.out.println("Bahan: "+bahan);
        System.out.println("Ketahanan: "+ketahanan);
    }
}
