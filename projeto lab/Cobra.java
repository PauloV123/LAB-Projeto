
public class Cobra extends Player{

	public Cobra(int x, int y,int velo){
		super(x,y,2);
	}
	int[][] tamanho() {
		return null;
	}
    public int tamanho(int x, int y,int[][] mundo){
       mundo[x][y] = 'C';
       mundo[x][y+1] = 'C';
       mundo[x][y+2] = 'C';
       mundo[x][y+3] = 'C';
       return mundo[x][y];      
    }
        public int getX(){
        	return x;
        }
        public int getY(){
        	return y;
        }	

}
