import java.util.ArrayList;


public class Mundo {
	protected char[][]mundo = new char[60][100];
	ArrayList<Inimigo> animais = new ArrayList<>();
	Jogador p = new Jogador();

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
		  p.colocaP(mundo);
		  for(Inimigo ini : animais){
			  ini.draw(mundo);
		  }
			
	    for(int i = 0; i < 30; i++){
	      System.out.println("");
	      for(int j = 0; j < 70; j++){
	        System.out.printf("%c", mundo[i][j]);
	      }
	    }
	  }
	  
	   
	  public void addMundo(ArrayList<? extends Inimigo> ini){
		  animais.addAll(ini);

	  }
	    
	  public int terminaMundo(int contA) {
		  int acaba;
		  if(contA == 1529) {
			  acaba = 1;
		  }else {
			  acaba = 0;
		  }
		  return acaba;
	  }	  
		  
}
