package com.example.Studentsapp.repository;


        import com.example.Studentsapp.entity.Student;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student ,Integer> {

}
