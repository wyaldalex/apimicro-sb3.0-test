package com.tudux.apimicro.repository;

import com.tudux.apimicro.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
