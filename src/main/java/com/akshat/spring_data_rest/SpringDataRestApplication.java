package com.akshat.spring_data_rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestApplication.class, args);

		//This is using the Spring Data REST API to perform CRUD operations on the JobPost entity.
		//The Spring Data REST API is a powerful tool that allows you to quickly and easily create a RESTful API for your data model.
		//It provides a set of default endpoints for performing CRUD operations on your entities, as well as the ability to customize these endpoints to suit your needs.
		//In this example, we have created a JobPost entity with various attributes such as postId, postProfile, postDesc, reqExperience, and postTechStack.
		//We have also created a JobRepo interface that extends the JpaRepository interface provided by Spring Data JPA.
		//This interface provides methods for performing CRUD operations on the JobPost entity, such as save, findById, findAll, delete, and deleteById.
		//By simply creating the JobPost entity and the JobRepo interface, we can quickly and easily create a RESTful API for our data model.
		//We do not need to create any controller classes or write any custom endpoints, as the Spring Data REST API handles all of this for us.
		//This allows us to focus on building our data model and business logic, rather than worrying about the details of creating a RESTful API.
		//There is no need of any service class as well.

		//Internally, the Spring Data REST API uses Spring Data JPA to interact with the database and perform CRUD operations on the entities.
		//It also provides support for pagination, sorting, filtering, and other common features of a RESTful API.
	}

}
