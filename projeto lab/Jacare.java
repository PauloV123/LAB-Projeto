import java.util.Random;
public class Jacare extends Player{
	public int getX(){
    	return x;
    }
    public int getY(){
    	return y;
    }
	public Jacare(int x, int y,int velo){
		super(x,y,1);
	}
	int[][]  tamanho() {
		return null;
		
		
	}
	
	public void draw(char [][] mundo){
		mundo[x][y] = 'J';
        mundo[x+1][y] = 'J';
        mundo[x][y+1] = 'J';
        mundo[x+1][y+1] = 'J';
        mundo[x][y+2] = 'J';
        mundo[x+1][y+2] = 'J';
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
