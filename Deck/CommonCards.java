import java.awt.Color;     //allagi pou egine stis 8/6/2021 gia na douleuoun ta xrwmata
public class CommonCards extends Cards {
  private int rank;

	private static String[] ranks  = { "-1","-1" , "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13","14" };


	public CommonCards(Color color, int rank)
	{
		this.rank=rank;
                this.setPontoi(rank);
		this.color=color;
                this.setArithmos(0);
                
                if(ranks[rank].equals("5")){
                    this.setPontoi(5);
                    this.setArithmos(5);
                }
                else if(ranks[rank].equals("10")){
                    this.setPontoi(10);
                    this.setArithmos(10);
                }
                else if(ranks[rank].equals("11")){
                    this.setPontoi(11);
                    this.setArithmos(0);
                }
                else if(ranks[rank].equals("12")){
                    this.setPontoi(12);
                    this.setArithmos(0);
                }
                else if(ranks[rank].equals("13")){
                    this.setPontoi(13);
                    this.setArithmos(10);
                }
                else if(ranks[rank].equals("14")){
                    this.setPontoi(14);
                    this.setArithmos(0);
                }
                
	}

  
    //epistrefoume to rank
    
    public String getRank() {
        return ranks[rank];
    }

    // set method gia to rank
    public void setRank(int rank) {
        this.rank = rank;
    }    
}
