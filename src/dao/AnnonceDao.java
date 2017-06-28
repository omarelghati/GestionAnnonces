package dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Annonce;

public class AnnonceDao {

	public static int inserer(Annonce annonce) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("unite1");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(annonce);
		em.getTransaction().commit();
		return 0;
	}

	public static List<Annonce> select() {

		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("unite1");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Annonce> querry = em.createQuery("SELECT c FROM Annonce c ",
				Annonce.class);
		List<Annonce> annonces = querry.getResultList();
		em.getTransaction().commit();
		return annonces;
	}

	public static Annonce select1(int id) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("unite1");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Annonce an = em.find(Annonce.class, id);
		em.getTransaction().commit();
		return an;
	}
	
	public static void supprimer(int id) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("unite1");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.createQuery("DELETE  FROM Annonce c WHERE c.idA="+id).executeUpdate();
		em.getTransaction().commit();

	}
	
	public static ArrayList<Annonce> selectmod(String email,int start) {

		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("unite1");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Annonce> querry = em.createQuery(
				"SELECT c FROM Annonce c JOIN c.membre m WHERE m.email='"+email+"'",
				Annonce.class).setFirstResult(start).setMaxResults(5);
		
		List<Annonce> annoncess = querry.getResultList();
		ArrayList<Annonce> annonces = new ArrayList<Annonce>();

		Iterator it = annoncess.iterator();

		while (it.hasNext()) {
			annonces.add((Annonce) it.next());
		}
		return annonces;
	}

	public static long selectid() {

		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("unite1");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Annonce> querry = em.createQuery(
				"SELECT c FROM Annonce c ORDER BY c.idA DESC", Annonce.class);
		List<Annonce> annonces = querry.getResultList();
		long last = annonces.get(0).getIdA();
		System.out.println(annonces.get(0).getIdA());
		em.getTransaction().commit();
		return last;

	}

	public static int nbr_annonce() {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("unite1");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Annonce> querry = em.createQuery("SELECT c FROM Annonce c ",
				Annonce.class);
		List<Annonce> annonces = querry.getResultList();
		em.getTransaction().commit();
		return annonces.size();

	}

	public static ArrayList<Annonce> select5(int start) {

		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("unite1");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Annonce> querry = em
				.createQuery("SELECT c FROM Annonce c ", Annonce.class)
				.setFirstResult(start).setMaxResults(5);

		List<Annonce> annoncess = querry.getResultList();
		ArrayList<Annonce> annonces = new ArrayList<Annonce>();
		Iterator it = annoncess.iterator();

		while (it.hasNext()) {
			annonces.add((Annonce) it.next());
		}

		em.getTransaction().commit();
		return annonces;
	}

	public static ArrayList<Annonce> selectT(String titre) {

		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("unite1");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Annonce> querry = em.createQuery(
				"SELECT c FROM Annonce c WHERE c.titre='" + titre+"'",
				Annonce.class);
		
		List<Annonce> annoncess = querry.getResultList();
		ArrayList<Annonce> annonces = new ArrayList<Annonce>();

		Iterator it = annoncess.iterator();

		while (it.hasNext()) {
			annonces.add((Annonce) it.next());
		}

		em.getTransaction().commit();
		return annonces;
	}

	public static ArrayList<Annonce> selectV(String ville) {

		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("unite1");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Annonce> querry = em.createQuery(
				"SELECT c FROM Annonce c WHERE c.ville='" + ville + "'",
				Annonce.class);
		List<Annonce> annoncess = querry.getResultList();

		ArrayList<Annonce> annonces = new ArrayList<Annonce>();
		Iterator it = annoncess.iterator();
		while (it.hasNext()) {
			annonces.add((Annonce) it.next());
		}

		em.getTransaction().commit();
		return annonces;
	}

	public static ArrayList<Annonce> selectC(String categorie) {

		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("unite1");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Annonce> querry = em.createQuery(
				"SELECT c FROM Annonce c WHERE c.cathegorie='" + categorie
						+ "'", Annonce.class);
		List<Annonce> annoncess = querry.getResultList();

		ArrayList<Annonce> annonces = new ArrayList<Annonce>();
		Iterator it = annoncess.iterator();

		while (it.hasNext()) {
			annonces.add((Annonce) it.next());
		}

		em.getTransaction().commit();
		return annonces;
	}

}
