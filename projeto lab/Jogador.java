package LAB;

public class Jogador {
	protected int x;
	protected int y;

	public Jogador(int x, int y){
	    this.x = x;
	    this.y = y;
        
	  }
	  
	  public void setX(int x){
	     this.x = x;
		}
	  public void setY(int y){
	     this.y = y;
		}
			
	  public int getX(){
	      return x;
		}
	  public int getY(){
	      return y;
		}
	  public void colocaP(char [][] mundo) {
		  mundo[0][33] = 'P';
	  }
}

