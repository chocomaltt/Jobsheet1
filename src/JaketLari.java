public class JaketLari extends Jaket{
    private String fitur;
    private int jumlahSaku;

    public void setFitur(String fitur){
        this.fitur = fitur;
    }

    public void setSaku(int saku){
        jumlahSaku = saku;
    }

    public void cetakBarang(){
        super.cetakBarang();
        System.out.println("Fitur: "+fitur);
        System.out.println("Jumlah Saku: "+jumlahSaku);
    }
}
