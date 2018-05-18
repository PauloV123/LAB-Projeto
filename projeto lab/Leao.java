import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Leao extends Player{
	
	public Leao(int x, int y,int velo){
		super(x,y,3);
	}
	public int tamanho(int x, int y, int[][] mundo){
            mundo[x][y] = 'L';
            
        }

}
