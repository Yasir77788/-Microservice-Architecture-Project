package com.fdmgroup.beach_project.user_service.repository;

import com.fdmgroup.beach_project.user_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u WHERE userId = :userId")
    User findByUserId(@Param("userId")Long userId);
}
