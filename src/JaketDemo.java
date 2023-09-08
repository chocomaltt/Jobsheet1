public class JaketDemo {
    public static void main(String[] args) {
        Jaket jkt = new Jaket();
        JaketLari jkl = new JaketLari();
        JaketGunung jkg = new JaketGunung();

        jkt.setMerk("Emba Jeans");
        jkt.setUkuran('L');
        jkt.setKetebalan("Sedang");
        jkt.cetakBarang();
        System.out.println("");

        jkl.setMerk("Rainsol");
        jkl.setUkuran('L');
        jkl.setKetebalan("Tipis");
        jkl.setFitur("Penutup kepala, Stopper tali");
        jkl.setSaku(2);
        jkl.cetakBarang();
        System.out.println();

        jkg.setMerk("Consina");
        jkg.setUkuran('M');
        jkg.setKetebalan("Tebal");
        jkg.setBahan("Duratex Polyester");
        jkg.setKetahanan("Tahan air, Tahan terpaan angin");
        jkg.cetakBarang();
    }
}
