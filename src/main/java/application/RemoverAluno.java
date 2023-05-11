package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Aluno;

public class RemoverAluno {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proj_ifrn");
		EntityManager em = emf.createEntityManager();
		
		Aluno aluno = em.find(Aluno.class,6L);
		
		if (aluno != null) {
			em.getTransaction().begin();
			em.remove(aluno);
			em.getTransaction().commit();
		}
		
		
		em.close();
		emf.close();
	}
}
