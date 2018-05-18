
public class Leao extends Player{
	
	public Leao(int x, int y,int velo){
		super(x,y,3);
	}
	int[][] tamanho() {
		return null;
	}
	 int tamanho(int x, int y, int[][] mundo){
            mundo[x][y] = 'L';
            return mundo[x][y];
        }
	public int getX(){
    	return x;
    }
    public int getY(){
    	return y;
    }
}
