public class Mundo{
  public void criaMundo(){
    int i,j;
    for(i=0;i<30;i++){
      for(j=0;j<70;j++){
        mundo[i][j] = '-';
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
  public void setMundoV(int x, int y, int tipo){
    /*Definindo os pontos dos veiculos*/
    if(tipo == 2){//car
			mundo[x][y] = 'C';
			mundo[x][y+1] = 'C';
			mundo[x][y+2] = 'C';
			mundo[x][y+3] = 'C';
		}
		else if(tipo == 1){ //truck
			mundo[x][y] = 'J';
			mundo[x+1][y] = 'J';
			mundo[x][y+1] = 'J';
			mundo[x+1][y+1] = 'J';
			mundo[x][y+2] = 'J';
			mundo[x+1][y+2] = 'J';
		}
		else if(tipo == 3){ //bike
			mundo[x][y] = 'L';
		}

  }
  public void setPlayer(){
	  mundo[0][35] = 'P';
	}
 
  private char[][]mundo = new char[30][70];
  
  
}
