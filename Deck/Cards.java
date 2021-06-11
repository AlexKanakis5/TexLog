import java.awt.Color;    //allagi pou egine stis 8/6/2021 gia na douleuoun ta xrwmata
public abstract class Cards {//thn ftiaxnoume abstract wste h klash Cards na klhronomeitai apo tis alles klaseis pou aforoun tis eidikes kartes

    private int pontoi;     //gia thn katametrhsh twn pontwn twn kartwn
    private double arithmos;  //kathe karta analogei se enan arithmo me thn proteraiothta pou isxuei sthn trapoula px to Mahjong=1, to 2=2,..., to J=11, to Q=12, to K=13, to A=14
    public Color color;
    //allagi pou egine stis 8/6/2021 gia na douleuoun ta xrwmata 
    public static final Color NONE = new Color(255,255,255);
    public static final Color RED = new Color(255,102,0);
    public static final Color BLACK = new Color(0,0,0);
    public static final Color BLUE = new Color(0,0,204);
    public static final Color GREEN = new Color(0,204,0);
    
    //constructor
    public Cards( ) {
        this.pontoi = 0;
        this.arithmos = 0.0;
    }
   
    /**
     * Get Method opou epistrefei ton arithmo kathe kartas 1:Mahjong, 2:2,..., J:11, Q:12, K:13, A:14
     * Epistrefei double giati o Foinikas dinei 0.5+prohgoumenos arithmos pou paixthke
     */
    public double getArithmos() {
        return this.arithmos;
    }

    /**
     * Set Method gia na dinei se kathe karta thn aksia ths diladi 1:Mahjong,2:2,...,J:11,Q:12,K:13,A:14
     */
  
    public void setArithmos(double number) {
        this.arithmos = number;
    }
    
    //To enum type einai ena special data type to opoio epitrepei se mia metablhth na apoteleitai apo ena set prokathorismenwn timwn. 
    //H metavliti prepei na einai ish me mia apo autes tis prokathorismenes times. Xrhsimopoieitai wste na apofeugetai o orismos timwn pou den einai egkures.
       
    
      public Color getColor() {
        return color;
    }

    /**
     * Get Method opou epistrefei tous pontous pou metraei kathe karta gia thn katametrhsh twn pontwn, K=10 pontoi, 10=10 pontoi,5=5 pontoi ktl
     * Den exoun oles oi kartes pontous
     */
    public int getPontoi() {
        return pontoi;
    }

    /**
     * Set Method gia na vazei se kathe karta tous pontous pou pianei, 0 gia oses den exoun pontous
     */
    public void setPontoi(int pontoi) {
        this.pontoi = pontoi;
    }
    
    //method gia elegxo ean einai Foinikas
        public boolean isPhoenix() {
        return false;
    }
    
   //method gia elegxo ean einai kapoia SpecialCard
    public boolean isSpecialCard() {
        return false;
    }
}
