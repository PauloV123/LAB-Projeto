import java.util.ArrayList;
import java.util.Random;

abstract class Player {
	protected int x;
	protected int y;
	protected int velo;
	protected int i,j;
	  
	public Player(int x, int y, int velo){
	    this.x = x;
	    this.y = y;
            this.velo = velo;
	  }
	  public void setVelo(int velo){
	    this.velo = velo;
	  }
	  public int getVelo(){
	    return velo;
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
	  
	 public abstract void draw(char [][] mundo);
 
		
	 public abstract void move(int x, int y, int velo);
		
	}
