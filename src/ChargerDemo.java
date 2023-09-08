public class ChargerDemo {
    public static void main(String[] args) {
        Charger cgr = new Charger();

        cgr.setTipeUSB("Type C");
        cgr.setOutput(9.5f);
        cgr.tipeCharge("Fast Charging");
        cgr.cetakStatus();
    }
}
