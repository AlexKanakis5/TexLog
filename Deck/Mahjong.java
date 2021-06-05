public class Mahjong extends SpecialCards{
    int DemandNumber;
  
    //constructor
  
  public Mahjong()
    {
        super();
        this.setArithmos(1);
        this.setPontoi(0);
        this.color(NONE);
    }

  // Epistrefei ton arithmo pou zhthse o paikths
  
    public int getDemandNumber() {
        return DemandNumber;
    }

    /**
     * transformers
     * thetei sto DemandNumber ton arithmo pou zitithike
     */
    public void setDemandNumber(int DemandNumber) {
        this.DemandNumber = DemandNumber;
    }
}
