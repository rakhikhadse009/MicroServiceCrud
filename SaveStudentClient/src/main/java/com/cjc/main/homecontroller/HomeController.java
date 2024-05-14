package com.cjc.main.homecontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;
import com.cjc.main.serviceI.ServiceI;

@RestController
public class HomeController {

	@Autowired 
	ServiceI si;
	
	@PostMapping("/postStudentData")
	public Student postData(@RequestBody Student s)
	{
		Student stu=si.saveStudentData(s);
		return stu;
	}
	
}
