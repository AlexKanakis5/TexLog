package diagram3;
public class Player {
    public boolean acceptance,acceptance_rest;
    public boolean understanding,understanding_rest;
    public boolean tichu,grand_tichu;
    
    public Player(){
        acceptance=false;
        understanding=false;
    }
    
    public void acceptCards() {
        acceptance=true;
    }
    
    public void understandCards() {
        understanding=true;
    }
    
    
    public void grand_tichu() {
        grand_tichu=true;        
        System.out.println("grand_tichu="+grand_tichu);
        System.out.println("\nOne player chose grand tichu\n");
        
    }
    
    public void acceptRestCards() {
        acceptance_rest=true;
    }
    
    public void understandingRestCards() {
        understanding_rest=true;
    }
    
    public void tichu() {
        tichu=true;
        System.out.println("\nOne player chose tichu\n");
        //System.out.println("tichu="+tichu);
    }
    
    public void printState() {
        System.out.println("Acceptancce="+acceptance);
        System.out.println("Understanding="+understanding);
        System.out.println("Acceptancce_rest="+acceptance_rest);
        System.out.println("Understanding_rest="+understanding_rest);
        
    }
}

