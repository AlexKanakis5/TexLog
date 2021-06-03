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
    }k
    
    public void printState() {
        System.out.println("acceptancce="+acceptance);
        System.out.println("understanding="+understanding);
    }
}

