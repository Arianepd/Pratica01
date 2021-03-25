

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MeuServlet
 */
//@WebServlet("/MeuServlet")
public class MeuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter( );
		
		String text = "";
		text += "<html>";
		text += "<head>";
		text += "<meta charset=\"ISO-8859-1\">";
		text += "<title>Estou na Pratica Sevlet 01 via servlet</title>";
		text += "</head>";
		text += "<body>";
		text += "PraticaServlet - Served at: " + request.getContextPath();
		text += "<P><P>";
		text += "<h1 style=\"background-color: lightgreen\">Bem Vindo à Pratica\r\n" + 
				"				Sevlet 01</h1>";
		text += "	<p>\r\n" + 
				"			<p>\r\n" + 
				"			<h3>Voce entrou varias vezes nesta pagina!</h3>\r\n" + 
				"</body>\r\n" + 
				"</html>";		
		
		out.println( text );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
