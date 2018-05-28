import java.util.ArrayList;
import java.util.Random;

abstract class Inimigo {
	protected int x;
	protected int y;
	protected int velo;
	protected int i,j;
	  
	public Inimigo(int x, int y, int velo){
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
 
	 public void move(int velo) {
        	Random random = new Random();
        	int r = random.nextInt(4);
       		if (r == 0){
	            y = y + velo;
	     	    	if(y >= 69){
								 y = y - velo; 
	    		}
					
        }else if (r == 1) {
            y = (y - velo);
            if (y <= 1) {
                y = velo + y;
						}
        }else if (r == 2 ) {
           x = (x + velo);
	    	   if(x >= 29){
	    				x = x - velo;
           }
		
				}else if (r == 3 ) {
    			x = x - velo;
        	if (x <= 1){
        		x = velo + x;
        }
		}
  }	
}
