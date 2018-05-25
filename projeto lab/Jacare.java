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
}
