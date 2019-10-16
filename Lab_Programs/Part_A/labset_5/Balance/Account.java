package Balance ;
import java.util.* ; 
import java.lang.* ; 
import java.io.* ; 


public class Account{
	double balance ; 

	public Account(){
		balance = Math.floor((Math.random()*100)) ;
	}
	public void Display_Balance(){
		System.out.println("\nBalance is : " + balance) ; 
	}
}