package view;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.upload.FormFile;

import utils.Utils;

@SuppressWarnings("serial")
public class Deposer_AnnonceForm extends ActionForm {
	String titre;
	String ville;
	String cathegorie;
	String description;
	String prix;
	private FormFile image;

	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {

		ActionErrors errors = new ActionErrors();
		if (this.titre == null || this.titre.equals("")) {
			errors.add("titre", new ActionMessage("msg.required"));
		}
		if (this.description == null || this.description.equals(" ")) {
			errors.add("description", new ActionMessage("msg.required"));
		}
		if (this.cathegorie == null || this.cathegorie.equals("choix")) {
			errors.add("cathegorie", new ActionMessage("msg.required"));
		}
		if (this.ville == null || this.ville.equals("choisir")) {
			errors.add("ville", new ActionMessage("msg.required"));
		}
		String fileName = image.getFileName();

		if (image == null || fileName.equals("")) {
			errors.add("file", new ActionMessage("msg.required"));
		}

		if (!Utils.testImage(fileName)) {
			errors.add("file", new ActionMessage("nimsg.required"));
		}
		try {
			Integer.parseInt(this.prix);
		} catch (Exception e) {
			errors.add("prix", new ActionMessage("pmsg.required"));
		}

		return errors;
	}

	public Deposer_AnnonceForm() {
		super();
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getCathegorie() {
		return cathegorie;
	}

	public void setCathegorie(String cathegorie) {
		this.cathegorie = cathegorie;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrix() {
		return prix;
	}

	public void setPrix(String prix) {
		this.prix = prix;
	}

	public FormFile getImage() {
		return image;
	}

	public void setImage(FormFile image) {
		this.image = image;
	}

	public Deposer_AnnonceForm(String titre, String ville, String cathegorie,
			String description, String prix, FormFile image) {
		super();
		this.titre = titre;
		this.ville = ville;
		this.cathegorie = cathegorie;
		this.description = description;
		this.prix = prix;
		this.image = image;
	}

}
