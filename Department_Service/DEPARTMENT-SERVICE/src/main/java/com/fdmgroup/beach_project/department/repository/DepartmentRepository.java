package com.fdmgroup.beach_project.department.repository;

import com.fdmgroup.beach_project.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository <Department, Long> {

//    @Query("SELECT d FROM Department d WHERE departmentId = :departmentId")
//    Department findByDepartmentId(@Param("departmentId") Long departmentId);
   // @Query("SELECT d FROM Department d WHERE departmentId = :departmentId")
    Department findByDepartmentId(Long departmentId);

}
