package Repository;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.data.mongodb.repository.MongoRepository;
import Entity.Course;

public interface College extends MongoRepository<Course, String> {
	
	@Resource
	Course on19;
	
	List<Course> courses = new List(new Course());
	
	ArrayList<Course> [] 
	
}
