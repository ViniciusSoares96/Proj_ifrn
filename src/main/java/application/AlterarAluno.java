package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Aluno;

public class AlterarAluno {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proj_ifrn");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		Aluno aluno = em.find(Aluno.class, 1L);
		aluno.setEmail("victorsantos@escolar");
		em.merge(aluno);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
