package eu.ensup.demoformation.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import eu.ensup.demoformation.domaine.Formation;

public class FormationDao implements IFormationDao {

	
	public void creerFormation(Formation formation) {
		System.out.println("cr�ation formation");
		// 1 : Ouverture unité de travail JPA
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");
				EntityManager em = emf.createEntityManager();
				
				// 2 : Ouverture transaction 
				EntityTransaction tx =  em.getTransaction();
				tx.begin();
				
				// 3 : Instanciation Objet métier
				
				// 4 : Persistance Objet/Relationnel : création d'un enregistrement en base
				 em.persist(formation);
				
				// 5 : Fermeture transaction 
				 tx.commit();
				
				// 6 : Fermeture unité de travail JPA 
				em.close();
				emf.close();	
	}
}
