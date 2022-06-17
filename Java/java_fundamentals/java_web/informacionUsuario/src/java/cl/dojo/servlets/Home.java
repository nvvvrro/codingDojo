package cl.dojo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");

		String favLang = request.getParameter("favLang");
		String hometown = request.getParameter("hometown");

		if (nombre.equals("")) {
			nombre = "Unknown";
		}
		if (apellido.equals("")) {
			apellido = "Unknown";
		}
		if (favLang.equals("")) {
			favLang = "Unknown";
		}
		if (hometown.equals("")) {
			hometown = "Unknown";
		}

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<html><body>");
		pw.println("<h1>Welcome, " + nombre + " " + apellido + " </h1>");
		pw.println("<h2>Your favorite language is: " + favLang + " </h2>");
		pw.println("<h2>Your hometown is: " + hometown + " </h2>");
		pw.println("</body></html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
