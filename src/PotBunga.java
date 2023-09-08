public class PotBunga {
    private int diameter;
    private String warna;
    private String bahan;
    private String merk;

    public void setDiameter(int diameter){
        this.diameter = diameter;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public void setBahan(String bahan){
        this.bahan = bahan;
    }

    public void setMerk(String merk){
        this.merk = merk;
    }

    public void cetakStatus(){
        System.out.println("Merk: "+merk);
        System.out.println("Diameter (cm): "+diameter);
        System.out.println("Warna: "+warna);
        System.out.println("Bahan: "+bahan);
    }
}
