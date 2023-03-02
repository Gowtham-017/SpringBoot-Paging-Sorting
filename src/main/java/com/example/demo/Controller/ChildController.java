package com.example.demo.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Entity.Child;
import com.example.demo.Service.ChildService;



@RestController
public class ChildController {
	@Autowired
	ChildService s;
	
	@GetMapping("/getchild")
	public List<Child> showDetail(){
		return s.getDetail();
	}
	
	@PostMapping("/postchild")
	public String addDetail(@RequestBody Child t) {
		s.add(t);
		return "Added details";
	}
	
	//sorting
	@GetMapping("/child/{file}")
	public List<Child> getWithSort(@PathVariable String file){
		return s.getSort(file);
	}
	
	//pagination
	@GetMapping("/child/{offset}/{pageSize}")
	public List<Child> employeeWithPaging(@PathVariable int offset,@PathVariable int pageSize){
		return s.getPaging(offset, pageSize);
	}

}
