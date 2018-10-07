import java.util.* ; 
import java.io.* ; 


class Call{

	public void charge(int c){
		System.out.println("Trunk call cost = " + c) ; 
	}


	public void charge(float c){
		System.out.println("Urgent call cost = " +c) ; 
	}


	public void charge(double c){
		System.out.println("lightning call cost = " + c) ; 
	}
}


public class Main {
	public static void main(String[] args){
		Call obj = new Call() ;
		int i = 10 ; float f = (float)10.33 ; double d  = 10.2323 ;  
		
		obj.charge(i) ; 
		obj.charge(f) ; 
		obj.charge(d) ;
	}
}