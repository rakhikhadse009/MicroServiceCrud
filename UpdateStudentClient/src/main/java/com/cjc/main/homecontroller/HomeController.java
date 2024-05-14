package com.cjc.main.homecontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;
import com.cjc.main.serviceI.ServiceI;

@RestController
public class HomeController {

	@Autowired 
	ServiceI si;
	
	@PutMapping("/updateStudentById/{id}")
	public Student updateData(@PathVariable int id,@RequestBody Student s)
	{
		Student stu=si.updateStudentData(id);
		stu.setName(s.getName());
		stu.setUsername(s.getUsername());
		stu.setPassword(s.getPassword());
		Student updateStudent=si.saveData(stu);
		return updateStudent;
	}
	
}
