package view;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class ContactForm extends ActionForm {

	private static final long serialVersionUID = 1L;
	String nom;
	String email;
	String telephone;
	String sujet;

	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {

		ActionErrors errors = new ActionErrors();
		if (this.nom == null || this.nom.equals("")) {
			errors.add("nom", new ActionMessage("msg.required"));
		}
		if (this.nom == null || this.nom.equals("")) {
			errors.add("sujet", new ActionMessage("msg.required"));
		}
		if (this.telephone == null || this.telephone.equals("")) {
			errors.add("telephone", new ActionMessage("msg.required"));
		} else {
			if (!this.telephone
					.matches("^0[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]$"))
				errors.add("telephone", new ActionMessage("tmsg.required"));
		}
		if (this.email == null || this.email.equals("")) {
			errors.add("email", new ActionMessage("msg.required"));
		} else {
			if (!this.email
					.matches("([^.@ ]+)(\\.[^.@ ]+)*@([^.@ ]+\\.)+([^.@ ]+)")) {
				errors.add("email", new ActionMessage("email.required"));
			}
		}
		if (this.sujet == null || this.sujet.equals("")) {
			errors.add("sujet", new ActionMessage("msg.required"));
		}
		return errors;

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getSujet() {
		return sujet;
	}

	public void setSujet(String sujet) {
		this.sujet = sujet;
	}

	public ContactForm(String nom, String email, String telephone, String sujet) {
		super();
		this.nom = nom;
		this.email = email;
		this.telephone = telephone;
		this.sujet = sujet;
	}

	public ContactForm() {
		super();
	}
	

}
