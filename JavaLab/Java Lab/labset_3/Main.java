import java.util.* ; 
import java.io.* ; 


class Player{
	public void show(){
		System.out.println("Player method") ; 
	}
	public void fun(){
		System.out.println("Inside fun method of player .") ;
	}
}

class Football_Player extends Player{
	public void show(){
		System.out.println("football player method " ) ; 
	}
}


class Cricket_Player extends Player{
	public void show(){
		System.out.println("football player method " ) ; 
	}
}


class Hockey_Player extends Player{
	public void show(){
		System.out.println("football player method " ) ; 
	}
}


public class Main {
	public static void main(String[] args){
		Player p = new Player() ; 
		Football_Player fp = new Football_Player() ; 
		Cricket_Player cp = new Cricket_Player() ; 
		Hockey_Player hp = new Hockey_Player() ; 

		fp.show() ; 
		p.show() ;

		cp.show() ;
		cp.fun() ; 

		hp.show() ; 
		hp.fun() ; 
	}
}