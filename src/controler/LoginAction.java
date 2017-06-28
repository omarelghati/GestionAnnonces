package controler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Admin;
import model.Membre;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import view.LoginForm;
import dao.AdminDao;
import dao.MembreDao;

public class LoginAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		LoginForm loginform= (LoginForm) form;
		Membre membre = MembreDao.select(loginform.getEmail());
		if (membre != null){
		HttpSession session = request.getSession();
		session.setAttribute("email", membre.getEmail());
		session.setAttribute("nom", membre.getNom());
		session.setAttribute("prenom", membre.getPrenom());
	return mapping.findForward("acceuil_auth");}
		else {Admin admin = AdminDao.SelectA(loginform.getEmail());
		      HttpSession session = request.getSession();
		      session.setAttribute("email", admin.getEmail());
		      session.setAttribute("nom", admin.getNom());
		      session.setAttribute("prenom", admin.getPrenom());
		      return mapping.findForward("acceuil_admin");
		      }
	}
}
