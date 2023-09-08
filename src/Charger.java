public class Charger {
    private String tipeUSB;
    private float output;
    private String tipeCharging;

    public void setTipeUSB(String USB){
        tipeUSB = USB;
    }

    public void setOutput(float output){
        this.output = output;
    }

    public void tipeCharge(String tipeCharge){
        tipeCharging = tipeCharge;
    }

    public void cetakStatus(){
        System.out.println("Tipe USB: "+tipeUSB);
        System.out.println("Output: "+output+"V");
        System.out.println("Tipe Charge: "+tipeCharging);
    }
}
