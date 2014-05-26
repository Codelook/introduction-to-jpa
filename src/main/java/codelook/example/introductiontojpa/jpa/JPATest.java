package codelook.example.introductiontojpa.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPATest {

	public void performJPA() {

		// Creating objects representing some products
		Product product1 = new Product();
		product1.setId(1);
		product1.setName("Tennis racket");

		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Guitar");

		// Connecting to the database through EntityManagerFactory
		// connection details loaded from persistence.xml
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-test");

		EntityManager em = emf.createEntityManager();

		// Creating a new transaction
		EntityTransaction tx = em.getTransaction();

		tx.begin();

		// Persisting the product entity objects
		em.persist(product1);
		em.persist(product2);

		tx.commit();

		// Querying the contents of the database using JPQL query
		Query q = em.createQuery("SELECT p FROM Product p");

		@SuppressWarnings("unchecked")
		List<Product> results = q.getResultList();

		System.out.println("List of products\n----------------");

		for (Product p : results) {

			System.out.println(p.getName() + " (id=" + p.getId() + ")");
		}

		// Closing connection
		em.close();

		emf.close();
	}
}