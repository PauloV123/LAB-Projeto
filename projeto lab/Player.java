import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Player{
  protected int x;
  protected int y;
  protected int velo;
  int i,j;
  
  public Player(int x, int y, int velo){
    this.x = x;
    this.y = y;
		this.velo = velo;
  }
  public void setVelo(int velo){
    this.velo = velo;
  }
  public int getVelo(){
    return velo;
  }
  public void setX(int x){
			this.x = x;
	}
	public void setY(int y){
		this.y = y;
	}
		
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	
	/*Função de movimentaçao dos veiculos*/
	public void move(ArrayList<Leao> l, ArrayList<Cobra> c, ArrayList<Jacare> j, int tipo){
	  Random random = new Random();
	  int r = random.nextInt(4);
	  if(r==0){
	    y = (y+velo)%60;
	  }
	  else if(r==1){
			y=(y-velo)%60;
			if(y<0)
				y=60-Math.abs(y);
		}
		else if(r==2){
			x=(x+velo)%30;
		}
		else if(r==3){
			x=(x-velo)%30;
			if(x<0)
				x=30-Math.abs(x);
		}
		
	}
	//LOGICA FABRICA
	/*public void temParede(ArrayList<Leao> l, 
	ArrayList<Cobra> c, ArrayList<Jacare> j, int tipo){
	  int xRandom = (int)(Math.random()*30);
		int yRandom = (int)(Math.random()*60);
		if(x==0){
			if(parede == false){
				if (tipo == 3){ 
					
					parede = true;
				}
				if (tipo == 2){
					
					parede= true;
				}
				if (tipo == 1){ 
					truck.add(new Truck(xRandom,yRandom,1,false));
					fabrica = true;
				}
			}
		}
		else if(x==5 && ((y>5 && y<12) || (y>48 && y<55))){
			if(fabrica == false){
				if (tipo == 3){ 
					bike.add(new Bike(xRandom,yRandom,3,false));
					fabrica = true;
				}
				if (tipo == 2){
					car.add(new Car(xRandom,yRandom,2,false));
					fabrica = true;
				}
				if (tipo == 1){ 
					truck.add(new Truck(xRandom,yRandom,1,false));
					fabrica = true;
				}
			}
		}
		else if (x==6 && ((y>5 && y<12) || (y>48 && y<55))){
			if(fabrica == false){
				if (tipo == 3){ 
					bike.add(new Bike(xRandom,yRandom,3, false));
					fabrica = true;
				}
				if (tipo == 2){
					car.add(new Car(xRandom,yRandom,2, false));
					fabrica = true;
				}
				if (tipo == 1){ 
					truck.add(new Truck(xRandom,yRandom,1, false));
					fabrica = true;
				}
			}
		}
		else if(x== 13 && ((y>26 && y<33))){
			if(fabrica == false){
				if (tipo == 3){ 
					bike.add(new Bike(xRandom,yRandom,3, false));
					fabrica = true;
				}
				if (tipo == 2){
					car.add(new Car(xRandom,yRandom,2, false));
					fabrica = true;
				}
				if (tipo == 1){ 
					truck.add(new Truck(xRandom,yRandom,1, false));
					fabrica = true;
				}
			}
		}
		else if(x==14 && ((y>26 && y<33))){
			if(fabrica == false){
				if (tipo == 3){ 
					bike.add(new Bike(xRandom,yRandom,3, false));
					fabrica = true;
				}
				if (tipo == 2){
					car.add(new Car(xRandom,yRandom,2, false));
					fabrica = true;
				}
				if (tipo == 1){ 
					truck.add(new Truck(xRandom,yRandom,1, false));
					fabrica = true;
				}
			}
		}
		else if(x==14 && ((y>26 && y<33))){
			if(fabrica == false){
				if (tipo == 3){ 
					bike.add(new Bike(xRandom,yRandom,3, false));
					fabrica = true;
				}
				if (tipo == 2){
					car.add(new Car(xRandom,yRandom,2, false));
					fabrica = true;
				}
				if (tipo == 1){ 
					truck.add(new Truck(xRandom,yRandom,1, false));
					fabrica = true;
				}
			}
		}
		else if(x==15 && ((y>26 && y<33))){
			if(fabrica == false){
				if (tipo == 3){ 
					bike.add(new Bike(xRandom,yRandom,3, false));
					fabrica = true;
				}
				if (tipo == 2){
					car.add(new Car(xRandom,yRandom,2, false));
					fabrica = true;
				}
				if (tipo == 1){ 
					truck.add(new Truck(xRandom,yRandom,1, false));
					fabrica = true;
				}
			}
		}
		else if(x==23 && ((y>5 && y<12) || (y>48 && y<55))){
			if(fabrica == false){
				if (tipo == 3){ 
					bike.add(new Bike(xRandom,yRandom,3, false));
					fabrica = true;
				}
				if (tipo == 2){
					car.add(new Car(xRandom,yRandom,2, false));
					fabrica = true;
				}
				if (tipo == 1){ 
					truck.add(new Truck(xRandom,yRandom,1, false));
					fabrica = true;
				}
			}
		}
		else if(x==24 && ((y>5 && y<12) || (y>48 && y<55))){
			if(fabrica == false){
				if (tipo == 3){ 
					bike.add(new Bike(xRandom,yRandom,3, false));
					fabrica = true;
				}
				if (tipo == 2){
					car.add(new Car(xRandom,yRandom,2, false));
					fabrica = true;
				}
				if (tipo == 1){ 
					truck.add(new Truck(xRandom,yRandom,1, false));
					fabrica = true;
				}
			}
		}
		else if(x==25 && ((y>5 && y<12) || (y>48 && y<55))){
			if(fabrica == false){
				if (tipo == 3){ 
					bike.add(new Bike(xRandom,yRandom,3, false));
					fabrica = true;
				}
				if (tipo == 2){
					car.add(new Car(xRandom,yRandom,2, false));
					fabrica = true;
				}
				if (tipo == 1){ 
					truck.add(new Truck(xRandom,yRandom,1, false));
					fabrica = true;
				}
			}
		}
	}*/
	public void batida(ArrayList<Bike> m, ArrayList<Car> c, ArrayList<Truck> t){
        int i,j;
        for(i=0;i<c.size();i++){  /*Colisão moto com carro*/
          for(j=0;j<m.size();j++){
            if(c.get(i).getX() == m.get(j).getX() & c.get(i).getY() == m.get(j).getY()){
              m.remove(j);
              if(i>0)
                i--;
              if(j>0)
                j--;

            }
          }
      }
}
	
