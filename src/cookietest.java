

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.fabric.Response;
import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

/**
 * Servlet implementation class cookietest
 */
@WebServlet("/cookietest")
public class cookietest extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	//	HttpSession session= request.getSession();
		//session.setAttribute("name", "session name");
		
		PrintWriter out = response.getWriter();
		out.println("<html><body><form method='post'>User ID:<br><input type='text' name='ID' ><br>Password:<br><input type='password' name='pass' ><br>");
		out.println("<input type='checkbox' name='remember' value='remember'>Remember me<br><input type='submit' value='Login'><a href='RegisterServlet'>Register</a></form>");
		out.println("</body</html>");
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie ck[]= request.getCookies();
		HttpSession session= request.getSession();
		System.out.println("now post method");
	
		System.out.println("cookie gone");
		//System.out.println("this is first cookie"+ ck[0].getValue());
		//System.out.println("this is second cookie"+ ck[1].getValue());
		System.out.println("session");
		System.out.println("this is sess: "+session.getAttribute("neghghfgfg") );
		
		
		
	}

}
