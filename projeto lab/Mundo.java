import java.util.ArrayList;


public class Mundo {
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
	    for(int i = 0; i < 30; i++){
	      System.out.println("");
	      for(int j = 0; j < 70; j++){
	        System.out.printf("%c", mundo[i][j]);
	      }
	    }
	  }
	  public void setMundoV(ArrayList<Leao> l, ArrayList<Cobra> c, ArrayList<Jacare> j, int tipo){

	    if(tipo == 2){
	    	
		}
	    else if(tipo == 1){ 
			
		}
	   else if(tipo == 3){ 
			
		}

	  }
	  public void setPlayer(){
		  mundo[0][34] = 'P';
		}

	 
	  private char[][]mundo = new char[30][70];
	  
	  
}
