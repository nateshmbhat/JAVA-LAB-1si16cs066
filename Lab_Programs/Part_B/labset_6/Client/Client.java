import java.net.*;
import java.util.* ; 
import java.io.*;
public class Client{
	public static void main(String args[]) throws Exception {
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Enter server ip : "); 
		Socket sock = new Socket( scan.next(), 4000);
// reading the file name from keyboard. Uses input stream
		System.out.print("Enter the file name : ");
		BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
		String fname = keyRead.readLine();
// sending the file name to server. Uses PrintWriter
		OutputStream ostream = sock.getOutputStream( );
		PrintWriter pwrite = new PrintWriter(ostream, true);
		pwrite.println(fname);
// receiving the contents from server. Uses input stream
		InputStream istream = sock.getInputStream();
		BufferedReader socketRead = new BufferedReader(new InputStreamReader(istream));
		String str;
// reading line-by-line
		while((str = socketRead.readLine()) != null){
			System.out.println(str);
		}
		pwrite.close();
		socketRead.close();
		keyRead.close();
	}
}
