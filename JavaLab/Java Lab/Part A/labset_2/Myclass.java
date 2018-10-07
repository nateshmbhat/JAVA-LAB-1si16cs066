import java.util.* ; 
import java.io.* ; 

public class Myclass{
	Myclass(){ ; }
	Myclass(int c) { 
		System.out.println(c) ;
	}

	void print(String s){ System.out.println(s) ;}
	void print(int s){System.out.println(s) ; }

	public static void main(String[] args){
		Myclass obj = new Myclass() ; 
		Myclass obj1 = new Myclass() ; 

		obj.print("Printing ... ") ; 
		obj1.print("\nPrinting again ... ") ;
	}
}