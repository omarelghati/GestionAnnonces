package controler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Membre;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import view.InscriptionForm;

public class InscriptionAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		InscriptionForm inscriptionform = (InscriptionForm) form;
		Membre membre = new Membre(inscriptionform.getNom(),
				inscriptionform.getPrenom(), inscriptionform.getMdp(),
				inscriptionform.getEmail(), inscriptionform.getTelephone(),null);
		dao.MembreDao.inserer(membre);
		return mapping.findForward("inscription_ouv");
	}

}
