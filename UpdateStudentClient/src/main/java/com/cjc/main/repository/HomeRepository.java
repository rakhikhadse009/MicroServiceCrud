package com.cjc.main.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Student;

@Repository
public interface HomeRepository extends CrudRepository<Student, Integer>{

	@Query("from Student where id=:id")
	public Student findById(int id);
}
