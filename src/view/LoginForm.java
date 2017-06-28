package view;

import javax.servlet.http.HttpServletRequest;

import model.Admin;
import model.Membre;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

@SuppressWarnings("serial")
public class LoginForm extends ActionForm {
	String email;
	String password;

	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {

		ActionErrors errors = new ActionErrors();

		if (this.password == null || this.password.equals("")) {
			errors.add("lemail", new ActionMessage("lmsg.required"));
		} else {
			if (this.email == null || this.email.equals("")) {
				errors.add("lemail", new ActionMessage("lmsg.required"));
			} else {
				if (!this.email
						.matches("([^.@ ]+)(\\.[^.@ ]+)*@([^.@ ]+\\.)+([^.@ ]+)")) {
					errors.add("lemail", new ActionMessage("iemail.required"));
				} else {
					Admin admin = dao.AdminDao.SelectA(this.email);
					Membre membre = dao.MembreDao.select(this.email);
					if (membre == null && admin == null) {
						errors.add("lemail",
								new ActionMessage("iemail.required"));

					} else {
						if (membre != null) {
							if (!membre.getMdp().equals(this.password)) {
								errors.add("lemail", new ActionMessage(
										"iemail.required"));
							}
						} else {
							if (!admin.getMdp().equals(this.password)) {
								errors.add("lemail", new ActionMessage(
										"iemail.required"));
							}
						}

					}
				}
			}
		}
		return errors;
	}

	public LoginForm() {
		super();
	}

	public LoginForm(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
