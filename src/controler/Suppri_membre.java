package controler;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Membre;

public class Suppri_membre extends HttpServlet {
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
		
		ArrayList<Membre> members = dao.MembreDao.select(start);
		HttpSession session = request.getSession();
		n=members.size();
		session.setAttribute("n", n);
		Integer nbre_pg = nb_pg(n);
		session.setAttribute("nbre_pg", nbre_pg);
		
		session.setAttribute("members", members);
		request.getRequestDispatcher("pages/Supprimer_Membre.jsp").forward(request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
