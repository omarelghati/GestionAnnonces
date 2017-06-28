package controler;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Annonce;

@WebServlet("/mod_annonce")
public class Modifier_annonce extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public static int nb_pg(int n) {
		int res;
		int f;
		if (n % 5 == 0) {
			res = n / 5;
		} else {
			f = (int) n / 5;
			res = f + 1;
		}
		return res;
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int n = 0;

		/** Numero du page par défaut **/
		int start = 0;
		int pg = 1;
		Integer page;
		/** Récupérer le nbre du page **/
		try {
			page = Integer.parseInt(request.getParameter("page"));
		} catch (NumberFormatException e) {
			page = 1;
		}
		if (page != null && page.intValue() > 0) {
			pg = page.intValue();
			start = (pg - 1) * 5;
		}
		
		HttpSession session = request.getSession();
		ArrayList<Annonce> annonces= dao.AnnonceDao.selectmod((String)session.getAttribute("email") , start);
		System.out.println("n="+n);
		session.setAttribute("annonces", annonces);
		session.setAttribute("n", n);
		Integer nbre_pg = nb_pg(n);
		session.setAttribute("nbre_pg", nbre_pg);
		request.getRequestDispatcher("pages/Modifier_annonce_auth.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	       doGet(request, response);
	}

}
