package controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Annonce;

/**
 * Servlet implementation class Consultation
 */

public class Consultation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String PARAM_TITRE="titre";   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		HttpSession session=request.getSession();
		Integer id = new Integer(1);
		
		try{
			id=Integer.parseInt(request.getParameter("id"));
		} catch(NullPointerException e){
			id = new Integer(1);
		} catch(NumberFormatException e){
			id = new Integer(1);
		}
		int r=id.intValue();
		 Annonce an =dao.AnnonceDao.select1(r);
		 session.setAttribute("annonce", an);
		 request.getRequestDispatcher("pages/Annonce.jsp").forward(request, response);
		
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
