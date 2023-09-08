public class User {
    protected String[] nama = new String[50];
    protected String[] alamat = new String[50];
    protected String[] noHp = new String[50];


    // public void simpanData(String[] nama, String[] alamat, String[] noHp){
    //     for(int i = 0; i < 50; i++){
    //         nama = nama[i];
    //     }
    // }
    public void cetakUser() {
        for (int i = 0; i < 50; i++) {
            if (nama[i] == null) {
                break;
            } else {
                
            System.out.println("Nama: " + nama[i]);
            System.out.println("Alamat: " + alamat[i]);
            System.out.println("No HP: " + noHp[i]);
            System.out.println("=======================");
            }
        }
    }
}
