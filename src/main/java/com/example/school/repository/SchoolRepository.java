package com.example.school.repository;

import com.example.school.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {
    List<School> findSchoolsByName(String name);

    @Query("SELECT SUM(s.amountStudents) FROM School s")
    Long amountStudents();
}
