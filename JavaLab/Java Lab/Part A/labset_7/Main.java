import java.util.* ; 
import java.io.* ; 

class Main {
	public static void main(String[] args) {
		
		Scanner scan=  new Scanner(System.in) ;
		String v1 , v2 ; 

		while(true){
			System.out.println("\n1.Enter direction for vehicle 1 (left / right) : ") ;
			v1 = scan.next() ; 
			System.out.println("\n1.Enter direction for vehicle 2 (left / right) : ") ;
			v2 = scan.next() ;
			try{
				Track.checkDir(v1 , v2) ; 
			}
			catch(IllegalDirectionException E){
				System.out.println(E.getMessage()) ; 
			}
		}
	}
}

class IllegalDirectionException extends Exception{
	IllegalDirectionException(String s){
		super(s) ; 
	}

}

class Track{
	static void checkDir(String v1 , String v2) throws IllegalDirectionException{
		if(!v1.equals(v2)){
			throw new IllegalDirectionException("Vehicles will collide ! ") ; 
		}
		else{
			System.out.println("\nValid directions .... ") ; 
		}
	}
}