package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Categoria;

public class CriarCategoria {
	public static void main(String[] args) {
		
		EntityManagerFactory  emf = Persistence.createEntityManagerFactory("proj_ifrn");
		EntityManager em = emf.createEntityManager();
		
		Categoria categoria1 = new Categoria("Tecnologia na educação", "Usando tecnologia para educação");
		
		em.getTransaction().begin();
		em.persist(categoria1);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
