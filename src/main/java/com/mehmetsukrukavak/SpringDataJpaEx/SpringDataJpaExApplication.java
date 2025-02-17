package com.mehmetsukrukavak.SpringDataJpaEx;

import com.mehmetsukrukavak.SpringDataJpaEx.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringDataJpaExApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

//		Student student1 = context.getBean(Student.class);
//		Student student2 = context.getBean(Student.class);
//		Student student3 = context.getBean(Student.class);
//
//		student1.setId(101);
//		student1.setName("John Doe");
//		student1.setMarks(78);
//
//		student2.setId(102);
//		student2.setName("Jane Doe");
//		student2.setMarks(96);
//
//		student3.setId(103);
//		student3.setName("Mehmet Şükrü Kavak");
//		student3.setMarks(98);

		//repo.save(student1);
		//repo.save(student2);
		//repo.save(student3);

		//System.out.println(repo.findAll());

		System.out.println(repo.findById(102).orElse(null));


	}

}
