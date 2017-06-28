package controler;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Admin;

@SuppressWarnings("serial")
public class Supprime_Annonce extends HttpServlet{
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String id=req.getParameter("id");
		int idi=Integer.parseInt(id);
		dao.AnnonceDao.supprimer(idi);
		File f = new File("C:\\Users\\Marouane\\workspacejee\\Projet Annonces ENSA\\WebContent\\pages\\image\\"+idi+".png");
		f.delete();
		HttpSession session= req.getSession();
		String s=(String)session.getAttribute("email");
		if (s== null)
		{s="";}
		Admin admin=dao.AdminDao.SelectA(s);
		if (admin == null)
		{
		req.getRequestDispatcher("ModAnnonce").forward(req, resp);
		}
		else{req.getRequestDispatcher("toffres").forward(req, resp); }
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}

}
