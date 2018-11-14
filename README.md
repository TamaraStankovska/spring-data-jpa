#  Spring Data Jpa Application

# 1. Description

This project is made using Java Spring Boot framework, with the following dependencies:

- Web;
- JPA;
- H2.

Autoconfiguration is used in the back-end, also known as annotation-based configuration. The models used for this project are: Hero and Power. Hero has the following properties: Long id, String name, String studio and List\&lt;Power\&gt; powers, where Power is of type &quot;enum&quot;.

# 2. Annotations

The annotations that are used for this project are: @Entity, @Id and @GeneratedValue, as well as @Repository and @Controller.

# 3. Configuring H2 Database

H2 provides a web interface called H2 Console to see the data. Enabling is provided in the application.properties.

/src/main/resources/application.properties

After reloading the application, we can launch the Console at  [http://localhost:8080/h2](http://localhost:8080/h2) and to see two tables that are created: Hero and Hero\_Powers\_Table, as well as to fetch the data from the two tables.

# 4. Retrieve data from the database

For example: &quot;Retrieve the hero with the name &#39;Iron Man&#39; from the database&quot;.

![](https://github.com/TamaraStankovska/spring-data-jpa/blob/master/data.PNG)

This can be done with the executing the following query in the Console, or by writing a query in the Application.
