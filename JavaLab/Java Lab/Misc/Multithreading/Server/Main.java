import java.util.* ; 
import java.lang.* ; 
import java.io.* ; 
import java.net.* ; 

public class Main{
	public static void main(String[] args) {
		SocketServer ssocket = new SocketServer(4932) ; 		
		ssocket.accept() ; 
	}	
}


class MySocketStuff implements Runnable {
 	@Override
 	void run(){
 		wait(10) ; 
 	}
}