package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Aluno;

public class ObterAluno {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proj_ifrn");
		EntityManager em = emf.createEntityManager();
		
		Aluno aluno1 = em.find(Aluno.class, 4L);
		
		System.out.println(aluno1.getNome());
		em.close();
		emf.close();
	}
}
