package controler;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Annonce;
import model.Membre;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

import view.Deposer_AnnonceForm;

public class Deposer_AnnonceAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		int P = 0;
		Deposer_AnnonceForm af = (Deposer_AnnonceForm) form;
		HttpSession session = request.getSession();
		Membre membre = dao.MembreDao.select((String) session
				.getAttribute("email"));
		try {
			P = Integer.parseInt(af.getPrix());
		} catch (Exception e) {
			e.printStackTrace();
		}
		Annonce annonce = new Annonce(0, af.getTitre(), af.getVille(),
				af.getCathegorie(), af.getDescription(), P, true, new Date(),
				membre);
		dao.AnnonceDao.inserer(annonce);
		
	    long nbr_sequence = dao.AnnonceDao.selectid();
		
		FormFile file = af.getImage();

		String filePath = "C:\\Users\\Malaoui\\workspace1\\ProjetStruts\\WebContent\\pages\\image";

		File folder = new File(filePath);
		if (!folder.exists()) {
			folder.mkdir();
		}

		String fileName = nbr_sequence + ".jpg";
				//+ Utils.getFileExtension(file.getFileName());

		if (!("").equals(fileName)) {

			File newFile = new File(filePath, fileName);

			if (!newFile.exists()) {
				FileOutputStream fos = new FileOutputStream(newFile);
				fos.write(file.getFileData());
				fos.flush();
				fos.close();
			}

			request.setAttribute("uploadedFilePath", newFile.getAbsoluteFile());
			request.setAttribute("uploadedFileName", newFile.getName());
		}
	

		return mapping.findForward("annonce_deposer");
	}
}
