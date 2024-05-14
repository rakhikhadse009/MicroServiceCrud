package com.cjc.main.serviceimpl;

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
	public Student updateStudentData(int id) {
	
		return hrep.findById(id);
	}

	@Override
	public Student saveData(Student stu) {
	
		return hrep.save(stu);
	}

	
}
