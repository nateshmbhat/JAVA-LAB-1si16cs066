import java.util.* ; 
import java.io.* ; 

interface MyStack{
	void push(int a) ; 
	int pop() ;
}

public class Main implements MyStack{
	static int stack[] ; 
	static int top  ; 
	static{
		stack  = new int[100] ; 
		top = -1 ; 
	} 

	public static void main(String[] args){

	}

	void push(int a ){
		stack[++top] = a ; 
	}


	Integer 
}