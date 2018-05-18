import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Jacare extends Player{

	
	public Jacare(int x, int y,int velo){
		super(x,y,1);
	}
	public int tamanho(int x, int y, int[][] mundo){
            mundo[x][y] = 'J';
            mundo[x+1][y] = 'J';
            mundo[x][y+1] = 'J';
            mundo[x+1][y+1] = 'J';
            mundo[x][y+2] = 'J';
            mundo[x+1][y+2] = 'J';
         }
}

}
