package org.rinku.Repository;

import java.util.Optional;

import org.rinku.Entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Integer> {
	Optional<User> findByEmail(String Email);
}
