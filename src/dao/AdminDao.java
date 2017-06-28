package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Admin;

public class AdminDao {
	public static Admin SelectA(String email) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("unite1");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Admin admin = new Admin();
		admin = em.find(Admin.class, email);
		em.getTransaction().commit();
		return admin;
	}
	public static List<Admin> SelectAll() {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("unite1");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Admin> querry = em.createQuery("SELECT c FROM Admin c ",Admin.class );
		List<Admin> admins  = querry.getResultList();
		em.getTransaction().commit();
        return admins;
	}

}
