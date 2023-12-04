Introduction to JPA - Source code
=================================

This project is the sample code for an article called Introduction to JPA.

This is a Maven project and can be compiled on any computer that
has JDK 7 and Maven installed.

Technical information
---------------------

The project is using Java 1.7 and can be built using Maven. It is using both JDBC and JPA connectivity to perform
database operations. All dependencies are declared in the pom.xml file and can be built using Maven with no
changes.
The project is using a SQLite database to store data.
The JPA provider for this project is [EclipseLink](http://www.eclipse.org/eclipselink).

Download links
--------------

- [JDK 7](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
- [Maven](http://maven.apache.org/download.cgi)

*If you're using Mac OS X Java can be installed from Software Update which will also install Maven*

Building the examples
---------------------

Run the following command in your command prompt from the project directory:

`mvn clean package`

Running the examples
--------------------

Go into the newly created *target* directory and execute the examples application (*introduction-to-jpa-1.0.0-jar-with-dependencies.jar*).
It takes a required command line argument to specify which example (JDBC or JPA) to run.

Issue one of the following commands from your command line:

- To run the JDBC example: `java -jar introduction-to-jpa-runner.jar jdbc`
- To run the JPA example: `java -jar introduction-to-jpa-runner.jar jpa`

*Hint: on Windows you have to use java.exe*

The application will create a new file in the current directory called sample.db
This is a SQLite file that can be opened by any SQLite database manager application if you want to check the newly created database.
