package com.cjc.main.homecontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.cjc.main.model.Student;
import com.cjc.main.serviceI.ServiceI;

@RestController
public class HomeController {

	@Autowired 
	ServiceI si;
	
	@GetMapping("/deleteStudentData/{id}")
	public void deleteData(@PathVariable int id)
	{
		si.deleteStudentData(id);
		
	}
	
}
