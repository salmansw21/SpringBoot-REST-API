Spring Boot CRUD REST API

A simple CRUD REST API built with **Spring Boot, Hibernate/JPA, and MySQL**.

Technologies

* Java
* Spring Boot
* Hibernate / JPA
* MySQL
* Maven
* Postman
* Eclipse

Features

* Create user
* Get all users
* Get user by ID
* Update user
* Delete user
* Automatic database creation
* Automatic table creation using Entity
* Sample data using `data.sql`

Clone the Project
For clonning, git must be installed on your system and run the following command in command prompt opened in your desired working directory.

git clone https://github.com/salmansw21/SpringBoot-REST-API


Open the cloned project in Eclipse or any other IDE:


File → Import → Maven → Existing Maven Projects


Select the project and finish the import.

Database Setup

Make sure **MySQL is running**.

Update your MySQL username and password.

Default

Username : root

Password : root


The database will be created automatically if it does not exist. Hibernate will create the required table from the Entity class, and `data.sql` will insert the sample data.

Run the Application

Run the main Spring Boot application class from Eclipse.

The API will normally run on:

http://localhost:8080


Use **Postman** to send JSON requests and test the API.

Notes

* MySQL must be running.
* Update the database credentials before running.
* No manual database or table creation is required.
* `data.sql` contains sample data for testing.

Contact

If you face any problem while setting up or running the project, feel free to contact me:

Email: salmansw21@gmail.com
