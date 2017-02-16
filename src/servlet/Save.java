package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Save
 * 
 * @author William Hincapie - daemonsoft@gmail.com
 */
@WebServlet("/Save")
public class Save extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userid = request.getParameter("userid");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String lastname = request.getParameter("lastname");
		PrintWriter out = null;
		out = response.getWriter();
		out.println("<!DOCTYPE html> "
				+ "<html lang=\"es\">"
				+ "<head>"
				+ "<title>Clase3 - Respuesta</title>"
				+ "<meta charset=\"utf-8\">"
				+ "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">"
				+ "<link type=\"text/css\" id=\"data-uikit-theme\" rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/uikit/2.27.2/css/uikit.gradient.min.css\">"
				+ "</head>"
				+ "<body> <div class=\"uk-container uk-container-center uk-margin-top uk-margin-large-bottom\">");
		out.println("<dl class=\"uk-description-list-horizontal\"> <dt>Identificacion: </dt><dd>"+ userid);
		out.println("</dd><dt>Nombres: </dt><dd>"+ name);
		out.println("</dd><dt>Apellidos: </dt><dd>"+ lastname);
		out.println("</dd><dt>E-mail: </dt><dd>"+ email);
		out.println("</dd>");
		out.println("</div><script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.4/jquery.min.js\"></script>"
				+ "<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/uikit/2.27.2/js/uikit.min.js\"></script>"
				+ "<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/highlight.js/9.9.0/highlight.min.js\"></script>"
				+ "<script src=\"https://cdnjs.cloudflare.com/ajax/libs/uikit/2.27.2/js/components/datepicker.min.js\"></script>"
				+ "<script src=\"https://cdnjs.cloudflare.com/ajax/libs/uikit/2.27.2/js/components/form-select.min.js\"></script>"
				+ "<script src=\"https://cdnjs.cloudflare.com/ajax/libs/uikit/2.27.2/js/components/accordion.min.js\"></script>"
				+ "</body>");
		out.close();
	}

}
