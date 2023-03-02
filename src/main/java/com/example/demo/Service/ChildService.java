package com.example.demo.Service;


	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.data.domain.Page;
	import org.springframework.data.domain.PageRequest;
	import org.springframework.data.domain.Sort;
	import org.springframework.stereotype.Service;
	import org.springframework.web.bind.annotation.PathVariable;
import com.example.demo.Entity.Child;
import com.example.demo.Repository.ChildRepo;



	@Service
	public class ChildService {
		@Autowired
		ChildRepo e;
		
		//add details
		public String add(Child m) {
			e.save(m);
			return "Added";
		}
		
		//get details
		public List<Child> getDetail(){
			return e.findAll();
		}
				
		//sorting
		public List<Child> getSort(String file){
			return e.findAll(Sort.by(Sort.Direction.ASC,file));
		}
		
		//pagination
		public List<Child> getPaging(@PathVariable int offset,@PathVariable int pageSize){
			Page<Child> page=e.findAll(PageRequest.of(offset, pageSize));
			return page.getContent();
		}
		

	}


