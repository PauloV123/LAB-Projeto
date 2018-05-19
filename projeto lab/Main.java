//import java.util.Iterator;
//import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

class Main {
  public static void main(String[] args) {
  Mundo M = new  Mundo();
  M.criaMundo();
    
  System.out.println();
    
  int i;
  ArrayList <Cobra> c = new ArrayList<>();
  ArrayList <Leao> l = new ArrayList<>();
  ArrayList <Jacare> j = new ArrayList<>();
    
    for(i=0;i<4;i++){
       int xc = (int)(Math.random()*27);
       int yc = (int)(Math.random()*67);
       int xl = (int)(Math.random()*27);
       int yl = (int)(Math.random()*67);
       int xj = (int)(Math.random()*27);
       int yj = (int)(Math.random()*67);
       c.add(new Cobra(xc,yc,2));
       l.add(new Leao(xl,yl,3));
       j.add(new Jacare(xj,yj,1));
       
       
    }
    
    
    
    
    for(i=0;i<4;i++){

      M.addMundo(l);
      M.addMundo(c);
      M.addMundo(j);
      M.setPlayer();
    }
    M.imprimeMundo();
    /*while(c.size()> 0 | l.size() > 0){
      for(i=0;i<c.size();i++){
        c.get(i).move(l,c,j,2);
      }
      for(i=0;i<l.size();i++){
        l.get(i).move(l,c,j,3);
      }
      for(i=0;i<j.size();i++){
        j.get(i).move(l,c,j,1);
      }
      M.criaMundo();
      for(i=0;i<l.size();i++){
    		M.setMundoL(l);
    	}
    	for(i=0;i<c.size();i++){
    		M.setMundoC(c);
    	}
    	for(i=0;i<j.size();i++){
    		M.setMundoJ(j);
    	}
    	M.setPlayer();
    	System.out.println();
    	M.imprimeMundo();
    	
    	for(i=0;i<5;i++){
    	  System.out.printf("\n");
    	}
	try{ 	
            Thread.sleep(800);///esta funcao permite "pausar" o programa a cada instancia de tempo determinada pelo programador 
	} 
        catch(InterruptedException e){
	}
    	
    }
    for ( i = 0; i < j.size(); i++) {
        j.remove(i);
      }
      for ( i = 0; i < c.size(); i++) {
        c.remove(i);
      }
      for ( i = 0; i < l.size(); i++) {
        l.remove(i);
      }*/
  }
}
