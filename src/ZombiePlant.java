public class ZombiePlant {
    //variables are declared at class level to store the values
    private int maxPotency;
    private int treatmentsLeft;

    //constructor receives the values when new ZombiePlant was created
    public ZombiePlant(int maxPotency, int numTreatments){
        this.maxPotency = maxPotency;   //set maximum allowed treatment
        this.treatmentsLeft = numTreatments;    //set initial number of treatments needed
    }

    // plant with potency <= 10, 3 treatments
    ZombiePlant plant = new ZombiePlant(10,3);

    public int getPotency(){
        return maxPotency;
    }

    public int treatmentsNeeded(){
        return treatmentsLeft;
    }

    // tell us if plant is still dangerous
    public boolean isDangerous(){
        return treatmentsLeft >0;
    }

    public void treat(int potency){
        // if plant is already cured (treatments left = 0), do nothing
        if(treatmentsLeft == 0){
            return;
        }

        // if treatment is too strong (potency > maxPotency)
        // plant gets worse - needs one more treatment
        if (potency > maxPotency){
            treatmentsLeft ++;
        } else {
            treatmentsLeft --;
        }
    }

}
