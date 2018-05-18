import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Cobra extends Player{

	public Cobra(int x, int y,int velo){
		super(x,y,2);
	}
        public int tamanho(int x, int y,int[][] mundo){
            mundo[x][y] = 'C';
            mundo[x][y+1] = 'C';
            mundo[x][y+2] = 'C';
            mundo[x][y+3] = 'C';
    }
}
