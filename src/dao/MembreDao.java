package dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Membre;

public class MembreDao {
	
	public static int inserer(Membre membre) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("unite1");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(membre);
		em.getTransaction().commit();
		return 0;
	}

	public static Membre select(String email) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("unite1");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Membre membre = em.find(Membre.class, email);
		em.getTransaction().commit();
		return membre;
	}

	public static void supprimer(String email) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("unite1");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.createQuery("DELETE FROM Membre m WHERE m.email='" + email + "'")
				.executeUpdate();
		em.getTransaction().commit();

	}

	public static ArrayList<Membre> select(int start) {

		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("unite1");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Membre> querry = em
				.createQuery("SELECT m FROM Membre m ", Membre.class)
				.setFirstResult(start).setMaxResults(5);
		List<Membre> memberss = querry.getResultList();
		ArrayList<Membre> members = new ArrayList<Membre>();

		Iterator it = memberss.iterator();

		while (it.hasNext()) {
			members.add((Membre) it.next());
		}

		em.getTransaction().commit();
		return members;
	}

}
