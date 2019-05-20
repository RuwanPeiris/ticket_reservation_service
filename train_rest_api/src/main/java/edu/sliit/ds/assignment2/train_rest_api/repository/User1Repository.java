package edu.sliit.ds.assignment2.train_rest_api.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import edu.sliit.ds.assignment2.train_rest_api.model.User1;

@Repository
public interface User1Repository extends MongoRepository<User1,String>{

	User1 findByUser1NameAndPass(String user1Name, String pass);

}
