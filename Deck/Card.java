public abstract class Card {//thn ftiaxnoume abstract wste h klash Card na klhronomeitai apo tis alles klaseis pou aforoun tis eidikes kartes

    private int pontoi;     //gia thn katametrhsh twn pontwn twn kartwn
    private int arithmos;  //kathe karta analogei se enan arithmo me thn proteraiothta pou isxuei sthn trapoula px to Mahjong=1, to 2=2,..., to J=11, to Q=12, to K=13, to A=14
   
    //constructor
    public Card( ) {
        this.pontoi = 0;
        this.arithmos = 0;
    }
   
    /**
     * Get Method opou epistrefei ton arithmo kathe kartas 1:Mahjong, 2:2,..., J:11, Q:12, K:13, A:14
     * Epistrefei double giati o Foinikas dinei 0.5+prohgoumenos arithmos pou paixthke @return double;
     */
    public int getArithmos() {
        return this.arithmos;
    }

    /**
     * Set Method gia na dinei se kathe karta thn aksia ths diladi 1:Mahjong,2:2,...,J:11,Q:12,K:13,A:14
     */
  
    public void setArithmos(int number) {
        this.arithmos = number;
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
}
