package view;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

@SuppressWarnings("serial")
public class InscriptionForm extends ActionForm {
	String nom;
	String prenom;
	String mdp;
	String vmdp;
	String email;
	String telephone;

	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		if (this.nom == null || this.nom.equals("")) {
			errors.add("nom", new ActionMessage("msg.required"));
		}
		if (this.prenom == null || this.prenom.equals("")) {
			errors.add("prenom", new ActionMessage("msg.required"));
		}
		if (this.mdp == null || this.mdp.equals("")) {
			errors.add("pass", new ActionMessage("msg.required"));
		}
		if (this.vmdp == null || this.vmdp.equals("")) {
			errors.add("vpass", new ActionMessage("msg.required"));
		} 
		else {if(!this.mdp.equals(this.vmdp))
			errors.add("vpass", new ActionMessage("pmsg.required"));}
		if (this.telephone == null || this.telephone.equals("")) {
			errors.add("tel", new ActionMessage("msg.required"));
		} 
		else{ 
			if(!this.telephone.matches("^0[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]$") )
				errors.add("tel", new ActionMessage("tmsg.required"));
			}
		if (this.email == null || this.email.equals("")) {
			errors.add("email", new ActionMessage("msg.required"));
		}
		else {
			if (!this.email
					.matches("([^.@ ]+)(\\.[^.@ ]+)*@([^.@ ]+\\.)+([^.@ ]+)")) {
				errors.add("email", new ActionMessage("email.required"));
			} 
			else {if(dao.MembreDao.select(this.email)!=null){
				errors.add("email", new ActionMessage("eemail.required"));
			}
			}
		}
		return errors;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getVmdp() {
		return vmdp;
	}

	public void setVmdp(String vmdp) {
		this.vmdp = vmdp;
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

	public InscriptionForm(String nom, String prenom, String mdp, String vmdp,
			String email, String telephone) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.mdp = mdp;
		this.vmdp = vmdp;
		this.email = email;
		this.telephone = telephone;
	}

	public InscriptionForm() {
		super();
	}

}
