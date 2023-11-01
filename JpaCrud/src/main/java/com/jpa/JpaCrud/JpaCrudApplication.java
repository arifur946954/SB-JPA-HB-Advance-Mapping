package com.jpa.JpaCrud;

import com.jpa.JpaCrud.dao.AppDao;
import com.jpa.JpaCrud.entity.Instructor;
import com.jpa.JpaCrud.entity.InstructorDetails;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaCrudApplication {
	//this is test

	public static void main(String[] args) {
		SpringApplication.run(JpaCrudApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(AppDao appDao){
		return  runner->{
		//createConstructor(appDao);
			//findInstructor(appDao);
			deleteInstructor(appDao);
		};
	}

	private void deleteInstructor(AppDao appDao) {
		int theId=1;
		appDao.deleteInstructorById(theId);
	}

	private void findInstructor(AppDao appDao) {
		int theId=1;
	Instructor tempInsTructor=	appDao.findInstructorById(theId);
		System.out.println(tempInsTructor);
		System.out.println(tempInsTructor.getInstructorDetails());
	}

	private void createConstructor(AppDao appDao) {
		Instructor tempInstructor=new Instructor("Zarifur","Rahman","zarid@gmail.com");
		InstructorDetails tempInstructorDetails=new InstructorDetails("zarif@youtube.com","playing");
		//associate the obj
		tempInstructor.setInstructorDetails(tempInstructorDetails);
		System.out.println(tempInstructor);
		appDao.save(tempInstructor);


		System.out.println("done");
		//save the instructor details
	}

}
