package com.microservice.springboot2oauthserver.repository;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.microservice.springboot2oauthserver.entity.User;

@Repository
@Transactional 
public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
