import java.util.Random;
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
        public void move( int x, int y, int velo){
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
