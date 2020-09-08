package Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import Entity.Course;

public interface College extends MongoRepository<Course, String> {

}
