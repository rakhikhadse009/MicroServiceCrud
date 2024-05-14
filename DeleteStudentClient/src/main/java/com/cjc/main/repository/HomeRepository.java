package com.cjc.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Student;

import jakarta.transaction.Transactional;

@Repository
public interface HomeRepository extends CrudRepository<Student, Integer>{

	@Transactional
	@Modifying
	@Query("delete from Student where id=:id")
	public void findById(int id);
}
