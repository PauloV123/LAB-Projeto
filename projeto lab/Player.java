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
	  abstract int[][] tamanho();
		
		
	 public void move(ArrayList<Leao> l, ArrayList<Cobra> c, ArrayList<Jacare> j, int tipo){
		Random random = new Random();
		int r = random.nextInt(4);
		if(r==0){
		  y = (y+velo)%60;
		}
		else if(r==1){
		  y=(y-velo)%60;
			if(y<0)
			   y=60-Math.abs(y);
		}
		else if(r==2){
		  x=(x+velo)%30;
		}
		else if(r==3){
		  x=(x-velo)%30;
			if(x<0)
			  x=30-Math.abs(x);
			}
		}               
	}
