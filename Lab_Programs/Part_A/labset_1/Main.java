import java.util.* ; 
import java.io.* ; 

class rectangle{

	 double length , width , area ; 
	 String color ; 

	void set_width(double width){this.width = width ; }
	void set_color(String c) { this.color = c ; }
	void set_length(double l ) { length = l ; }
	void find_area(){this.area = length * width ;}
}

public class Main{

	public static void print(String s){
		System.out.println(s) ;
	}

	public static void main(String[] args){
		rectangle rect = new rectangle() ;
		Scanner scan = new Scanner(System.in) ;
		print("Enter length : ") ; 
		rect.set_length(scan.nextDouble() ) ;
		print("Enter width : " ) ;  
		rect.set_width(scan.nextDouble()) ; 
		print("Enter color : " ) ;
		rect.set_color(scan.next()) ;
		rect.find_area() ;

		rectangle rect1 = new rectangle() ;
		print("Enter length : ") ; 
		rect1.set_length(scan.nextDouble() ) ;
		print("Enter width : " ) ;  
		rect1.set_width(scan.nextDouble()) ; 
		print("Enter color : " ) ;
		rect1.set_color(scan.next()) ;
		rect1.find_area() ;

		if(rect1.area==rect.area && rect1.color.equals(rect.color))
		{
			print("\nMatching ... ") ; 
		}
		else print("\nNot mathing ... ") ;
	}
}