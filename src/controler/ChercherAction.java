package controler;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Annonce;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import view.ChercherForm;

public class ChercherAction extends Action {

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
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		

		int n = 0;
		ChercherForm cf = (ChercherForm) form;
		
        System.out.println(cf.getTitre());
        System.out.println(cf.getCategorie());
        System.out.println(cf.getVille());
        System.out.println(request.getParameter("page"));

        /** Numero du page par défaut **/
		int start = 0;
		int pg = 1;
		Integer page;
		/** Récupérer le nbre du page **/
		try {
			//page = Integer.parseInt(request.getParameter("page"));
		} catch (NumberFormatException e) {
			page = 1;
		}
		page=1;
		if (page != null && page.intValue() > 0) {
			pg = page.intValue();
			start = (pg - 1) * 5;
		}

		ArrayList<Annonce> annonces = new ArrayList<Annonce>();

		     if (!cf.getTitre().equals("") ) {
			annonces = dao.AnnonceDao.selectT(cf.getTitre());
			n = annonces.size();
		} else {
			if (!cf.getCategorie().equals("choix")) {
				annonces = dao.AnnonceDao.selectC(cf.getCategorie());
				n = annonces.size();
			} else {
				if (!cf.getVille().equals("choisir")) {
					annonces = dao.AnnonceDao.selectV(cf.getVille());
					n = annonces.size();
				} else {
					n = dao.AnnonceDao.nbr_annonce();
					annonces = dao.AnnonceDao.select5(start);
				}
			}
		}
      
		
		HttpSession session = request.getSession();
		session.setAttribute("annonces", annonces);
		session.setAttribute("n", n);
		Integer nbre_pg = nb_pg(n);
		session.setAttribute("nbre_pg", nbre_pg);
		// request.getRequestDispatcher("pages/Tout_Offres.jsp").forward(request,
		// response);
		return mapping.findForward("repond");

	}
}
