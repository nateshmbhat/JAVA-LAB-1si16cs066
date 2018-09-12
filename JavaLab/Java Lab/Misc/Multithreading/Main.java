import java.util.* ; 
import java.lang.* ; 
import java.io.* ; 
import java.net.* ; 

public class Main{
	public static void main(String[] args) {
		ServerSocket ssocket = new SocketServer(4932) ; 		
		ssocket.accept() ;
	}	
}


class MySocketStuff implements Runnable {
 	@Override
 	public void run(){
 		concurrent.TimeUnit.SECONDS.sleep(1) ; 
 		System.out.println("Monitoring ..... ") ; 
 	}
}