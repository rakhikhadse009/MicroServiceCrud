package com.cjc.main.homeController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;
import com.cjc.main.serviceI.ServiceI;

@RestController
public class HomeController {

	@Autowired
	ServiceI si;
	
	@GetMapping("/getStudentData")
	public List<Student> getAllData()
	{
		List<Student> ls=si.getAllData();
		return ls;
	}
}
