import javax.servlet.* ; 
import javax.servlet.http.* ;
import java.io.* ; 
import java.util.* ; 


public class Main extends HttpServlet{

    public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException , ServletException
    {
        String name , addr ; 
        res.setContentType("text/html") ; 
        name = req.getParameter("name") ;
        addr = req.getParameter("address") ;

        PrintWriter out = res.getWriter() ; 
        StringBuffer resp ;
    }
}