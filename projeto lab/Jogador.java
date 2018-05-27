import java.util.ArrayList;

public class Jogador {

	  public void colocaP(char [][] mundo) {
		  mundo[0][33] = 'P';
			andaPlayer(mundo);
			pegaArea(mundo);
	  }
		public void andaPlayer(char [][]mundo ) {
		  int i = 33;
		  int j = 9;
		  
		  while(j != 0) {
			  mundo[j][33] = 'P';
			  j--;
		  }
		  while(i >= 0) {
			  mundo[10][i] = 'P';
			  i--;
				
		  }
	  }
	  public int pegaArea(char [][] mundo){
		  int i;
		  int j;                                         
		  int contA = 0;
		  for(i=1;i<10;i++) {
			  for(j=1;j<33;j++) {
				  mundo[i][j] = '+';
			  }
				
		  }
		  for(i=1;i<10;i++) {
			  for(j=1;j<33;j++) {
				  contA++;
			  }
			  
		  }
		  return contA;
	  }

}


