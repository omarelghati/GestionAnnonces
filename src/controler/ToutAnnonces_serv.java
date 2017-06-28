package controler;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Admin;
import model.Annonce;

@SuppressWarnings("serial")
@WebServlet("/tout_offres")
public class ToutAnnonces_serv extends HttpServlet {

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

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		int n = 0;

		/** Numero du page par défaut **/
		int start = 0;
		int pg = 1;
		Integer page;
		/** Récupérer le nbre du page **/
		try {
			page = Integer.parseInt(req.getParameter("page"));
		} catch (NumberFormatException e) {
			page = 1;
		}
		if (page != null && page.intValue() > 0) {
			pg = page.intValue();
			start = (pg - 1) * 5;
		}
		n = dao.AnnonceDao.nbr_annonce();
		ArrayList<Annonce> annonces = dao.AnnonceDao.select5(start);
		HttpSession session = req.getSession();
		session.setAttribute("annonces", annonces);
		session.setAttribute("n", n);
		Integer nbre_pg = nb_pg(n);
		session.setAttribute("nbre_pg", nbre_pg);
		String s=(String)session.getAttribute("email");
		if (s== null)
		{s="";}
		Admin admin=dao.AdminDao.SelectA(s);
		if (admin == null)
		{req.getRequestDispatcher("pages/Tout_Offres.jsp").forward(req, resp);}
		else{req.getRequestDispatcher("pages/Supprimer_annonce.jsp").forward(req, resp);}

	}

}
