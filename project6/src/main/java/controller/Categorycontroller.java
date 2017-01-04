package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.DBCursor;

import model.Category;
import service.Categoryservice;

@RestController
@RequestMapping("/category")
public class Categorycontroller {
	
	@Autowired
	private Categoryservice c;

	
@RequestMapping(method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	public String insertCategory(@RequestBody Category category){
		c.insertCategory(category);
		return "khyati";
		
	

}
@RequestMapping(value="/ALL" ,method=RequestMethod.GET ,consumes=MediaType.APPLICATION_JSON_VALUE)
public DBCursor getAllDoctors(){
	
	return c.getAllDoctors();
	

}
}