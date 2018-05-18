
public class Jacare extends Player{

	public Jacare(int x, int y,int velo){
		super(x,y,1);
	}
	int[][]  tamanho() {
		return null;
		
		
	}
	int tamanho(int x, int y, int[][] mundo){
            mundo[x][y] = 'J';
            mundo[x+1][y] = 'J';
            mundo[x][y+1] = 'J';
            mundo[x+1][y+1] = 'J';
            mundo[x][y+2] = 'J';
            mundo[x+1][y+2] = 'J';
            return mundo[x][y];
         }
	public int getX(){
    	return x;
    }
    public int getY(){
    	return y;
    }
}

