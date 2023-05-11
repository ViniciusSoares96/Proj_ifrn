package application;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import entities.Aluno;

public class ObterAlunos {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proj_ifrn");
		EntityManager em = emf.createEntityManager(); 
		
		String jpql = "select a from Aluno a";
		TypedQuery<Aluno> query = em.createQuery(jpql,Aluno.class);
		query.setMaxResults(5);
		
		List<Aluno> alunos = query.getResultList();
		
		for (Aluno aluno : alunos) {
			System.out.println(aluno.getNome());
		}
		
		em.close();
		emf.close();
	}
}
