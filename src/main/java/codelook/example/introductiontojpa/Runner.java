package codelook.example.introductiontojpa;

import codelook.example.introductiontojpa.jdbc.JDBCTest;
import codelook.example.introductiontojpa.jpa.JPATest;

public class Runner {

	public static void main(String[] args) throws Exception {

		try {

			if (args.length < 1) {

				throw new IllegalArgumentException();
			}

			final String EXAMPLE_TYPE = args[0];

			if (EXAMPLE_TYPE.equals("jdbc")) {

				System.out.println("Running JDBC example...\n\n");

				JDBCTest jdbcTest = new JDBCTest();

				jdbcTest.performJDBC();
			}
			else if (EXAMPLE_TYPE.equals("jpa")) {

				System.out.println("Running JPA example...\n\n");

				JPATest jpaTest = new JPATest();

				jpaTest.performJPA();
			}
			else {

				throw new IllegalArgumentException();
			}
		}
		catch(IllegalArgumentException e) {

			System.out.println("Please specify one of the following arguments to run the examples: jdbc jpa");
		}
	}
}