
import java.util.ArrayList;


public class Mundo {
	ArrayList<Player> animais = new ArrayList<>();
	
	public void criaMundo(){
	    int i,j;
	    for(i=0;i<30;i++){
	      for(j=0;j<70;j++){
	        mundo[i][j] = ' ';
	        //Isso vai fazer as laterais
	        mundo[i][0] = '1';/*limite superior do mapa*/
	        mundo[0][j] = '2';/*limite lateral esquerda do mapa*/
	        mundo[i][69] = '3';/*limite lateral direira do mapa*/
	        mundo[29][j] = '4';/*limite inferior do mapa*/
	      }
	    }
	  }
	  public void imprimeMundo(){
		  
		  for(Player p : animais){
			  p.draw(mundo);
		  }
		  
	    for(int i = 0; i < 30; i++){
	      System.out.println("");
	      for(int j = 0; j < 70; j++){
	        System.out.printf("%c", mundo[i][j]);
	      }
	    }
	  }
	  
	   
	  public void addMundo(ArrayList<? extends Player> p){
		  animais.addAll(p);

	  }
	  
	  public void setPlayer(){
		  mundo[0][33] = 'P';
		}
	  
	  public void andaPlayer() {
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
	  public void pegaArea(){
		  int i;
		  int j;
		  for(i=1;i<10;i++) {
			  for(j=1;j<33;j++) {
				  mundo[i][j] = '+';
			  }
		  }
	  }
	  private char[][]mundo = new char[60][100];
		  
	  }

	 
	 

		
	
