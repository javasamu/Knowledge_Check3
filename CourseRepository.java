package com.example.Studentsapp.repository;
import com.example.Studentsapp.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository




public interface CourseRepository extends JpaRepository<Course , Integer> {

}
