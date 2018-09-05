import java.util.* ; 
import java.io.* ; 

interface MyStack{
	void push(int a) ; 
	int pop() ;
}

public class Main {

	public static void main(String[] args){

		System.out.println("\nStack implementation . ") ;
		MyStackClass obj = new MyStackClass() ; 

		obj.push(10)  ; 
		obj.push(20) ; 
		obj.push(30) ;
		obj.push(40) ; 
		obj.push(50) ;
		System.out.println("\nStack is : ") ;   
		obj.display() ; 
		obj.pop() ; 
		obj.pop() ; 
		obj.pop() ; 
		obj.pop() ; 
		System.out.println("\nStack is : ") ;   
		obj.display() ; 

	}
}

class MyStackClass implements MyStack{
	static int stack[] ; 
	static int top  ; 
	static int size = 4 ; 

	static{
		stack  = new int[size] ;  
		top = -1 ; 
	} 


	public void push(int a ){
		if(top==size-1){
			System.out.println("Increasing stack size ... ") ; 
			int [] newstack = new int[size*2] ; 
			

			for(int i =0 ; i< size ; i++){
				newstack[i] = stack[i] ;
			}
			size*=2 ; 
			stack = newstack ;
		}

		stack[++top] = a ;
		System.out.println(a + " obj.pushed ") ; 
	}

	public void display(){
		int tc = top ; 
		while(tc>=0){
			System.out.println(stack[tc--]) ; 
		}
	}

	public int pop(){
		if(top==-1){
			System.out.println("\nStack is empty ! " ) ; 
			return  -1 ;
		}

		System.out.println(stack[top] + " popped! " ) ; 
		return stack[top--] ; 
	}
}