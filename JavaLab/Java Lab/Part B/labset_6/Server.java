import java.net.* ; 
import java.io.* ; 

public class ContentServer{
	public static void main(String[] args) {
		ServerSocket socket = new ServerSocket(4000) ; 
		System.out.println("Server readY") ; ;
		Socket csock = socket.accept() ; 

		System.out.println("COnnected to client : "+ csock.getRemoteAddr());

		InputStream ip = csock.getInputStream() ; 
		BufferedReader reader = new BufferedReader(new InputStreamReader(ip)) ; 
		String fname = reader.readLine() ; 

		BufferedReader filereader = new BufferedReader(new FileReader(fname)) ; 

		OutputStream op = csock.getOutputStream() ; 
		PrintWriter out = new PrintWriter(op , true) ; 
		String mystring ; 

		while(mystring = filereader.readLine()!=null){
			out.println(str) ; 
		}

		csock.close() ; 
		socket.close() ; 

		out.close() ; 
}