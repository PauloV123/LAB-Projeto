import java.util.Random;
public class Leao extends Player{
	public int getX(){
    	return x;
    }
    public int getY(){
    	return y;
    }
	public Leao(int x, int y,int velo){
		super(x,y,3);
	}
	int[][] tamanho() {
		return null;
	}
	
	public void draw(char [][] mundo){
		mundo[x][y] = 'L';
	} 	 
}
