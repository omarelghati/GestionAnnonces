package controler;



import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Admin;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import utils.SendMail;
import view.ContactForm_auth;
import dao.AdminDao;

public class ContactAction_auth extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ContactForm_auth contact = (ContactForm_auth)form;
		List<Admin> admins = AdminDao.SelectAll();
		ArrayList<String> sendTo =new ArrayList<String>();
		for (Admin s : admins) {
			sendTo.add(s.getEmail());
		}
		
	SendMail S = new SendMail("marouane.tekken@gmail.com", "marouane007", sendTo, null, "demande de contact", "name : "+contact.getNom()+"\ntel : "+contact.getTelephone()+"\nemail : "+contact.getEmail()+"\n\n\n"+contact.getSujet()+"\n");
	S.sendMail();
		return mapping.findForward("msg_envoyer_auth");
	}
	

}
