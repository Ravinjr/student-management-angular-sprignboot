package com.appllication.development.schoolproject.dao;

import com.appllication.development.schoolproject.model.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorDao extends JpaRepository<Instructor,Integer> {
}
