package Dao;


import java.util.Collection;

import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.stereotype.Component;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;

import model.Category;

@Component
public class MongoUtils {
	private DBCollection myCollection;
	private int i;
	DB db;
	MongoDbFactory factory;

	public MongoUtils(MongoDbFactory factory){
		db=factory.getDb();
		 myCollection = db.getCollection("doctors");
		
	}
	public void insertCategory(Category category){
		BasicDBObject object =new BasicDBObject();
		object.put("name",category.getName());
		object.put("spec",category.getSpec());
		myCollection.insert(object);
	}
		
		
public Collection<Category> getAllDoctors(){
	myCollection=db.getCollection("doctors");
	return (Collection<Category>) myCollection;
	}
		
		}
	
		
		
		
	


