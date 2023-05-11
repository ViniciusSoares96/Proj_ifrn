package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Aluno;

public class CriarAluno {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proj_ifrn"); 
		EntityManager em = emf.createEntityManager();
		
		Aluno aluno1 = new Aluno("Lucas Nithael","LucasNithael@escolar");
		
		em.getTransaction().begin();
		em.persist(aluno1);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
}
