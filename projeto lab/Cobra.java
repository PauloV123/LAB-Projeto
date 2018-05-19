
public class Cobra extends Player{
	 public int getX(){
     	return x;
     }
     public int getY(){
     	return y;
     }	
     
	public Cobra(int x, int y,int velo){
		super(x,y,2);
	}

	public void draw(char [][] mundo){
		mundo[x][y] = 'C';
	    mundo[x][y+1] = 'C';
	    mundo[x][y+2] = 'C';
	    mundo[x][y+3] = 'C';
	}       

}
