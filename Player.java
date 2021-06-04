public class Player {
    public boolean acceptance;
    public boolean understanding;
    
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
    
    
    public void grandTichu() {
        grandtichu=true;        
    }
    
    public void acceptRestCards() {
        acceptance_rest=true;
    }
    
    public void understandingRestCards() {
        understanding_rest=true;
    }
    
    public void tichu() {
        tichu=true;
    }
    
    public void printState() {
        System.out.println("acceptancce="+acceptance);
        System.out.println("understanding="+understanding);
        System.out.println("grandtichu="+grandtichu);
        System.out.println("One player chose grand tichu");
        System.out.println("acceptancce_new="+acceptance_rest);
        System.out.println("understanding_new="+understanding_rest);
        System.out.println("tichu="+tichu);
        System.out.println("One player chose tichu");
    }
}

