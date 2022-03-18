package com.irostub.userservice.repository;

import com.irostub.userservice.entity.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Users, Long> {

}
