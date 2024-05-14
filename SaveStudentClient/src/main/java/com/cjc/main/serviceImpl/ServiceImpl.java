package com.cjc.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Student;
import com.cjc.main.repository.HomeRepository;
import com.cjc.main.serviceI.ServiceI;

@Service
public class ServiceImpl implements ServiceI{
	
	@Autowired
	HomeRepository hrep;

	@Override
	public Student saveStudentData(Student s) {
		
		return hrep.save(s);
	}

}
