package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.DBCursor;

import Dao.MongoUtils;
import model.Category;

@Service
public class Categoryservice {

@Autowired
private MongoUtils m;
	
	public void insertCategory(Category category){
		m.insertCategory(category);
		
	}
		
	public DBCursor getAllDoctors(){
		return m.getAllDoctors();
		
			
		}
	
	


}
